package t3_제어문;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		
	//	2번 : 두개의 수를 각각 입력받아서 두개의 수중, 큰수와 작은수를 각각 출력해 주시오.
		
		Scanner sc = new Scanner(System.in);
		
		int su1 = 0;
		String res1 = "";
		
		System.out.print("첫번째 숫자를 입력해주세요. ");
		su1 = sc.nextInt();
		
		int su2 = 0;
		String res2 = "";
		
		System.out.print("두번째 숫자를 입력해주세요. ");
		su2 = sc.nextInt();
		
		if(su1 > su2) {
			res1 = "큰수는 "+su1+"이고, 작은수는 "+ su2+" ";
		}
		else if(su1 < su2)
			res2 = "큰수는 "+su2+"이고, 작은수는 "+ su1+" ";
		
		System.out.println(res1+" "+res2+" 입니다.");
		
		sc.close();
	}

}
