package jp.gr.java_conf.hangedman.mybatis_join_sample.mappers;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import jp.gr.java_conf.hangedman.mybatis_join_sample.model.Employees;

public interface EmployeesMapper {
	List<Employees> selectList();
	
	@Select("SELECT * FROM `employees` emp WHERE emp.`hire_date` < #{dateFrom,jdbcType=DATE}")
	List<Employees> selectWhere(Date dateFrom);
}
