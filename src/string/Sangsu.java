package string;

import java.util.Iterator;
import java.util.Scanner;

public class Sangsu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		String result="";
		String result2="";

		while (a!=0 ) {
			result += a%10;
			a/=10;	
		}
		while (b!=0 ) {
			result2 += b%10;
			b/=10;	
		}
		
		a = Integer.valueOf(result);
		b = Integer.valueOf(result2);
		
		if (a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
	}
}
