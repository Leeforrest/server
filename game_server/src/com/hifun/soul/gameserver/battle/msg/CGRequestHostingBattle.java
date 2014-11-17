package com.hifun.soul.gameserver.battle.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.CGMessage;

/**
 * 客户端请求托管战斗
 * 
 * @author SevenSoul
 */
@Component
public class CGRequestHostingBattle extends CGMessage{
	
	
	public CGRequestHostingBattle (){
	}
	
	
	@Override
	protected boolean readImpl() {
		return true;
	}
	
	@Override
	protected boolean writeImpl() {
		return true;
	}
	
	@Override
	public short getType() {
		return MessageType.CG_REQUEST_HOSTING_BATTLE;
	}
	
	@Override
	public String getTypeName() {
		return "CG_REQUEST_HOSTING_BATTLE";
	}

	@Override
	public void execute() {
	}
}