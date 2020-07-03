package baekjoon;

import java.util.Scanner;

public class baekjoon10870 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		System.out.print(fin(n));
		scr.close();
	}
	
	private static int fin(int n) {
		int sum = 0;
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			sum = fin(n-1) + fin(n-2);
		return sum;
	}

}
