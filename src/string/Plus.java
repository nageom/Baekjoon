package string;

import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += str.charAt(i)-'0';
			// �ε����� ���� ã�� -0���� ���ڷ� �ٲ���
		}
		System.out.println(sum);
		
		
		
	}
}
