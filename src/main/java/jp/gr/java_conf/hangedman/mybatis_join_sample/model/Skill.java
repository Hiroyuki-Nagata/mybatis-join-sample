package jp.gr.java_conf.hangedman.mybatis_join_sample.model;

import lombok.Data;

@Data
public class Skill {
    private Integer id;
    private Integer personId;
    private String desc;
}
