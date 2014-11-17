package com.hifun.soul.manageweb.serverlog.action;

import java.util.Date;
import java.util.List;

import com.google.protobuf.ServiceException;
import com.hifun.soul.manageweb.Managers;
import com.hifun.soul.manageweb.action.BaseAction;
import com.hifun.soul.manageweb.common.PagingInfo;
import com.hifun.soul.manageweb.log.ManageLogType;
import com.hifun.soul.manageweb.log.ManageLogger;
import com.hifun.soul.manageweb.permission.PermissionType;
import com.hifun.soul.proto.services.LogServices.GMCommandLog;
import com.hifun.soul.proto.services.LogServices.LogRpcService;
import com.hifun.soul.proto.services.LogServices.QueryGMCommandLogRequest;
import com.hifun.soul.proto.services.LogServices.QueryGMCommandLogResponse;

public class GMCommandLogAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date beginDate;
	private Date endDate;
	private int serverId;	
	private long characterId;
	private String characterName;
	private long accountId;
	private String accountName;
	private PagingInfo pagingInfo = new PagingInfo(20);
	private List<GMCommandLog> gmCommandLogs;
	private int logReason;
	
	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

	public long getCharacterId() {
		return characterId;
	}

	public void setCharacterId(long characterId) {
		this.characterId = characterId;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public PagingInfo getPagingInfo() {
		return pagingInfo;
	}

	public void setPagingInfo(PagingInfo pagingInfo) {
		this.pagingInfo = pagingInfo;
	}
	
	public List<GMCommandLog> getGmCommandLogs() {
		return gmCommandLogs;
	}

	public void setGmCommandLogs(List<GMCommandLog> gmCommandLogs) {
		this.gmCommandLogs = gmCommandLogs;
	}


	public int getLogReason() {
		return logReason;
	}

	public void setLogReason(int logReason) {
		this.logReason = logReason;
	}
	
	public String queryGMCommandLogList() throws ServiceException{
	    LogRpcService.BlockingInterface serverLogService = Managers.getServiceManager().getServerLogService();
	    QueryGMCommandLogRequest.Builder request  = QueryGMCommandLogRequest.newBuilder();
	    ManageLogger.log(ManageLogType.QUERY_GM_COMMAND_LOG_LIST, PermissionType.QUERY_GM_COMMAND_LOG_LIST, "", true);
	    request.setBeginDate(beginDate.getTime());
	    request.setEndDate(endDate.getTime());
	    request.setAccountId(accountId);
	    request.setAccountName(accountName);
	    request.setCharacterId(characterId);
	    request.setCharacterName(characterName);
	    request.setServerId(serverId);
	    request.setStart(pagingInfo.getPageIndex()*pagingInfo.getPageSize());
	    request.setMaxResult(pagingInfo.getPageSize());
	    request.setReason(logReason);
	    QueryGMCommandLogResponse response = serverLogService.queryGMCommandLog(null, request.build());
	    gmCommandLogs = response.getGmCommandLogsList();
	    pagingInfo.setTotalCount(response.getTotalCount());
		return "success";
	}
	
	@Override
	public void validate(){
		if(beginDate==null){
			beginDate=new Date();
		}
		if(endDate==null){
			endDate=new Date();
		}
		if(accountName==null){
			accountName="";
		}
		if(characterName==null){
			characterName="";
		}
	}
}
