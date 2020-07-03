package baekjoon;

import java.util.Scanner;

public class baekjoon10872 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		System.out.print(factorial(n));
		scr.close();
	}
	
	private static int factorial(int n) {
		if(n == 0 || n == 1)
			return 1;
		else
			return n * factorial(n-1);
	}

}
