package vnua.fita.bai3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHS {
	Scanner sc = new Scanner(System.in);
	private List<HocSinh> dshs ;
	
	public QLHS() {
		dshs = new ArrayList<HocSinh>(100);
	}
	
	public void ThemHocSinh(HocSinh hs) throws ParseException {
		hs.nhapThongTin(sc);
		dshs.add(hs);
	}
	
	public void nhapDanhSach() {
		int n;
		System.out.println("Nhap so hoc sinh can nhap n = ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) { 
			System.out.println("Them hoc sinh thu " + (i+1));
			HocSinh hs = new HocSinh();
			hs.nhapThongTin(sc);
			dshs.add(hs);
		}
	}
	
	public void inDanhSach() {
		System.out.println("Thogn tin hoc sinh co torng danh sach la: ");
		for(HocSinh hs : dshs) {
			hs.inThongTin();
		}
	}
	
	public void timKiemHocSinh(int namSinh, String queQuan) {
		
	}
	
	public void timKiemHocSinh(String lop) {
		
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		QLHS qlhs = new QLHS();
		
		qlhs.nhapDanhSach();
		qlhs.inDanhSach();
		
		/*
		HocSinh hs = new HocSinh();
		hs.nhapThongTin(sc);
		hs.inThongTin();
		
		*/
	}
}
