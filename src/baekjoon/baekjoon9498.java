package baekjoon;

import java.util.Scanner;

public class baekjoon9498 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int score = scr.nextInt();
		char result;
		
		if( (score >= 90) && (score <= 100) ) {
			result = 'A';
		}else if( (score >= 80) && (score < 90) ) {
			result = 'B';
		}else if( (score >= 70) && (score < 80) ) {
			result = 'C';
		}else if( (score >= 60) && (score < 70) ) {
			result = 'D';
		}else {
			result = 'F';
		}
		System.out.print(result);
		scr.close();
	}

}
