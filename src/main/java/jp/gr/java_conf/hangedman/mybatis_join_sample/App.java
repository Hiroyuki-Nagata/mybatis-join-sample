package jp.gr.java_conf.hangedman.mybatis_join_sample;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jp.gr.java_conf.hangedman.mybatis_join_sample.model.Employees;
import jp.gr.java_conf.hangedman.mybatis_join_sample.model.Person;
import jp.gr.java_conf.hangedman.mybatis_join_sample.model.PersonSkill;
import jp.gr.java_conf.hangedman.mybatis_join_sample.model.Skill;

/**
 * Hello world!
 *
 */
public class App {
	
	/**
	 * 単純なLEFT JOINのテスト
	 * @throws IOException
	 */
	private static void test1() throws IOException {
		try (InputStream in = App.class.getResourceAsStream("/mybatis-config.xml")) {
			// 設定ファイルを元に、 SqlSessionFactory を作成する
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

			try (SqlSession session = factory.openSession()) {
				List<Person> persons = session
						.selectList("jp.gr.java_conf.hangedman.mybatis_join_sample.mappers.PersonMapper.selectList");
				for (Person p : persons) {
					System.out.println(p.toString());
				}
				List<Skill> skills = session
						.selectList("jp.gr.java_conf.hangedman.mybatis_join_sample.mappers.SkillMapper.selectList");
				for (Skill s : skills) {
					System.out.println(s.toString());
				}

				List<PersonSkill> pskills = session
						.selectList("jp.gr.java_conf.hangedman.mybatis_join_sample.mappers.PersonSkillMapper.selectList");
				for (PersonSkill ps : pskills) {
					System.out.println(ps.toString());
				}			
			}
		}		
	}
	
	private static void test2() throws IOException, ParseException {
		try (InputStream in = App.class.getResourceAsStream("/mybatis-config.xml")) {
			// 設定ファイルを元に、 SqlSessionFactory を作成する
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

			try (SqlSession session = factory.openSession()) {
				
		        // 変換対象の日付文字列
		        String dateStr = "19900101 00:00:00";		
		        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		        // Date型変換
		        Date dt = sdf.parse(dateStr);
				
				List<Employees> emps = session
						.selectList("jp.gr.java_conf.hangedman.mybatis_join_sample.mappers.EmployeesMapper.selectWhere", dt);
				for (Employees e : emps) {
					System.out.println(e.toString());
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		test1();
		test2();
	}
}
