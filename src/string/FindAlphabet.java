package string;

import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ� �Է� ");
		String str = scan.nextLine();
		 //26 = ���ĺ�����
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
 
		for(int i = 0; i < str.length(); i++) {
			char st = str.charAt(i);
			if(arr[st - 97] == -1) {	// arr ���� ���� -1 �� ��쿡�� �ʱ�ȭ
				arr[st - 97] = i;
			}
		}
 
		for(int a : arr) {	// �迭 ���
			System.out.print(a + " ");
		}
		
	}
}
