package c_rank_std_in_out_step4;

import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
		//ここで整数nを入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int max = 0;
        

        
      //ここでn+1行を出力する
        for (int i = 1; i <= n; i++) {
        	int input = sc.nextInt();
        	
        	if (input > max) {
        		max = input;
        	}
        }
        System.out.println(max);
	}

}
