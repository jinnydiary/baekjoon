package baekjoon;

import java.util.Scanner;

public class baekjoon2003 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt(), m = scr.nextInt(), count = 0;
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = scr.nextInt();
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum += a[j];
				if(sum == m) {
					++count;
					break;
				}else if(sum > m)
					break;
			}
		}
		System.out.print(count);
		scr.close();
	}

}
