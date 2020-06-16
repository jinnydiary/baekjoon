package baekjoon;

import java.util.Scanner;

public class baekjoon5543 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] ham = new int[3];
		int[] soda = new int[2];
		
		for(int i = 0; i < 5; ++i) {
			if(i < 3)
				ham[i] = scr.nextInt();
			else
				soda[i-3] = scr.nextInt();
		}
		
		int minH = ham[0], minS;
		for(int i = 1; i < 3; ++i) {
			if(minH > ham[i])
				minH = ham[i];
		}
		if(soda[0] < soda[1])
			minS = soda[0];
		else
			minS = soda[1];
		
		int sum = minH + minS - 50;
		System.out.print(sum);
		
		scr.close();
	}

}
