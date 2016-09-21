package junit.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC3P0 {
	 ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
	 
	 @Test
	 public void testCreateTable(){
		 
	 }
	 
	@Test
	public void testDataSource() throws Exception {
		DataSource source = ioc.getBean(DataSource.class);
		Connection conn = source.getConnection();
		System.out.println(conn);
	}

}
