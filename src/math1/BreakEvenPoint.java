package math1;

import java.util.Scanner;

/*
 * 
 * A: 고정비용
 * B : 한대 드는 가변비용
 * C : 노트북가격 
 * 
 * 손익분기점 : 최초로 이익이 발생하는 지점 
 * // 수익은 C*N =  A + B*N
 * 
 * 순익은 노트북가격 C - 가변비용 B 
 * 
 * 
 * */
public class BreakEvenPoint {

	public static void main(String[] args) {
		
		//총 비용은 A + B*C
		Scanner scan = new Scanner(System.in);
		System.out.println("나와랏 A B C ");
		 
		int A = scan.nextInt();	// 불변 비용
		int B = scan.nextInt();	// 가변 비용
		int C = scan.nextInt(); 	// 상품 가격
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
		
		
	}
}
