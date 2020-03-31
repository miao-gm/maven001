package org.lanqiao.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lanqiao.bean.Student;

public class Demo {
public static void main(String[] args) throws Exception {
	
	 InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
	 SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(resourceAsStream);
     //´´½¨sessionÊµÀý
     SqlSession session = sqlSessionFactory.openSession();

	List<Student> seleList= session.selectList("org.lanqiao.dao.StudentDao.all");
	for (Student student : seleList) {
		System.out.println(student);
	}
}
}
