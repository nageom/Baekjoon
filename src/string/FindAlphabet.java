package string;

import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력 ");
		String str = scan.nextLine();
		 //26 = 알파벳갯수
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
 
		for(int i = 0; i < str.length(); i++) {
			char st = str.charAt(i);
			if(arr[st - 97] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[st - 97] = i;
			}
		}
 
		for(int a : arr) {	// 배열 출력
			System.out.print(a + " ");
		}
		
	}
}
