package c_rank_for_step1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        //整数nの設定
        int n = sc.nextInt();
        sc.nextLine();
        
        //3の倍数をカウントする変数
        int count = 0;
        
        
        //ここで計算
       for (int i = 0; i < n; i++ ) {
    	   
    	   int number = sc.nextInt();
    	   
    	   if (number % 3 == 0) {
    		   count++;
    	   }
       }
       
       System.out.println(count);
        
	}

}
