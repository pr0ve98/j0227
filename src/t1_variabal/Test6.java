package t1_variabal;

public class Test6 {
	public static void main(String[] args) {
		String name, job, address, sign;
		
		name = "김민석";
		job = "회사원";
		address = "서울";
		sign = "!!";
		
		System.out.println("__의 직업은 __이고 __에 산다.");

		System.out.println(name + "의 직업은 " + job + "이고 " + address + "에 산다" + sign);
		
		System.out.println(name + "의 "+job+"직업은 이고 "+address+"에 산다" + sign);
	}
}
