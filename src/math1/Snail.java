package math1;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		
		int A = scan.nextInt(); //낮에 가는 거리
		int B = scan.nextInt(); //밤에 떨어지는 거리
		int V = scan.nextInt(); //총 거리 
		
		// 정상에 올라간 후 미끄러지지않는다는 조건을 무시한 풀이 
		/*
		int count = 0;
		// sum+= (a - b ) : 하루가는거리 누적
		// count++;  : 하루하루
		int sum= 0;
		while (sum < V ) {
			sum += A-B;
			count++;
			
		}
		System.out.println(count);
		*/

		int day = (V - B) / (A - B);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
		
	}
}
