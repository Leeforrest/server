package com.hifun.soul.gameserver.vip.template;

import com.hifun.soul.core.annotation.ExcelRowBinding;
import com.hifun.soul.common.exception.TemplateConfigException;
import com.hifun.soul.core.annotation.ExcelCellBinding;
import com.hifun.soul.core.template.TemplateObject;

/**
 * 试炼塔刷新消耗模版
 * 
 * @author SevenSoul
 */

@ExcelRowBinding
public abstract class RefineRefreshCostTemplateVO extends TemplateObject {

	/** 消耗魔晶数 */
	@ExcelCellBinding(offset = 1)
	protected int crystal;


	public int getCrystal() {
		return this.crystal;
	}

	public void setCrystal(int crystal) {
		if (crystal == 0) {
			throw new TemplateConfigException(this.getSheetName(), this.getId(),
					2, "[消耗魔晶数]crystal不可以为0");
		}
		this.crystal = crystal;
	}
	

	@Override
	public String toString() {
		return "RefineRefreshCostTemplateVO[crystal=" + crystal + ",]";

	}
}