package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon15552 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 0; i < t; i++) {
				String[] temp = br.readLine().split(" ");
				//BufferedReader�� ���͸� ���� �ν��ϰ� �޴� �����Ͱ� String���� �����Ǿ� ����
				bw.write(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]) + "\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
