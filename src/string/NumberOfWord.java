package string;

import java.util.Scanner;

public class NumberOfWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		String[] arr = word.split(" ");
		
		
		
		System.out.println(arr.length);
		
		
		
	}
	
}
