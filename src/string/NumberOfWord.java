package string;

import java.util.Scanner;

public class NumberOfWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		String[] arr = word.split(" ");
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.length);
		
		
		
	}
	
}
