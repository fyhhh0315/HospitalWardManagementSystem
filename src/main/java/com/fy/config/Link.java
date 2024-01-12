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

//		//���ݿ�����
//		String driveName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
//		//���ӵ����ݿ�
//		String url="jdbc:sqlserver://localhost:1433;DatabaseName=ҽԺ��������ϵͳ";
//		String user = "root";
//		String password ="";
		try {
			//1.ע������
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2.��ȡ����
			String url = "jdbc:mysql://localhost:3306/sqlquery";
			String user = "root";
			String password = "root";
			conn = DriverManager.getConnection(url, user, password);
			//3.��ȡ���ݿ��������
			state = conn.createStatement();
		}
		catch(SQLException e){
			e.printStackTrace();
		} finally{
			//6.�ͷ���Դ,��ѭ��С�������ιرգ����Ҷ���ֱ�try...catch
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