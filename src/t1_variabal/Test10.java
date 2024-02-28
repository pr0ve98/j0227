package t1_variabal;

public class Test10 {
	public static void main(String[] args) {
		double res;
		double r = 10;
		res = r * r * 3.14;
		System.out.println("1.res : " + res);
		
		// res = 10 / 3; -> 3.333... 아닌 이유는 정수와 정수 연산은 정수여서
		// res = 10 / 3.0; -> 이렇게 해도 가능은 함
		res = (double)10 / 3; // casting
		System.out.println("2.res : " + res);
	}
}
