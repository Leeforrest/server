package com.hifun.soul.gameserver.recharge.msg;

import com.hifun.soul.gameserver.item.assist.SimpleCommonItem;

/**
 * 首充奖励信息
 * 
 * @author yandajun
 * 
 */
public class FirstRechargeRewardInfo {
	private int itemNum;

	private SimpleCommonItem commonItem;

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public SimpleCommonItem getCommonItem() {
		return commonItem;
	}

	public void setCommonItem(SimpleCommonItem commonItem) {
		this.commonItem = commonItem;
	}

}
