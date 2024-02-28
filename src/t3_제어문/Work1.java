package t3_제어문;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		
		// 1번 : 수를 입력받아서 홀수 인지 짝수인지를 판별하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String res = "";
		
		System.out.print("숫자를 입력하세요. ");
		su = sc.nextInt();
		
		if((su % 2) >= 1) {
			res = "홀수";
		}
		else {
			res = "짝수";
		}
		
		System.out.println("숫자 "+su+"는 "+res+" 입니다.");
		
		sc.close();
	}

}
