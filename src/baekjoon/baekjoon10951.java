package baekjoon;

import java.util.Scanner;

public class baekjoon10951 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(scr.hasNextInt()) {
		//EOF(End of File): ������ ��, �Է¿��� ���̻��� ���� �� �����Ͱ� �������� ���� �� �ݺ����� �����϶�� ��
		//JAVA�� ��� �ݺ��� �ȿ� hasNext()�޼��� ���(int�� ���� �Է¹����Ƿ� hasNextInt() ����ص� ����)
			int a = scr.nextInt();
			int b = scr.nextInt();
			System.out.print(a+b);
		}
		
		scr.close();
	}

}
