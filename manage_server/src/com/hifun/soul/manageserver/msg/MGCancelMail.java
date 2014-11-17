package com.hifun.soul.manageserver.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.async.IAsyncCallbackMessage;
import com.hifun.soul.core.msg.BaseSessionMessage;
import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.core.session.ServerSession;
@Component
public class MGCancelMail extends BaseSessionMessage<ServerSession> implements IAsyncCallbackMessage{

	private long contextId;
	private long mailId;
	
	@Override
	public void execute() {
		throw new UnsupportedOperationException();		
	}

	@Override
	public long getContextId() {
		return contextId;
	}

	@Override
	public void setContextId(long id) {
		this.contextId=id;		
	}

	@Override
	public short getType() {
		return MessageType.MG_CANCEL_MAIL;
	}

	@Override
	protected boolean readImpl() {
		this.contextId = readLong();		
		mailId = readLong();		
		return true;
	}

	@Override
	protected boolean writeImpl() {
		writeLong(contextId);
		writeLong(mailId);		
		return true;
	}

	public long getMailId() {
		return mailId;
	}

	public void setMailId(long mailId) {
		this.mailId = mailId;
	}

}
