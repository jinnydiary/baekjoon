package baekjoon;

import java.util.Scanner;

public class baekjoon1157 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String str = scr.next().toUpperCase();
		int[] word = new int[26];
		int max = 0, cnt = 0, position;
		for(int i=0; i<str.length(); i++) {
			position = (int)str.charAt(i) - 65;
			word[position] += 1;
			if(max < word[position]) {
				max = word[position];
				cnt = position;
			}
		}
		
		boolean check = false;
		for(int i=0; i<word.length; i++)
			if(max == word[i] && cnt != i) {
				check = true;
				break;
			}
		if(check)
			System.out.print("?");
		else
			System.out.print((char)(cnt + 65));
		scr.close();
	}

}
