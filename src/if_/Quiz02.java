package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int kor,mat,eng,total;
		double avg;
		
		System.out.print("국어 점수 입력: ");
		kor = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		mat = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		eng = sc.nextInt();
		
		total = kor + mat + eng;
		avg = total/3.0;
		System.out.println("총첨:" + total);
		System.out.printf("평균: %.2f", avg);
		System.out.println();
		
		if(avg >= 90) {
			System.out.println("A등급");
		}else if(avg >= 80) {
			System.out.println("B등급");
		}else if(avg >= 70) {
			System.out.println("C등급");
		}else if(avg >= 60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		*/
		
		String go;
		int num1,num2;
		
		System.out.println("시작 하시겠습니까?(Y/N): ");
		go = sc.next();
		
		if (go.equals("Y")) {
			System.out.println("첫번째 65~122 숫자입력: ");
			num1 = sc.nextInt();
			if(num1 < 65 || num1 > 122) {
				System.out.println("올바른 범위의 숫자입력");
			}else {
				System.out.println("두번쨰 숫자 입력: ");
				num2 = sc.nextInt();
				if(num2 < 65 || num2 > 122) {
					System.out.println("올바른 범위 숫자입력");
				}else {
					System.out.println("결과: "+ (char)num1 + (char)num2);
				}
			}
		}else {
			System.out.println("종료");
		}
		
	}
}
































