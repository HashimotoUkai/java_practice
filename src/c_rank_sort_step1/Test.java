package c_rank_sort_step1;

import java.util.Arrays;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			//整数n
			int n = sc.nextInt();
			sc.nextLine();
			
			//出力された数値の格納先
            int[] intArray = new int[n];
			
			//nを入力し、n回数字を表示
			for ( int i = 0; i < n; i++) {
//				int number = sc.nextInt();
				intArray[i] = sc.nextInt();
			}
			
			Arrays.sort(intArray);
			
	        for(int i : intArray) {
	            System.out.println(i);
	        }
			
		

			
		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
