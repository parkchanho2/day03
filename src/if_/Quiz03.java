package if_;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money, choice,change =0;
		int coca = 800;
		int pepsi = 500;
		int zero = 1000;
		
		System.out.print("금액을 입력하세요: ");
		money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.println("1.코카콜라(800) 2.펩시(500) 3.제로(1000)");
		choice = sc.nextInt();
		
		if(choice == 1 && money > coca) {
			change = money - coca;
		}else if(choice == 2 && money > pepsi) {
			change = money - pepsi;
		}else if (choice == 3 && money > zero) {
			change = money - zero;
		}else {
			change = money;
			System.out.println("돈 부족");
		}
		System.out.println("잔돈: " + change +"원");
	}
}	
