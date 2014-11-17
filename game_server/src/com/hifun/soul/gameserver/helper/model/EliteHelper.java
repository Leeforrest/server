package com.hifun.soul.gameserver.helper.model;

import com.hifun.soul.gameserver.common.GameServerAssist;
import com.hifun.soul.gameserver.elitestage.HumanEliteStageManager;
import com.hifun.soul.gameserver.function.GameFuncType;
import com.hifun.soul.gameserver.helper.HelpStateType;
import com.hifun.soul.gameserver.helper.HelpType;
import com.hifun.soul.gameserver.helper.IHelper;

public class EliteHelper implements IHelper {
	private HumanEliteStageManager manager;
	
	public EliteHelper(HumanEliteStageManager manager) {
		this.manager = manager;
	}
	
	@Override
	public int getHelpType() {
		return HelpType.ELITE.getIndex();
	}

	@Override
	public int getState() {
		// 功能未开放，返回已经结束
		if(!GameServerAssist.getGameFuncService().gameFuncIsOpen(manager.getOwner(), GameFuncType.ELITE, false)){
			return HelpStateType.CLOSED.getIndex();
		}
		// 判断是否有关卡可以打
		else if(manager.getEliteStageStateMap().size() <= 0){
			return HelpStateType.CLOSED.getIndex();
		}
		else{
			for(Integer stageId : manager.getEliteStageStateMap().keySet()){
				if(this.manager.getEliteStageStateMap().containsKey(stageId)){
					if(manager.getEliteStageStateMap().get(stageId).getChallengeState() == false) {
						return HelpStateType.CAN_START.getIndex();
					}
				}
			}
			return HelpStateType.CLOSED.getIndex();
		}
	}

	@Override
	public int getUsedTimes() {
		return 0;
	}

	@Override
	public int getTotalTimes() {
		return 0;
	}

}
