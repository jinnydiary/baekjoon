package baekjoon;

import java.util.Scanner;

public class baekjoon2739 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		for(int i=1; i<=9; i++) {
			if(i < 9)
				System.out.println(n + " * " + i + " = " + n*i);
			else
				System.out.print(n + " * " + i + " = " + n*i);
		}
		scr.close();

	}

}
