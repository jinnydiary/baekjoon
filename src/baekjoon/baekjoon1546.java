package baekjoon;

import java.util.Scanner;

public class baekjoon1546 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int m = scr.nextInt();
		double max = 0;
		double[] score = new double[m];
		for(int i = 0; i < m; ++i) {
			score[i] = scr.nextDouble();
			if(max < score[i])
				max = score[i];
		}
		
		double sum = 0;
		for(int i = 0; i < m; ++i) {
			score[i] = score[i] / max * 100;
			sum += score[i];
		}
		System.out.printf("%f", sum / m);
		scr.close();
	}

}
