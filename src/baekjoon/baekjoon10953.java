package baekjoon;

import java.util.Scanner;

public class baekjoon10953 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		for(int i=0; i<t; i++) {
			String str = scr.next();
			String[] s = str.split(",");
			System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
		}
		scr.close();
	}

}
