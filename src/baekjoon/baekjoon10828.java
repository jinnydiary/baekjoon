package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon10828 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = scr.nextInt();
		for(int i=0; i<n; i++) {
			String str = scr.next();
			if(str.equals("push"))
				arr.add(scr.nextInt());
			else if(str.equals("pop") || str.equals("top")) {
				if(arr.size() == 0)
					System.out.println(-1);
				else {
					System.out.println(arr.get(arr.size()-1));
					if(str.equals("pop"))
						arr.remove(arr.size()-1);
				}
			}else if(str.equals("size"))
				System.out.println(arr.size());
			else if(str.equals("empty")) {
				if(arr.size() == 0)
					System.out.println(1);
				else
					System.out.println(0);
			}
		}
		scr.close();
	}

}
