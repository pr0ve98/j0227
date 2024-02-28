package t1_variabal;

public class Test4 {
	public static void main(String[] args) {
		
		// 실수 자료형(float(4byte), [기본] double(8byte))
		
		double dd1, dd2;
		dd1 = 3.141592;
		dd2 = 3.141592123123123123;
		System.out.println("dd1 : " + dd1);
		System.out.println("dd2 : " + dd2);
		System.out.println();
		
		float ff1, ff2;
		ff1 = 3.14F;
		System.out.println("ff1 : " + ff1);
		
		ff2 = 3.141592123123123123F;
		System.out.println("ff2 : " + ff2);
		
		double dd3 = 5E3, dd4 = 5E-3; // nEn = n * 10의 n승
		System.out.println("dd3 : " + dd3);
		System.out.println("dd4 : " + dd4);
	}
}
