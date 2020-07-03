package baekjoon;

import java.util.Scanner;

public class baekjoon2750 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++)
			num[i] = scr.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				if(num[j+1] < num[j])
					swap(num, j, j+1);
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(num[i]);
		}
		scr.close();
	}
	
	private static void swap(int num[], int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}

}
