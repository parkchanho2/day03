package if_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 문자열 입력: ");
		s1 = sc.next();
		System.out.print("두번째 문자열 입력: ");
		s2 = sc.next();
		
		System.out.println(s2.equals(s1)); //문자열 비교할땐 equals를 써야함
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		}else {
			System.out.println("s1과 s1는 다르다");
		}
		System.out.println("다음 문장들 실행!");
	
	}
}
