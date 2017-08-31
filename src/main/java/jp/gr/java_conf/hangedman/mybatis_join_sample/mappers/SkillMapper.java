package jp.gr.java_conf.hangedman.mybatis_join_sample.mappers;

import java.util.List;

import jp.gr.java_conf.hangedman.mybatis_join_sample.model.Skill;

public interface SkillMapper {
	List<Skill> selectList();
}
