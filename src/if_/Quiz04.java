package if_;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int ch;
		System.out.println("1. 아메리카노 2. 라떼 3. 아이스티");
		
		System.out.print("메뉴 입력: ");
		num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("1. ice 2. hot");
			ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("아이스아메리카노");
			}else if(ch == 2) {
				System.out.println("핫 아메리카노");
			}
		}else if (num == 2) {
			System.out.println("1. ice 2. hot");
			ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("아이스라뗴");
			}else if(ch == 2) {
				System.out.println("핫 라떼");
			}
		}else if(num == 3) {
			System.out.println("아이스티");
		}else 
			System.out.println("잘못입력했습니다");
	}
}
