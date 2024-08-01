package c_rank_for_step3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
		    //番号n
		    int n = sc.nextInt();
		    
		    //numbersという格納先を作成
		    int[] numbers = new int[n];
		    //n回回して、各々をnumbersに格納
		    for (int i = 0; i < n; i++) {
		    	numbers[i] = sc.nextInt();
		    }
		    
		    //金額k
		    int k = sc.nextInt();
		    
		    //kが何番目にあるのかをpositionで決める
		    int position = 0;
		    for (int i = 0; i < n; i++) {
		    	if (numbers[i] == k) {
		    		position = i + 1;
		    		break;
		    	}
		    }
		    
		    System.out.println(position);
		    
		    

		} catch (Exception e) {
		}
        
	}

}
