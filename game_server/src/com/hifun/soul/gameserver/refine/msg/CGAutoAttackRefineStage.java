package com.hifun.soul.gameserver.refine.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.CGMessage;

/**
 * 自动攻打试炼关卡
 * 
 * @author SevenSoul
 */
@Component
public class CGAutoAttackRefineStage extends CGMessage{
	
	/** 试炼副本id */
	private int refineType;
	
	public CGAutoAttackRefineStage (){
	}
	
	public CGAutoAttackRefineStage (
			int refineType ){
			this.refineType = refineType;
	}
	
	@Override
	protected boolean readImpl() {
		refineType = readInteger();
		return true;
	}
	
	@Override
	protected boolean writeImpl() {
		writeInteger(refineType);
		return true;
	}
	
	@Override
	public short getType() {
		return MessageType.CG_AUTO_ATTACK_REFINE_STAGE;
	}
	
	@Override
	public String getTypeName() {
		return "CG_AUTO_ATTACK_REFINE_STAGE";
	}

	public int getRefineType(){
		return refineType;
	}
		
	public void setRefineType(int refineType){
		this.refineType = refineType;
	}

	@Override
	public void execute() {
	}
}