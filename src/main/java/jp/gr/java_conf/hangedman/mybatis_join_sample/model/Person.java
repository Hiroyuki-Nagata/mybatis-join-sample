package jp.gr.java_conf.hangedman.mybatis_join_sample.model;

import lombok.Data;

@Data
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String kind;
    private Integer age;
}