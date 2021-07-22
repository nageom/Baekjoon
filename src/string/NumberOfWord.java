package string;

import java.util.Scanner;

public class NumberOfWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		String[] arr = word.split(" ");
		
		for(String a : arr) {
			System.out.println(a);
			
		}
		
		
		
	}
	
}
