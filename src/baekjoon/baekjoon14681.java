package baekjoon;

import java.util.Scanner;

public class baekjoon14681 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int x = scr.nextInt();
		int y = scr.nextInt();
		int position;
		
		if(x > 0) {
			if(y > 0) {
				position = 1;
			}else {
				position = 4;
			}
		}else {
			if(y > 0) {
				position = 2;
			}else {
				position = 3;
			}
		}
		
		System.out.print(position);
		scr.close();
	}

}
