package baekjoon;

import java.util.Scanner;

public class baekjoon10039 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		for(int i=0; i<score.length; ++i) {
			score[i] = scr.nextInt();
			if(score[i] < 40)
				score[i] = 40;
			sum += score[i];
		}
		System.out.print(sum/5);
		scr.close();
	}

}
