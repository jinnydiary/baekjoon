package baekjoon;

import java.util.Scanner;

public class baekjoon2446 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int num = 2*n-1;
		for(int i = 0; i < num; ++i) {
			for(int j = 0; j <= num; ++j) {
				if(i < n) {
					if(i <= j && j < num-i)
						System.out.print("*");
					else if(j >= num-i)
						break;
					else
						System.out.print(" ");
				}else {
					if(num-1-i <= j && j <= i)
						System.out.print("*");
					else if(j > i)
						break;
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		scr.close();

	}

}
