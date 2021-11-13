package com.ketnoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoi2 {

	private final static String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	private final static String DATABASE_LINK = "jdbc:sqlserver://DESKTOP-F3STUC4:1433;databasename= quanlybanhang;integrateScurity=true";;

	public static Connection ketNoi()
	    {
	        
	        Connection conn = null;
	            
	        try {
	 
	         
	            Class.forName(JDBC_DRIVER);
	            
	           
	            conn = DriverManager.getConnection(DATABASE_LINK, "sa", "tinhanhem1");
	            
	        } catch (ClassNotFoundException ex) {
	            System.err.println("Không tìm thấy driver. Chi tiết: " + ex.getMessage());
	        } catch (SQLException ex) {
	            System.err.println("Không kết nối được đến SQL server. Chi tiết: " + ex.getMessage());
	        }
	        
	    
	        return conn;
	    }}
