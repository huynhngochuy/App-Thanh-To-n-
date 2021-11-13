package com.ketnoi;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;



public class SanPhamBusiness  {
	
	 public SanPham layThongTin(int Msp) {
	   
	String vSQL = null;
	SanPham p = null;
	Connection conn = null;
	try { 
		conn = KetNoi2.ketNoi();
    		if (conn != null) {
			vSQL = "select* from dbo.SanPham where MaSanPham = '"+ Msp + "'";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(vSQL);

			while (result.next()) {
				 p = new SanPham();
				p.setId(result.getInt("MaSanPham"));
				p.setGia(result.getInt("DonGiaBan"));
				p.setName(result.getString("TenSanPham"));
				p.setTonKho(result.getInt("SoLuong"));
				p.setKhuyen(result.getInt("GhiChu"));
				
			}
    		}
	} catch (SQLException ex) {
    	            System.out.println("Có lỗi xảy ra trong quá trình làm việc với Sql. "
    	                    + "Chi tiết: " + ex.getMessage());
    	        } finally {
    	            try {
    	      
    	                if (conn != null) {
    	                    conn.close();
    	                }
    	            } catch (SQLException ex) {
    	            	Logger.getLogger(SanPhamBusiness.class.getName()).log(null);
    	            }
    	        }
    	 
    	        return p;
    	    }
	
}