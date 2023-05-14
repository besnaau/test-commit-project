package vnua.fita.bai2;

public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;
	
	public TamGiac() {
		
	}
	
	public TamGiac(Diem A, Diem B, Diem C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}

	
	public float dienTich() {
		float a = B.kc(C);
		float b = A.kc(C);
		float c = B.kc(A);
		
		float p = (float)chuVi()/2;
		
		float s = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	
	public float chuVi() {
		float a = B.kc(C);
		float b = A.kc(C);
		float c = B.kc(A);
		
		return (float)(a+b+c);
	}
}
