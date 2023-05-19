package if_;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int num;
		System.out.println("수입력: ");
		num = sc.nextInt();
		if (num %3==0) {
			System.out.println("입력 값은 3의 배수");
		}else {
			System.out.println("입력 값은 3의배수 아님");
		}
		System.out.println("다음문장실행");
		System.out.println("다음문장실행");
		System.out.println("다음문장실행");
		*/
		int num;
		System.out.print("수입력: ");
		num = sc.nextInt();
		if (num > 0 && num <100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
	}
}
















