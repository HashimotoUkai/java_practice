package c_rank_sort_step2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			//整数n
			int n = sc.nextInt();
			sc.nextLine();
			
			//出力された数値の格納先
            Integer[] intArray = new Integer[n];
			
			//nを入力し、n回数字を表示
			for ( int i = 0; i < n; i++) {
				intArray[i] = sc.nextInt();
			}
			
			
			//降順にソート
			 Arrays.sort(intArray, Collections.reverseOrder());

			 //ソートした数値を出力
	        for (int number : intArray) {
	        	System.out.println(number);
	        }
			
		

			
		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
