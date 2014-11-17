package com.hifun.soul.gamedb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hifun.soul.core.orm.BaseCommonEntity;

@Entity
@Table(name = "t_turntable")
public class TurntableEntity extends BaseCommonEntity {
	
	@Id
	@Column
	private long id;
	
	/** 角色名称 */
	@Column
	private String roleName;
	
	/** 奖励名称 */
	@Column
	private String rewardName;
	
	public Serializable getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRewardName() {
		return rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	@Override
	public void setId(Serializable id) {
		this.id=(Long)id;
	}
	
}
