package t1_variabal;

public class Test7 {
	public static void main(String[] args) {
		
		// 자동 타입변환
		
		int su1 = 100;
		double su2 = 3.14;
		
		su1 = su1 + 200;
		System.out.println("su1 : " + su1);
		
		//su1 = su1 + su2;
		su2 = su1 + su2; // double 타입으로 자동 변환된다.
		System.out.println("su2 : " + su2);
		
		double result;
		result = su1 + su2; // double 타입으로 자동 변환된다.
		System.out.println("1.result : " + result);
		
		result = su1 + su1; // double 타입으로 자동 변환된다.
		System.out.println("2.result : " + result);
		
		int atom;
		atom = 1 + 2 * 3;
		System.out.println("atom : " + atom);
		
		char cc1 = 'A';
		int res2 = cc1 + 1;
		System.out.println("res2 : " + res2);
		System.out.printf("res2 = %d\n", res2);
		System.out.printf("res2 = %c\n", res2);
		System.out.println();
		
		String ss1 = "안녕하세요!";
		System.out.println("ss1 : "+ ss1);
		System.out.printf("ss1 : %s\n", ss1);
		
		double dd1 = 3.141592;
		System.out.println("dd1 : " + dd1);
		System.out.printf("dd1 : %f\n", dd1);
		System.out.printf("dd1 : %.2\n", dd1); // 소수 이하 2자리만
		System.out.printf("dd1 : %6.2\n", dd1); // 전체자리수.소수이하자리수
	}
}
