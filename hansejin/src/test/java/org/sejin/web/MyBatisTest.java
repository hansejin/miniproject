package org.sejin.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sejin.mapper.TimeMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {
	
	@Inject
	SqlSessionFactory factory;
	
	@Inject
	TimeMapper timeMapper;
	
	@Test
	public void MybatisTest() {
		System.out.println(factory);
	}
	
	@Test
	public void TimeTest() {
		System.out.println(timeMapper.getTime());
	}
	
}
