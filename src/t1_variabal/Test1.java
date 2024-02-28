package t1_variabal;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("변수 연습");
		
		// 문자 + 숫자 결합은 문자
		
		int su1 = 100;
		int su2 = 100;
		System.out.println("su1 : " + su1);
		// ▽괄호 없으니 문자 + 숫자가 되어버려서 100100이라고 출력 (연산 x)
		System.out.println("su1 + su2 : " + su1 + su2);
		System.out.println("su1 + su2 : " + (su1 + su2));
	}

}
