package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcConnection {
	Connection conn=null;
	
	public Connection getConnection() {
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe","testuser","1111");

			if(conn==null) {System.out.println("DB접속에 실패");}
			System.out.println("DB접속 성공");
			
			}catch(Exception e) {
				System.out.println("데이터베이스 접근 실패");
				e.printStackTrace();
			}
			
		return conn;
	}
	
	public void Connectionclose() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
