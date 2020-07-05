package baekjoon;

import java.util.Scanner;

public class baekjoon4153 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt(), b = scr.nextInt(), c = scr.nextInt();
		while( a != 0 && b != 0 && c != 0 ) {
			int max = Math.max(Math.max(a, b), c);
			int t1, t2;
			if(a == max) {
				t1 = b;
				t2 = c;
			}else if(b == max) {
				t1 = a;
				t2 = c;
			}else {
				t1 = a;
				t2 = b;
			}
			if(max * max == t1*t1 + t2*t2)
				System.out.println("right");
			else
				System.out.println("wrong");
			a = scr.nextInt();
			b = scr.nextInt();
			c = scr.nextInt();
		}
		scr.close();
	}

}
