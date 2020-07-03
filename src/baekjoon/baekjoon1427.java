package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon1427 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		while(n != 0) {
			num.add(n % 10);
			n /= 10;
		}
		
		Collections.sort(num);
		Collections.reverse(num);
		for(int i=0; i<num.size(); i++)
			System.out.print(num.get(i));
		scr.close();
	}

}
