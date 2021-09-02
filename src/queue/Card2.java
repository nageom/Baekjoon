package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		Queue<Integer> que = new LinkedList();
		
		for (int i=1; i<=N; i++) {
			que.add(i);
		}
		
		while (que.size()!=1) {
			que.poll();
			que.add(que.poll());
		}
		
		System.out.println(que.poll());
		
		
		
		
		
		
		
	}
	
	
}
