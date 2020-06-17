package baekjoon;

import java.util.Scanner;

public class baekjoon2523 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		
		for(int i = 0; i < 2*n-1; ++i ) {
			for(int j = 0; j < 2*n-1; ++j) {
				if(i < n) {
					if(j <= i)
						System.out.print("*");
					else
						break;
				} else {
					if(j < 2*n-1-i)
						System.out.print("*");
					else
						break;
				}
			}
			System.out.println();
		}
		scr.close();
	}

}
