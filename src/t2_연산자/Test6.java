package t2_연산자;

import java.util.Scanner; // 외부 객체 임포트

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String res;
		int su;
		
		System.out.print("점수를 입력하세요. "); // println 에서 ln을 빼면 커서 줄바꿈 x
		su = sc.nextInt();
		
		res = (su >= 60) ? "합격" : "불합격" ;
		System.out.println("점수 "+su+"는 "+res+" 입니다.");
		
		sc.close();
	}
}
