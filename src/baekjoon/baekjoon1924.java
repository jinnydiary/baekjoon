package baekjoon;

import java.util.Scanner;

public class baekjoon1924 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int x = scr.nextInt(), y = scr.nextInt(), count = 0;
		for(int i = 1; i < x; i++) {
			switch(i) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				count += 31; break;
			case 4: case 6: case 9: case 11:
				count += 30; break;
			case 2:
				count += 28; break;
			}
		}
		count += y;
		count %= 7;
		String day = null;
		switch(count) {
		case 0:
			day = "SUN"; break;
		case 1:
			day = "MON"; break;
		case 2:
			day = "TUE"; break;
		case 3:
			day = "WED"; break;
		case 4:
			day = "THU"; break;
		case 5:
			day = "FRI"; break;
		case 6:
			day = "SAT"; break;
		}
		System.out.print(day);
		scr.close();
	}

}
