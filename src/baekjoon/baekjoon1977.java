package baekjoon;

import java.util.Scanner;

public class baekjoon1977 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int m = scr.nextInt(), n = scr.nextInt();
		int sum = 0, min = 0;
		boolean check = true;
		for(int i=1; i*i<=n; i++) {
			if(i*i < m)
				continue;
			else if(i*i >= m && i*i <= n) {
				sum += i*i;
				if(check) {
					min = i*i;
					check = false;
				}
			}
		}
		if(sum == 0)
			System.out.print(-1);
		else {
			System.out.println(sum);
			System.out.print(min);
		}
		scr.close();
	}

}
