package baekjoon;

import java.util.Scanner;

public class baekjoon10951 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(scr.hasNextInt()) {
		//EOF(End of File): 파일의 끝, 입력에서 더이상의 읽을 수 데이터가 존재하지 않을 때 반복문을 종료하라는 것
		//JAVA의 경우 반복문 안에 hasNext()메서드 사용(int형 변수 입력받으므로 hasNextInt() 사용해도 무방)
			int a = scr.nextInt();
			int b = scr.nextInt();
			System.out.print(a+b);
		}
		
		scr.close();
	}

}
