package t1_variabal;

public class Test3 {
	public static void main(String[] args) {

		// 정수형 타입(byte, char, short, int, long)
		
		byte bb1, bb2;
		bb1 = 127;
		// bb1 = 128; byte 타입의 숫자 표현 -128 ~ 127
		
		bb2 = -128;
		// bb2 = -129;
		
		System.out.println("bb1 : " + bb1);
		System.out.println("bb2 : " + bb2);
		System.out.println();
		
		short ss1 = 128, ss2 = -129;
		System.out.println("ss1 : " + ss1);
		System.out.println("ss2 : " + ss2);
		System.out.println();
		
		// short ss3 = 33000;
		int ii1 = 33000;
		System.out.println("ii1 : " + ii1);
		System.out.println();
		
		int ii2 = 2100000000;
		System.out.println("ii2 : " + ii2);
		System.out.println();
		// int ii3 = 2200000000;
		
		long ll1 = 2200000000L;
		System.out.println("ll2 : " + ll1);
		System.out.println();
		
		char cc1 = 'A'; // ASCll 코드
		System.out.println("cc1 : " + cc1);
		// System.out.printf("cc1 = %d\n", cc1); 변환 필요
		
		int cc2 = 'A'; // ASCll 코드
		System.out.println("cc2 : " + cc2);

		int cc3 = 'a';
		System.out.println("cc3 : " + cc3);
		
		char cc4 = '한';
		System.out.println("cc4 : " + cc4);
		
		int cc5 = '한';
		System.out.println("cc5 : " + cc5);
		
		char cc6 = '\u0041'; // 유니코드
		System.out.println("cc6 : " + cc6);
	}
}
