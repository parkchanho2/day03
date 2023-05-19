package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
	}
}
