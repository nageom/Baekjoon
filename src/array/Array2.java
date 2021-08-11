package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Array2 {
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		//ArrayList arr = new ArrayList();
		
		int[] arr = new int[num];
		for (int i=0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int a : arr) {
			System.out.println(a);
		}
		
		
	}
	

}
