package baekjoon;

import java.util.Scanner;

public class baekjoon5622 {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String str = scr.next();
		int time = 0;
		for(int i=0; i<str.length(); i++) {
			time += changeNum(str.charAt(i));
		}
		System.out.print(time);
		scr.close();
	}
	
	private static int changeNum(char ch) {
		int temp;
		switch(ch) {
		case 'A': case 'B': case 'C':
			temp = 3;
			break;
		case 'D': case 'E': case 'F':
			temp = 4;
			break;
		case 'G': case 'H': case 'I':
			temp = 5;
			break;
		case 'J': case 'K': case 'L':
			temp = 6;
			break;
		case 'M': case 'N': case 'O':
			temp = 7;
			break;
		case 'P': case 'Q': case 'R': case 'S':
			temp = 8;
			break;
		case 'T': case 'U': case 'V':
			temp = 9;
			break;
		case 'W': case 'X': case 'Y': case 'Z':
			temp = 10;
			break;
		default:
			temp = -1;
		}
		return temp;
	}

}
