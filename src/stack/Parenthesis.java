package stack;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		Stack<Character> stack = new Stack<Character>();
		
		String str = scan.next();
		char chr ;
		for (int i=0; i< n; i++) {
			
			
			for(int j=0; j< str.length();j++) {
				chr = str.charAt(j);
				
				if(chr =='(') {
					stack.push(chr);
				}else if (stack.empty()) {
					System.out.println("NO");
				}else {
					stack.pop();
				}			
				
			}
			if(stack.empty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			
			
		}
		
		
		
		
	}
	
	
}
