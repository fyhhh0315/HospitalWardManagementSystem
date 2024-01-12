package com.fy.tools;

import com.fy.config.linkdatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlDelete {

    public static void Delete_Bed(String Wno, String Bno) throws SQLException {
        // TODO Auto-generated constructor stub
        Connection con = null;
        con = linkdatabase.getConnection();
        String sql = "delete from Bed where Wno=? and Bno=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, Wno);
        ps.setObject(2, Bno);
        ps.executeUpdate();
    }
    public static void Delete_Department(String Deptname) throws SQLException {
        // TODO Auto-generated constructor stub
        Connection con = null;
        con = linkdatabase.getConnection();
        String sql = "delete from Department where Deptname=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, Deptname);
        ps.executeUpdate();
    }
    public static void Delete_Doctor(String Dno) throws SQLException {
        // TODO Auto-generated constructor stub
        Connection con = null;
        con = linkdatabase.getConnection();
        String sql = "delete from Doctor where Dno=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, Dno);
        ps.executeUpdate();
    }
    public static void Delete_Patient(String Pno) throws SQLException {
        // TODO Auto-generated constructor stub
        Connection con = null;
        con = linkdatabase.getConnection();
        String sql = "delete from Patient where Pno=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, Pno);
        ps.executeUpdate();
    }
    public static void Delete_Ward(String Wno) throws SQLException {
        // TODO Auto-generated constructor stub
        Connection con = null;
        con = linkdatabase.getConnection();
        String sql = "delete from Ward where Wno=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1, Wno);
        ps.executeUpdate();
    }
}
