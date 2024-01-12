package com.fy.config;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class Link {

	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		Statement state = null;

//		//数据库驱动
//		String driveName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
//		//连接的数据库
//		String url="jdbc:sqlserver://localhost:1433;DatabaseName=医院病房管理系统";
//		String user = "root";
//		String password ="";
		try {
			//1.注册驱动
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2.获取链接
			String url = "jdbc:mysql://localhost:3306/sqlquery";
			String user = "root";
			String password = "root";
			conn = DriverManager.getConnection(url, user, password);
			//3.获取数据库操作对象
			state = conn.createStatement();
		}
		catch(SQLException e){
			e.printStackTrace();
		} finally{
			//6.释放资源,遵循从小到大依次关闭，并且对其分别try...catch
			try{
				if(state != null){
					state.close();
				}
			}catch( SQLException e){
				e.printStackTrace();
			}
			try{
				if(conn != null){
					conn.close();
				}
			}catch( SQLException e){
				e.printStackTrace();
			}

		}

		return conn;
	}

}