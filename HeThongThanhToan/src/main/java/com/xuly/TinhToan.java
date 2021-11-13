package com.xuly;

public class TinhToan {
	public static void main(String[] args) {
		TinhToan z= new TinhToan(1000);
		System.out.println(z.TongTien());
	}

	private int giatien;
	private int khuyenmai;

	public TinhToan(int giatien) {
		this.giatien = giatien;
	}

	public TinhToan(int giatien, int khuyenmai) {
		this.giatien = giatien;
		this.khuyenmai = khuyenmai;
	}

	public float TongTien() {
		float p = giatien - (giatien * 10 / 100);
		return p;
	}

	public float UuDai() {
		float p = (giatien - giatien * khuyenmai / 100) * (1 - khuyenmai / 100);
		return p;
	}

}
