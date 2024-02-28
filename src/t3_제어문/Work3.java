package t3_제어문;

import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		
		/*3번 : 1개의 수를 입력받아서 그 수가 2의 배수인지, 3의 배수인지, 5의 배수인지를 각각 구분해서 출력하시오. (예시로, 10은 2의 배수이면서 5의 배수가 될수 있도록 출력처리합니다.) */
		
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String res = "";
		
		System.out.print("숫자를 입력하세요. ");
		su = sc.nextInt();
		
		if((su % 30) == 0) {
			res = "2의 배수이면서 3의 배수이면서 5의 배수";
		}
		else if((su % 6) == 0) {
			res = "2의 배수이면서 3의 배수";	
		}
		else if((su % 10) == 0) {
			res = "2의 배수이면서 5의 배수";
		}
		else if((su % 15) == 0) {
			res = "3의 배수이면서 5의 배수";
		}
		else if((su % 2) == 0) {
			res = "2의 배수";
		}	
		else if((su % 3) == 0) {
			res = "3의 배수";
		}
		else if((su % 5) == 0) {
			res = "5의 배수";
		}
		System.out.println("숫자 "+su+"는 "+res+" 입니다.");
		
		sc.close();
	}
}