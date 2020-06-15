package baekjoon;

import java.util.Scanner;

public class baekjoon11022 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		int a, b;
		for(int i = 0; i < t; i++) {
			a = scr.nextInt();
			b = scr.nextInt();
			System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
		}
		scr.close();
	}

}
