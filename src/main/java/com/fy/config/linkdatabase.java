package com.fy.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class linkdatabase {

    static Connection connection;

    public linkdatabase(){
    	//数据库驱动
        String driverName="com.mysql.cj.jdbc.Driver";
        //连接的数据库
        String url="jdbc:mysql://localhost:3306/sqlquery?characterEncoding=utf8";
        String user="root";
        String password="root";

        //加载JDBC-MySQL数据库驱动
        try {

			Class.forName(driverName);
			connection = (Connection) DriverManager.getConnection(url,user,password);
			System.out.println("数据库连接成功");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("数据库连接失败:"+e.getMessage());
		}
    }

    public static Connection getConnection(){
    	new linkdatabase();
        return connection;
    }

    public void setConnection(Connection connection){
        this.connection = connection;
    }

    public static void closeAll(ResultSet rs,PreparedStatement ps,Connection con){
		if(rs != null){
			try{
				rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		if(ps != null){
			try{
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		if(con != null){
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
