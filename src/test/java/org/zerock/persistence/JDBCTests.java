package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "book_ex";
		String userpw = "book_ex";
		try(Connection conn = DriverManager.getConnection(jdbcURL, userid, userpw)){
			log.info("Connection success!!!");
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
}
