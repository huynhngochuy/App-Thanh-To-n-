package com.ketnoi;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

	public class Main {

		public void CoHoacKhong(int msp, int sl) throws SQLException {
			Connection conn = null;
			String vSQL = null;
			List<SanPham> lstSanPham;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				String connectionURL = "jdbc:sqlserver://DESKTOP-F3STUC4:1433;databasename= quanlybanhang;integrateScurity=true";

				conn = DriverManager.getConnection(connectionURL, "sa", "tinhanhem1");
				if (conn != null) {
					vSQL = "select* from dbo.SanPham";
					Statement statement = conn.createStatement();
					ResultSet result = statement.executeQuery(vSQL);
					lstSanPham = new ArrayList<SanPham>();
					while (result.next()) {
						SanPham p = new SanPham();
						p.setId(result.getInt("MaSanPham"));
						p.setTonKho(result.getInt("SoLuong"));
						lstSanPham.add(p);
					}
					int  j = 0;
					for (SanPham p : lstSanPham) {
						
						if (j == (lstSanPham.size() - 1) && p.getId() != msp) {
						System.out.println("Không tồn tại");
						}

						else if (p.getId() == msp && sl > p.getTonKho()) {
							System.out.println("Thiếu");							
						} else if (p.getId() == msp && sl <= p.getTonKho()) {
							 System.out.println( "Đủ");	
							 
						} else if (p.getId() != msp) {
							j++;
						}
						}
		
				} 
			} catch (ClassNotFoundException e) {
				System.err.println(e.getMessage());
			}
			
			
		} 

	}



