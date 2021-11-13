package com.ketnoi;

import java.sql.SQLException;
import java.util.Scanner;

import com.xuly.ChonThem;
import com.xuly.TinhToan;

public class A {
	public static void main(String[] args) throws SQLException {

		String n = "Y";
		double tongtien = 0;
		while (n.equals("Y")) {
			
			System.out.println("Mã sản phẩm:");
			int msp = new Scanner(System.in).nextInt();	
			System.out.println("Số lượng:");
			int sl = new Scanner(System.in).nextInt();
			Main tontai = new Main();
			tontai.CoHoacKhong(msp, sl);			
			
			
			SanPhamBusiness asss = new SanPhamBusiness();
			asss.layThongTin(msp);
			if (asss.layThongTin(msp).getKhuyen() != 0) {
				TinhToan t = new TinhToan(asss.layThongTin(msp).getGia(), asss.layThongTin(msp).getKhuyen());
				tongtien += t.TongTien() * sl;

			} else {
				TinhToan k = new TinhToan(asss.layThongTin(msp).getGia());
				tongtien += k.UuDai() * sl;
			}
		
			System.out.println("Chọn thêm sản phẩm");
			int x=0;
				while(x==0) {
					String YN= new Scanner(System.in).nextLine();						
			ChonThem p= new ChonThem();
		    if(p.KiemTra(YN).equals(YN)==false) {
		    	System.out.println("Nhập sai, xin nhập lại");  
		    	x=0;
		    } else {
		    	n= YN;
		    	x=1;
		    }
			
							
		}
		System.out.println("Tổng tiền:" + tongtien);
	}
	}
}
