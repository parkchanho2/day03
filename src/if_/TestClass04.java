package if_;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 if(조건식){
		 	종속문장
		 }else if(조건식){
		 	종속문장
		 }else if(조건식){
		 	종속문장
		 }else{
		 	종속문장
		 }
		 */
		int num;
		System.out.print("수입력: ");
		num = sc.nextInt();
		if(num > 100) {
			System.out.println("100보다 크다");
		}else if(num > 70){
			System.out.println("70보다 크다");
		}else if(num > 40) {
			System.out.println("40보다 크다");
		}else {
			System.out.println("그외의 값");
		}
		System.out.println("다음 문장들 실행");
		
		
	}
}
























