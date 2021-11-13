package com.ketnoi;

public class SanPham {
	private int id;
	private String name;
	private int gia;
	private int tonkho;
	private int khuyenmai;
		public SanPham() {
	
		}
		public SanPham(char id, String name, int gia, int tonkho , int khuyenmai) {
			super();
			this.id = id;
			this.name = name;
			this.gia = gia;
			this.tonkho = tonkho;
			this.khuyenmai= khuyenmai;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGia() {
			return gia;
		}
		public void setGia(int gia) {
			this.gia = gia;
		}
		public int getTonKho() {
			return tonkho;
		}
		public void setTonKho(int tonkho) {
			this.tonkho = tonkho;
		}
		public void setKhuyen(int khuyenmai) {
			this.khuyenmai= khuyenmai;
		}
		public int getKhuyen() {
			return khuyenmai;
		}
		
		@Override
		public String toString() {
			return "ID:" + id + "\nTên sản phẩm:" + name + " \nGiá bán=" + gia + "\n Số lượng còn: "+ tonkho+" \n Khuyến mãi:"+ khuyenmai;
		}
		
}
