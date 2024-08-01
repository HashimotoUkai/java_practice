package c_rank_for_boss;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			//人数N
		    int n = sc.nextInt(); 
		    //整数M
		    int m = sc.nextInt();
		    //判定する文字
		    int k = sc.nextInt();
		    //N人分の得点を格納する配列
//		    int count = 0;
		    
		    
		    
		    //外枠の人数分の数字を読み込む
		    for (int i = 0; i < n; i++) {
		    	//内枠のM個の数字の読み込み
		    	int count = 0;
		    	for (int j = 0; j < m; j++) {
		    		//数字の入力
		    		int number = sc.nextInt();
		    		if (number == k) {
		    			count++;
		    		}
		    	}
		    	System.out.println(count);
		    }
		    
		    
		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
