package com.hifun.soul.gamedb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hifun.soul.core.orm.BaseCommonEntity;

@Entity
@Table(name = "t_friend_battle")
public class FriendBattleEntity extends BaseCommonEntity {
	
	@Id
	@Column
	private long id;
	
	/** 角色id */
	@Column
	private long roleId;
	
	/** 角色名称 */
	@Column
	private String roleName;
	
	/** 其他角色id */
	@Column
	private long otherRoleId;
	
	/** 其他角色名称 */
	@Column
	private String otherRoleName;
	
	/** 是否胜利 */
	@Column
	private boolean win;
	
	/** 战斗时间 */
	@Column
	private long battleTime;
	
	/** 是否是战斗发起者 */
	@Column
	private boolean isChallenger;
	
	
	public Serializable getId() {
		return id;
	}

	@Override
	public void setId(Serializable id) {
		this.id=(Long)id;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public long getOtherRoleId() {
		return otherRoleId;
	}

	public void setOtherRoleId(long otherRoleId) {
		this.otherRoleId = otherRoleId;
	}

	public String getOtherRoleName() {
		return otherRoleName;
	}

	public void setOtherRoleName(String otherRoleName) {
		this.otherRoleName = otherRoleName;
	}

	public long getBattleTime() {
		return battleTime;
	}

	public void setBattleTime(long battleTime) {
		this.battleTime = battleTime;
	}

	public boolean isChallenger() {
		return isChallenger;
	}

	public void setChallenger(boolean isChallenger) {
		this.isChallenger = isChallenger;
	}
	
}
