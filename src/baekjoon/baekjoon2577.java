package baekjoon;

import java.util.Scanner;

public class baekjoon2577 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] count = new int[10];
		int a = scr.nextInt();
		int b = scr.nextInt();
		int c = scr.nextInt();
		int result = a * b * c;
		
		while(result != 0) {
			int temp = result % 10;
			++count[temp];
			result = result / 10;
		}
		
		for(int i = 0; i < count.length; ++i) {
			System.out.println(count[i]);
		}
		scr.close();
	}

}
