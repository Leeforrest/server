package com.hifun.soul.gameserver.friend.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.CGMessage;

/**
 * 拒绝好友申请
 * 
 * @author SevenSoul
 */
@Component
public class CGAddFriendRefuse extends CGMessage{
	
	/** 角色id */
	private long fromRoleId;
	
	public CGAddFriendRefuse (){
	}
	
	public CGAddFriendRefuse (
			long fromRoleId ){
			this.fromRoleId = fromRoleId;
	}
	
	@Override
	protected boolean readImpl() {
		fromRoleId = readLong();
		return true;
	}
	
	@Override
	protected boolean writeImpl() {
		writeLong(fromRoleId);
		return true;
	}
	
	@Override
	public short getType() {
		return MessageType.CG_ADD_FRIEND_REFUSE;
	}
	
	@Override
	public String getTypeName() {
		return "CG_ADD_FRIEND_REFUSE";
	}

	public long getFromRoleId(){
		return fromRoleId;
	}
		
	public void setFromRoleId(long fromRoleId){
		this.fromRoleId = fromRoleId;
	}

	@Override
	public void execute() {
	}
}