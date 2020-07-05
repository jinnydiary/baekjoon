package baekjoon;

import java.util.Scanner;

public class baekjoon1920 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = scr.nextInt();
		int m = scr.nextInt();
		for(int t=0; t<m; t++) {
			int temp = scr.nextInt();
			boolean check = false;
			for(int i=0; i<n; i++)
				if(a[i] == temp) {
					check = true;
					break;
				}
			if(check)
				System.out.println(1);
			else
				System.out.println(0);
		}
		scr.close();
	}

}

