package com.mybatistest.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatistest.entity.User;

public class TestMyBatis {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testMybatis() throws IOException {
		Reader reader = Resources.getResourceAsReader("com/mybatistest/config/mybatisConfig.xml");
		SqlSessionFactory sqlFactory = new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session = sqlFactory.openSession();
		User user = session.selectOne("findById", 1);
		System.out.println(user.getName());	
	}
}
