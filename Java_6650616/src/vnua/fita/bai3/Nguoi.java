package vnua.fita.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	String hoTen;
	Date ngaySinh; 
	String queQuan;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public Nguoi(String hoTen, Date ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}
	
	public Date stringToDate(String ngaySinhStr) {
		Date ngaySinhDate = null;
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try {
			ngaySinhDate = df.parse(ngaySinhStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Loi dinh dang ngay thang");
		}
		return ngaySinhDate;
	}
	
	public void nhapThongTin(Scanner sc) {
		//ho ten
		System.out.println("Nhap ho ten:");
		hoTen = sc.nextLine();
		
		//ngay sinh
		System.out.println("Nhap ngay sinh(dd-MM-yyyy):");
		ngaySinh = stringToDate(sc.nextLine());
		
		//que quan
		System.out.println("Nhap que quan:");
		queQuan = sc.nextLine();
	}

	public void inThongTin() {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");		
		System.out.format("%20s |", hoTen);
		System.out.format("%11s |", df.format(ngaySinh));
		System.out.format("%10s |", queQuan);
	}
}
