package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon2798 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt(), m = scr.nextInt();
		ArrayList<Integer> card = new ArrayList<Integer>();
		for(int i=0; i<n; i++)
			card.add(scr.nextInt());
		card.sort(null);
		
		int sum = 0, max = card.get(0) + card.get(1) +card.get(2);
		for(int i = 0; i<n-2; i++) {
			for(int j = i+1; j<n-1; j++) {
				for(int z = j+1; z<n; z++) {
					sum = card.get(i) + card.get(j) +card.get(z);
					if(sum > m)
						break;
					else if(m >= sum && sum > max)
						max = sum;
				}
			}
		}
		System.out.print(max);
		scr.close();
	}

}
