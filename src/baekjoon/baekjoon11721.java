package baekjoon;

import java.util.Scanner;

public class baekjoon11721 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String str = scr.next();
		int start = 0;
		int end = (str.length() < 10) ? str.length() : 10 ;
		while(end <= str.length()) {
			System.out.println(str.substring(start, end));
			start += 10;
			end = (end + 10 > str.length() && start < str.length()) ? str.length() : end + 10;
		}
		scr.close();
	}

}
