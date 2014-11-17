package com.hifun.soul.gamedb.entity;

import java.io.Serializable;

import com.hifun.soul.core.orm.BaseProtobufEntity;
import com.hifun.soul.core.orm.annotation.AutoCreateHumanEntityHolder;
import com.hifun.soul.gamedb.IHumanSubEntity;
import com.hifun.soul.proto.data.entity.Entity.HumanCarriedSkill;
import com.hifun.soul.proto.data.entity.Entity.HumanCarriedSkill.Builder;

/**
 * 角色携带的技能实体;
 * 
 * @author crazyjohn
 * 
 */
@AutoCreateHumanEntityHolder(EntityHolderClass = "CollectionEntityHolder")
public class HumanCarriedSkillEntity extends
		BaseProtobufEntity<HumanCarriedSkill.Builder> implements
		IHumanSubEntity {

	public HumanCarriedSkillEntity(Builder builder) {
		super(builder);
	}

	public HumanCarriedSkillEntity() {
		this(HumanCarriedSkill.newBuilder());
	}

	@Override
	public long getHumanGuid() {
		return this.builder.getHumanGuid();
	}

	@Override
	public Serializable getId() {
		return this.builder.getSkill().getSkillId();
	}

	@Override
	public void setId(Serializable id) {
		this.builder.getSkillBuilder().setSkillId((Integer) id);
	}

}
