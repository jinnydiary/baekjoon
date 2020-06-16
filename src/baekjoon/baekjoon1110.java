package baekjoon;

import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int cycle = 0, newN = n, temp;
		while(true) {
			temp = newN/10 + newN%10;
			newN = (newN%10)*10 + temp%10;
			++cycle;
			if(n == newN)
				break;
		}
		System.out.print(cycle);
		scr.close();
	}

}
