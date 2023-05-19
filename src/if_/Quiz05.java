package if_;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 3000, time = 0;
		
		System.out.print("말탄 시간: ");
		time = sc.nextInt();
		
		time -= 30;
		
		if(time > 0) {
			if(time % 10 ==0) {
				money = money + time/10*500;
			}else
				money = money + time/10*500+500;
		}
		System.out.println("총금액: " + money + "입니다");
	}
}
