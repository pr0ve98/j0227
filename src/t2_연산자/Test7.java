package t2_연산자;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 'sc' = 클래스변수, 객체변수
		
		char res;
		int score;
		
		System.out.print("점수를 입력하세요. ");
		score = sc.nextInt();
		
		res = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
		// ? : ? : ? : ; 순서
		System.out.println("점수 : "+score+" 은 "+res+" 학점입니다.");
		
		sc.close();
		
		
	}
}
