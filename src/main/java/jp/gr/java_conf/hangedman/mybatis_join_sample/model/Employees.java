package jp.gr.java_conf.hangedman.mybatis_join_sample.model;

import java.util.Date;

import lombok.Data;

@Data
public class Employees {
	private Integer empNo;
	private Date birthDate;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Date hireDate;
}
