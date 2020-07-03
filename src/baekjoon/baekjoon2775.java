package baekjoon;

import java.util.Scanner;

public class baekjoon2775 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		int k, n;
		for(int i=0; i<t; i++) {
			k = scr.nextInt();
			n = scr.nextInt();
			int sum = sum(k, n);
			System.out.println(sum);
		}
		scr.close();
	}
	
	private static int sum(int k, int n) {
		int sum = 0;
		if(k == 0)
			return n;
		else
			for(int i=1; i<=n; i++)
				sum += sum(k-1, i);
		return sum;
	}

}
