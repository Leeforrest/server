package com.hifun.soul.gameserver.stage.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.GCMessage;

/**
 * 响应点击不完美关卡
 *
 * @author SevenSoul
 */
@Component
public class GCClickUnperfectStage extends GCMessage{
	
	/** 关卡id */
	private int stageId;
	/** 据点关卡信息 */
	private com.hifun.soul.gameserver.stage.model.StageSimpleInfo stageSimpleInfo;
	/** 掉落物品 */
	private com.hifun.soul.gameserver.item.assist.CommonItem item;

	public GCClickUnperfectStage (){
	}
	
	public GCClickUnperfectStage (
			int stageId,
			com.hifun.soul.gameserver.stage.model.StageSimpleInfo stageSimpleInfo,
			com.hifun.soul.gameserver.item.assist.CommonItem item ){
			this.stageId = stageId;
			this.stageSimpleInfo = stageSimpleInfo;
			this.item = item;
	}

	@Override
	protected boolean readImpl() {
		stageId = readInteger();
		stageSimpleInfo = new com.hifun.soul.gameserver.stage.model.StageSimpleInfo();
						stageSimpleInfo.setStageId(readInteger());
						stageSimpleInfo.setX(readInteger());
						stageSimpleInfo.setY(readInteger());
						stageSimpleInfo.setStageName(readString());
						stageSimpleInfo.setStageDesc(readString());
						stageSimpleInfo.setMinLevel(readInteger());
						stageSimpleInfo.setPass(readBoolean());
						stageSimpleInfo.setMonsterIcon(readInteger());
						stageSimpleInfo.setMapId(readInteger());
						stageSimpleInfo.setStar(readInteger());
						stageSimpleInfo.setAutoBattle(readBoolean());
						stageSimpleInfo.setMonsterName(readString());
						stageSimpleInfo.setMonsterLevel(readInteger());
						stageSimpleInfo.setMonsterOccupation(readInteger());
						stageSimpleInfo.setRewardExperience(readInteger());
						stageSimpleInfo.setRewardCurrencyType(readShort());
						stageSimpleInfo.setRewardCurrencyNum(readInteger());
						stageSimpleInfo.setMonsterFirstAttack(readInteger());
				item = new com.hifun.soul.gameserver.item.assist.CommonItem();
						item.setUUID(readString());
						item.setItemId(readInteger());
						item.setName(readString());
						item.setDesc(readString());
						item.setType(readInteger());
						item.setIcon(readInteger());
						item.setRarity(readInteger());
						item.setBind(readInteger());
						item.setOverlapNum(readInteger());
						item.setBagType(readInteger());
						item.setBagIndex(readInteger());
						item.setSellCurrencyType(readShort());
						item.setSellNum(readInteger());
						item.setPosition(readInteger());
						item.setEndure(readInteger());
						item.setEquipHole(readShort());
						item.setEmbedCurrencyType(readShort());
						item.setEmbedCurrencyNum(readInteger());
						item.setExtractCurrencyType(readShort());
						item.setExtractCurrencyNum(readInteger());
						item.setShopCurrencyType(readShort());
						item.setShopCurrencyNum(readInteger());
							{
	int subCountequipBaseAttributes = readShort();
		com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] subListequipBaseAttributes  = com.hifun.soul.core.util.KeyValuePair.newKeyValuePairArray(subCountequipBaseAttributes);
		item.setEquipBaseAttributes(subListequipBaseAttributes);
	for(int jequipBaseAttributes = 0; jequipBaseAttributes < subCountequipBaseAttributes; jequipBaseAttributes++){
						com.hifun.soul.core.util.KeyValuePair<Integer,Integer> objequipBaseAttributes = new com.hifun.soul.core.util.KeyValuePair<Integer,Integer>();
		subListequipBaseAttributes[jequipBaseAttributes] = objequipBaseAttributes;
						objequipBaseAttributes.setKey(readInteger());
								objequipBaseAttributes.setValue(readInteger());
							}
	}
							{
	int subCountequipSpecialAttributes = readShort();
		com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] subListequipSpecialAttributes  = com.hifun.soul.core.util.KeyValuePair.newKeyValuePairArray(subCountequipSpecialAttributes);
		item.setEquipSpecialAttributes(subListequipSpecialAttributes);
	for(int jequipSpecialAttributes = 0; jequipSpecialAttributes < subCountequipSpecialAttributes; jequipSpecialAttributes++){
						com.hifun.soul.core.util.KeyValuePair<Integer,Integer> objequipSpecialAttributes = new com.hifun.soul.core.util.KeyValuePair<Integer,Integer>();
		subListequipSpecialAttributes[jequipSpecialAttributes] = objequipSpecialAttributes;
						objequipSpecialAttributes.setKey(readInteger());
								objequipSpecialAttributes.setValue(readInteger());
							}
	}
							{
	int subCountgemAttributes = readShort();
		com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] subListgemAttributes  = com.hifun.soul.core.util.KeyValuePair.newKeyValuePairArray(subCountgemAttributes);
		item.setGemAttributes(subListgemAttributes);
	for(int jgemAttributes = 0; jgemAttributes < subCountgemAttributes; jgemAttributes++){
						com.hifun.soul.core.util.KeyValuePair<Integer,Integer> objgemAttributes = new com.hifun.soul.core.util.KeyValuePair<Integer,Integer>();
		subListgemAttributes[jgemAttributes] = objgemAttributes;
						objgemAttributes.setKey(readInteger());
								objgemAttributes.setValue(readInteger());
							}
	}
							{
	int subCountequipGemItemInfos = readShort();
		com.hifun.soul.gameserver.item.assist.GemItemInfo[] subListequipGemItemInfos = new com.hifun.soul.gameserver.item.assist.GemItemInfo[subCountequipGemItemInfos];
		item.setEquipGemItemInfos(subListequipGemItemInfos);
	for(int jequipGemItemInfos = 0; jequipGemItemInfos < subCountequipGemItemInfos; jequipGemItemInfos++){
						com.hifun.soul.gameserver.item.assist.GemItemInfo objequipGemItemInfos = new com.hifun.soul.gameserver.item.assist.GemItemInfo();
		subListequipGemItemInfos[jequipGemItemInfos] = objequipGemItemInfos;
						objequipGemItemInfos.setItemId(readInteger());
								objequipGemItemInfos.setIndex(readInteger());
								objequipGemItemInfos.setRarity(readInteger());
									{
	int subCountequipGemAttributes = readShort();
		com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] subListequipGemAttributes  = com.hifun.soul.core.util.KeyValuePair.newKeyValuePairArray(subCountequipGemAttributes);
		objequipGemItemInfos.setEquipGemAttributes(subListequipGemAttributes);
	for(int jequipGemAttributes = 0; jequipGemAttributes < subCountequipGemAttributes; jequipGemAttributes++){
						com.hifun.soul.core.util.KeyValuePair<Integer,Integer> objequipGemAttributes = new com.hifun.soul.core.util.KeyValuePair<Integer,Integer>();
		subListequipGemAttributes[jequipGemAttributes] = objequipGemAttributes;
						objequipGemAttributes.setKey(readInteger());
								objequipGemAttributes.setValue(readInteger());
							}
	}
							}
	}
							{
	int subCountequipUpgradeAttributes = readShort();
		com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] subListequipUpgradeAttributes  = com.hifun.soul.core.util.KeyValuePair.newKeyValuePairArray(subCountequipUpgradeAttributes);
		item.setEquipUpgradeAttributes(subListequipUpgradeAttributes);
	for(int jequipUpgradeAttributes = 0; jequipUpgradeAttributes < subCountequipUpgradeAttributes; jequipUpgradeAttributes++){
						com.hifun.soul.core.util.KeyValuePair<Integer,Integer> objequipUpgradeAttributes = new com.hifun.soul.core.util.KeyValuePair<Integer,Integer>();
		subListequipUpgradeAttributes[jequipUpgradeAttributes] = objequipUpgradeAttributes;
						objequipUpgradeAttributes.setKey(readInteger());
								objequipUpgradeAttributes.setValue(readInteger());
							}
	}
						item.setExtraSuccessRate(readFloat());
						item.setUpgradeLevel(readInteger());
						item.setLimitLevel(readInteger());
						item.setLimitOccupation(readInteger());
						item.setMaxEquipHole(readInteger());
							{
	int subCountmaterialsOfEquipPaper = readShort();
		com.hifun.soul.core.util.KeyValuePair<String,Integer>[] subListmaterialsOfEquipPaper  = com.hifun.soul.core.util.KeyValuePair.newKeyValuePairArray(subCountmaterialsOfEquipPaper);
		item.setMaterialsOfEquipPaper(subListmaterialsOfEquipPaper);
	for(int jmaterialsOfEquipPaper = 0; jmaterialsOfEquipPaper < subCountmaterialsOfEquipPaper; jmaterialsOfEquipPaper++){
						com.hifun.soul.core.util.KeyValuePair<String,Integer> objmaterialsOfEquipPaper = new com.hifun.soul.core.util.KeyValuePair<String,Integer>();
		subListmaterialsOfEquipPaper[jmaterialsOfEquipPaper] = objmaterialsOfEquipPaper;
						objmaterialsOfEquipPaper.setKey(readString());
								objmaterialsOfEquipPaper.setValue(readInteger());
							}
	}
						item.setMaxOverlap(readInteger());
						item.setIsEquiped(readBoolean());
						item.setCanSell(readBoolean());
				return true;
	}
	
	@Override
	protected boolean writeImpl() {
		writeInteger(stageId);
		writeInteger(stageSimpleInfo.getStageId());
		writeInteger(stageSimpleInfo.getX());
		writeInteger(stageSimpleInfo.getY());
		writeString(stageSimpleInfo.getStageName());
		writeString(stageSimpleInfo.getStageDesc());
		writeInteger(stageSimpleInfo.getMinLevel());
		writeBoolean(stageSimpleInfo.getPass());
		writeInteger(stageSimpleInfo.getMonsterIcon());
		writeInteger(stageSimpleInfo.getMapId());
		writeInteger(stageSimpleInfo.getStar());
		writeBoolean(stageSimpleInfo.getAutoBattle());
		writeString(stageSimpleInfo.getMonsterName());
		writeInteger(stageSimpleInfo.getMonsterLevel());
		writeInteger(stageSimpleInfo.getMonsterOccupation());
		writeInteger(stageSimpleInfo.getRewardExperience());
		writeShort(stageSimpleInfo.getRewardCurrencyType());
		writeInteger(stageSimpleInfo.getRewardCurrencyNum());
		writeInteger(stageSimpleInfo.getMonsterFirstAttack());
		writeString(item.getUUID());
		writeInteger(item.getItemId());
		writeString(item.getName());
		writeString(item.getDesc());
		writeInteger(item.getType());
		writeInteger(item.getIcon());
		writeInteger(item.getRarity());
		writeInteger(item.getBind());
		writeInteger(item.getOverlapNum());
		writeInteger(item.getBagType());
		writeInteger(item.getBagIndex());
		writeShort(item.getSellCurrencyType());
		writeInteger(item.getSellNum());
		writeInteger(item.getPosition());
		writeInteger(item.getEndure());
		writeShort(item.getEquipHole());
		writeShort(item.getEmbedCurrencyType());
		writeInteger(item.getEmbedCurrencyNum());
		writeShort(item.getExtractCurrencyType());
		writeInteger(item.getExtractCurrencyNum());
		writeShort(item.getShopCurrencyType());
		writeInteger(item.getShopCurrencyNum());
			com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] equipBaseAttributes_item=item.getEquipBaseAttributes();
	writeShort(equipBaseAttributes_item.length);
	for(int jequipBaseAttributes=0; jequipBaseAttributes<equipBaseAttributes_item.length; jequipBaseAttributes++){
					com.hifun.soul.core.util.KeyValuePair<Integer,Integer> equipBaseAttributes_item_jequipBaseAttributes = equipBaseAttributes_item[jequipBaseAttributes];
													writeInteger(equipBaseAttributes_item_jequipBaseAttributes.getKey());
													writeInteger(equipBaseAttributes_item_jequipBaseAttributes.getValue());
									}
			com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] equipSpecialAttributes_item=item.getEquipSpecialAttributes();
	writeShort(equipSpecialAttributes_item.length);
	for(int jequipSpecialAttributes=0; jequipSpecialAttributes<equipSpecialAttributes_item.length; jequipSpecialAttributes++){
					com.hifun.soul.core.util.KeyValuePair<Integer,Integer> equipSpecialAttributes_item_jequipSpecialAttributes = equipSpecialAttributes_item[jequipSpecialAttributes];
													writeInteger(equipSpecialAttributes_item_jequipSpecialAttributes.getKey());
													writeInteger(equipSpecialAttributes_item_jequipSpecialAttributes.getValue());
									}
			com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] gemAttributes_item=item.getGemAttributes();
	writeShort(gemAttributes_item.length);
	for(int jgemAttributes=0; jgemAttributes<gemAttributes_item.length; jgemAttributes++){
					com.hifun.soul.core.util.KeyValuePair<Integer,Integer> gemAttributes_item_jgemAttributes = gemAttributes_item[jgemAttributes];
													writeInteger(gemAttributes_item_jgemAttributes.getKey());
													writeInteger(gemAttributes_item_jgemAttributes.getValue());
									}
			com.hifun.soul.gameserver.item.assist.GemItemInfo[] equipGemItemInfos_item=item.getEquipGemItemInfos();
	writeShort(equipGemItemInfos_item.length);
	for(int jequipGemItemInfos=0; jequipGemItemInfos<equipGemItemInfos_item.length; jequipGemItemInfos++){
					com.hifun.soul.gameserver.item.assist.GemItemInfo equipGemItemInfos_item_jequipGemItemInfos = equipGemItemInfos_item[jequipGemItemInfos];
													writeInteger(equipGemItemInfos_item_jequipGemItemInfos.getItemId());
													writeInteger(equipGemItemInfos_item_jequipGemItemInfos.getIndex());
													writeInteger(equipGemItemInfos_item_jequipGemItemInfos.getRarity());
														com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] equipGemAttributes_equipGemItemInfos_item_jequipGemItemInfos=equipGemItemInfos_item_jequipGemItemInfos.getEquipGemAttributes();
	writeShort(equipGemAttributes_equipGemItemInfos_item_jequipGemItemInfos.length);
	for(int jequipGemAttributes=0; jequipGemAttributes<equipGemAttributes_equipGemItemInfos_item_jequipGemItemInfos.length; jequipGemAttributes++){
					com.hifun.soul.core.util.KeyValuePair<Integer,Integer> equipGemAttributes_equipGemItemInfos_item_jequipGemItemInfos_jequipGemAttributes = equipGemAttributes_equipGemItemInfos_item_jequipGemItemInfos[jequipGemAttributes];
													writeInteger(equipGemAttributes_equipGemItemInfos_item_jequipGemItemInfos_jequipGemAttributes.getKey());
													writeInteger(equipGemAttributes_equipGemItemInfos_item_jequipGemItemInfos_jequipGemAttributes.getValue());
									}
									}
			com.hifun.soul.core.util.KeyValuePair<Integer,Integer>[] equipUpgradeAttributes_item=item.getEquipUpgradeAttributes();
	writeShort(equipUpgradeAttributes_item.length);
	for(int jequipUpgradeAttributes=0; jequipUpgradeAttributes<equipUpgradeAttributes_item.length; jequipUpgradeAttributes++){
					com.hifun.soul.core.util.KeyValuePair<Integer,Integer> equipUpgradeAttributes_item_jequipUpgradeAttributes = equipUpgradeAttributes_item[jequipUpgradeAttributes];
													writeInteger(equipUpgradeAttributes_item_jequipUpgradeAttributes.getKey());
													writeInteger(equipUpgradeAttributes_item_jequipUpgradeAttributes.getValue());
									}
		writeFloat(item.getExtraSuccessRate());
		writeInteger(item.getUpgradeLevel());
		writeInteger(item.getLimitLevel());
		writeInteger(item.getLimitOccupation());
		writeInteger(item.getMaxEquipHole());
			com.hifun.soul.core.util.KeyValuePair<String,Integer>[] materialsOfEquipPaper_item=item.getMaterialsOfEquipPaper();
	writeShort(materialsOfEquipPaper_item.length);
	for(int jmaterialsOfEquipPaper=0; jmaterialsOfEquipPaper<materialsOfEquipPaper_item.length; jmaterialsOfEquipPaper++){
					com.hifun.soul.core.util.KeyValuePair<String,Integer> materialsOfEquipPaper_item_jmaterialsOfEquipPaper = materialsOfEquipPaper_item[jmaterialsOfEquipPaper];
													writeString(materialsOfEquipPaper_item_jmaterialsOfEquipPaper.getKey());
													writeInteger(materialsOfEquipPaper_item_jmaterialsOfEquipPaper.getValue());
									}
		writeInteger(item.getMaxOverlap());
		writeBoolean(item.getIsEquiped());
		writeBoolean(item.getCanSell());
		return true;
	}
	
	@Override
	public short getType() {
		return MessageType.GC_CLICK_UNPERFECT_STAGE;
	}
	
	@Override
	public String getTypeName() {
		return "GC_CLICK_UNPERFECT_STAGE";
	}

	public int getStageId(){
		return stageId;
	}
		
	public void setStageId(int stageId){
		this.stageId = stageId;
	}

	public com.hifun.soul.gameserver.stage.model.StageSimpleInfo getStageSimpleInfo(){
		return stageSimpleInfo;
	}
		
	public void setStageSimpleInfo(com.hifun.soul.gameserver.stage.model.StageSimpleInfo stageSimpleInfo){
		this.stageSimpleInfo = stageSimpleInfo;
	}

	public com.hifun.soul.gameserver.item.assist.CommonItem getItem(){
		return item;
	}
		
	public void setItem(com.hifun.soul.gameserver.item.assist.CommonItem item){
		this.item = item;
	}
}