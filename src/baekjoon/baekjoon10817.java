package baekjoon;

import java.util.Scanner;

public class baekjoon10817 {
	
	static void swap(int num[], int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0; i<3; ++i) {
			num[i] = scr.nextInt();
		}
		for(int i = 0; i < 3; ++i) {
			for(int j = i+1; j < 3; ++j) {
				if(num[i] > num[j]) {
					swap(num, i, j);
				}
			}
		}
		System.out.print(num[1]);
		scr.close();
	}

}
