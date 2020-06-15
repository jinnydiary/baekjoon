package baekjoon;

import java.util.Scanner;

public class baekjoon2439 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < n; j++) {
				if( j < (i-1) )
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		scr.close();

	}

}
