package com.hifun.soul.gameserver.timetask.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hifun.soul.common.constants.GlobalKeyConstants;
import com.hifun.soul.gameserver.rank.RankType;
import com.hifun.soul.gameserver.rank.manager.RankManager;
import com.hifun.soul.gameserver.timetask.AbstractDailyTask;
import com.hifun.soul.gameserver.timetask.TimeTaskType;
import com.hifun.soul.gameserver.timetask.manager.GlobalTimeTaskManager;

@Component
public class GlobalHonorRankTask extends AbstractDailyTask {
	@Autowired
	private RankManager rankManager;
	@Autowired
	private GlobalTimeTaskManager globalTimeTaskManager;

	@Override
	public int getTimeTaskType() {
		return TimeTaskType.HUMAN_HONOR_RANK_REFRESH.getIndex();
	}

	@Override
	public long getLastRunTime() {
		return globalTimeTaskManager
				.getLastRunTime(GlobalKeyConstants.HONOR_RANK_REFRESH_TIME);
	}

	@Override
	public void setLastRunTime(long time) {
		globalTimeTaskManager.setLastRunTime(
				GlobalKeyConstants.HONOR_RANK_REFRESH_TIME, time);
	}

	@Override
	public boolean needRunMissing() {
		return true;
	}

	@Override
	public void run() {
		if (isStop()) {
			return;
		}
		rankManager.refreshRankData(RankType.HUMAN_HONOR_RANK);
	}

}
