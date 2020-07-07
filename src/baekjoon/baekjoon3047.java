package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon3047 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<3; i++)
			arr.add(scr.nextInt());
		arr.sort(null);
		String str = scr.next().toUpperCase();
		String[] s = str.split("");
		for(int i=0; i<3; i++) {
			if(s[i].equals("A"))
				System.out.print(arr.get(0)+ " ");
			else if(s[i].equals("B"))
				System.out.print(arr.get(1)+ " ");
			else
				System.out.print(arr.get(2)+ " ");
		}
		scr.close();
	}

}
