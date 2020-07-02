package baekjoon;

import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		int r; String s;
		for(int i = 0; i < t; i++) {
			r = scr.nextInt();
			s = scr.next();
			for(int j = 0; j < s.length(); j++)
				for(int z = 0; z < r; z++)
					System.out.print(s.charAt(j));
			System.out.println();
		}
		scr.close();
	}

}
