package baekjoon;

import java.util.Scanner;

public class baekjoon2588 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		int temp = num2;
		int n;
		
		for(int i=0; i<3; i++) {
			n = temp % 10;
			System.out.println(num1 * n);
			temp /= 10;
		}
		System.out.print(num1 * num2);
		scr.close();
	}

}
