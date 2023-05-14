package vnua.fita.bai2;

public class Test {
	public static void main(String[] args) {
		Diem A = new Diem();
		Diem B = new Diem(3, 0);
		Diem C = new Diem(0, 4);
		
		TamGiac a1 = new TamGiac(A, B, C);
		
		System.out.println("Tam giac co 3 diem: ");
		A.inDiem();
		B.inDiem();
		C.inDiem();
		
		System.out.println("Dien tich tam giac la: " + a1.dienTich());
		System.out.println("Chu vi tam giac la: " + a1.chuVi());
	}
}
