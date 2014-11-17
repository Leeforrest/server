package com.hifun.soul.gameserver.legion.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.CGMessage;

/**
 * 请求打开军团面板
 * 
 * @author SevenSoul
 */
@Component
public class CGOpenLegionPanel extends CGMessage{
	
	
	public CGOpenLegionPanel (){
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
		return MessageType.CG_OPEN_LEGION_PANEL;
	}
	
	@Override
	public String getTypeName() {
		return "CG_OPEN_LEGION_PANEL";
	}

	@Override
	public void execute() {
	}
}