package string;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		//A,B,C = 3√    -> 97-94 = 3 
		//D,E,F = 4√ 
		
		//A= 97   Z =122
		
		Scanner scan = new Scanner(System.in);
		int result =0;
		
		String str = scan.next();
		char[] ch = str.toCharArray();
		
		for (int i=0; i < ch.length; i++) {
			if (ch[i] <= 'C') {
				result+=3;
			}else if (ch[i] <= 'F') {
				result+=4;
			}else if (ch[i] <= 'I') {
				result+=5;
			}else if (ch[i] <= 'L') {
				result+=6;
			}else if (ch[i] <= 'O') {
				result+=7;
			}else if (ch[i] <= 'S') {
				result+=8;
			}else if (ch[i] <= 'V') {
				result+=9;
			}else{
				result+=10;
			}
			
		}
		
		System.out.println("result: "+result);
		
	}
}
