package com.hifun.soul.gameserver.skill.effect;

import java.util.List;

import com.hifun.soul.common.constants.SharedConstants;
import com.hifun.soul.gameserver.battle.Battle;
import com.hifun.soul.gameserver.battle.BattleCalculator;
import com.hifun.soul.gameserver.battle.IBattleUnit;
import com.hifun.soul.gameserver.battle.context.IBattleContext;
import com.hifun.soul.gameserver.battle.gem.EnergyType;
import com.hifun.soul.gameserver.battle.gem.GemPosition;
import com.hifun.soul.gameserver.battle.gem.MagicSlotInfo;
import com.hifun.soul.gameserver.battle.msg.ChessBoardSnap;
import com.hifun.soul.gameserver.skill.EffectResult;
import com.hifun.soul.gameserver.skill.ISkill;
import com.hifun.soul.gameserver.skill.msg.GCBattleHpChanged;
import com.hifun.soul.gameserver.skill.msg.GCBattleMagicChanged;

/**
 * 魔法伤害;<br>
 * 直接造成xx%技能伤害, 而且每x个x颜色的宝石造成x%伤害;<br>
 * params[0] = 直接伤害比率;<br>
 * params[1] = 能量类型;<br>
 * params[2] = 单位能量;<br>
 * params[3] = 单位伤害;<br>
 * params[4] = 是否消耗指定的能量;<br>
 * 
 * @author crazyjohn
 * 
 */
public class MagicDamageRateEffector extends AbstractDamageEffector {

	@Override
	protected EffectResult doEffect(IBattleUnit attacker, IBattleUnit target,
			ISkill skill, int[] params, int combo, List<ChessBoardSnap> snaps,
			GemPosition selectedGem) {
		// 直接伤害比率
		int damageRate = params[0];
		// 能量类型
		int energy = params[1];
		EnergyType energyType = EnergyType.typeOf(energy);
		if (energyType == null) {
			return null;
		}
		int perCount = params[2];
		int perDamageRate = params[3];
		// 是否消耗指定的能量;
		// TODO:搞成枚举		
		boolean isCost = params[4] == 1;
		//System.out.println("params[4]="+params[4]);
		IBattleContext context = attacker.getBattleContext();
		if (context == null) {
			return null;
		}
		Battle battle = context.getBattle();
		if (battle == null) {
			return null;
		}
		MagicSlotInfo slot = null;
		for (MagicSlotInfo each : attacker.getAllMagicSlots()) {
			if (each.getEnergyType() == energy) {
				slot = each;
				break;
			}
		}
		if (slot == null) {
			return null;
		}
		int addDamage = slot.getCurrentSize() / perCount * perDamageRate;
		// 计算技能伤害
		EffectResult result = BattleCalculator.calculateSkillFinalDamage(true,
				attacker, target, (damageRate)
						/ SharedConstants.PROPERTY_DIVISOR, addDamage);
		// 受击者掉血
		int hp = target.getBattleContext().getBattleProperty().getHp()
				- result.getFinalDamage();
		target.getBattleContext().getBattleProperty().setHp(hp);

		// 发送血量变化
		GCBattleHpChanged hpChangeMsg = new GCBattleHpChanged();
		hpChangeMsg.setTargetId(target.getUnitGuid());
		hpChangeMsg.setChangeHp(result.getFinalDamage());
		battle.broadcastToBattleUnits(hpChangeMsg);
		//System.out.println("isCost："+isCost);
		// 是否消耗指定能量;
		if (isCost) {			
			// 魔法设置为0;
			slot.setCurrentSize(0);
			// 发送魔法变化
			GCBattleMagicChanged magicChangeMsg = new GCBattleMagicChanged();
			magicChangeMsg.setTargetId(attacker.getUnitGuid());
			magicChangeMsg.setTargetMagicChange(attacker.getCurrentMagicSnap());
			battle.broadcastToBattleUnits(magicChangeMsg);
		}
		return result;
	}

}
