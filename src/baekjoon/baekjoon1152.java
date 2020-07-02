package baekjoon;

import java.util.Scanner;

public class baekjoon1152 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String[] str = scr.nextLine().trim().split(" ");
		int count = 0;
		for(int i=0; i<str.length; i++)
			if(str[i].trim().equals("") == false)
				count += 1;
		System.out.print(count);
		scr.close();
	}

}
