package baekjoon;

import java.util.Scanner;

public class baekjoon10797 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int day = scr.nextInt();
		int count = 0;
		for(int i=0; i<5; i++) {
			int num = scr.nextInt();
			if(day == num)
				count++;
		}
		System.out.print(count);
		scr.close();
	}

}
