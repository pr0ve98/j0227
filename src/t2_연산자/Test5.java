package t2_연산자;

import java.util.Scanner; // 외부 객체 임포트

public class Test5 {
	public static void main(String[] args) {
		
		// 점수가 60점 이상은 '합격', 60점 미만은 '불합격'이라고 출력하시오. (String 변수에 담아서 출력하시오)
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		String res;
		int su;
		
		System.out.print("점수를 입력하세요. ");
		su = sc.nextInt();
		
		res = (su >= 60) ? "합격" : "불합격";
		System.out.println("점수 "+su+"는 "+res+" 입니다.");
		
		sc.close();
		
	}
}
