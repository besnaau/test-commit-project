package vnua.fita.bai3;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi{
	private String lop;
	private String khoaHoc;
	private byte kyHoc;
	
	public String getLop() {
		return lop;
	}

	public HocSinh() {
		
	}
	
	public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc) {
		super(hoTen, ngaySinh);
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}

	public HocSinh(String hoTen, String lop, String khoaHoc) {
		super(hoTen);
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		
		//lop
		System.out.println("Nhap lop");
		lop = sc.nextLine();
		
		//khoa hoc
		System.out.println("Nhap khoa hoc:");
		khoaHoc = sc.nextLine();
		
		//ky hoc
		System.out.println("Nhap ky hoc:");
		kyHoc = sc.nextByte();
	}
	
	public void inThongTin() {
		super.inThongTin();
		
		System.out.format("%10s |", lop);
		System.out.format("%4s |", khoaHoc);
		System.out.format("%2s |", kyHoc);
	}
}
