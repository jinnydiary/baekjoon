package baekjoon;

import java.util.Scanner;

public class baekjoon10824 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		long a = scr.nextLong(), b = scr.nextLong();
		long cnt = 0L, temp = b;
		while(temp > 0) {
			temp /= 10;
			++cnt;
		}
		long num1 = a * (long)Math.pow(10, cnt) + b;
		
		long c = scr.nextLong(), d = scr.nextLong();
		cnt = 0; temp = d;
		while(temp > 0) {
			temp /= 10;
			++cnt;
		}
		long num2 = c * (long)Math.pow(10, cnt) + d;
		System.out.print(num1 + num2);
		scr.close();
	}

}
