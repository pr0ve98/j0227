package t1_variabal;

public class Test2 {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 010; // 앞에 0 붙이면 8진수, 8진수 10
		int a3 = 0x10; // 앞에 0x 붙이면 16진수, 16진수 10
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println(); // \n = 한줄 띄우기
		
		int num = 10;
		
		String binaryNum = Integer.toBinaryString(num); // 2진수로 변환
		String octalNum = Integer.toOctalString(num); // 8진수로 변환
		String hexNum = Integer.toHexString(num); // 16진수로 변환
		
		System.out.println("10진수 num : " + num);
		System.out.println("2진수 binaryNum : " + binaryNum);
		System.out.println("8진수 octalNum : " + octalNum);
		System.out.println("16진수 hexNum : " + hexNum);
	}

}
