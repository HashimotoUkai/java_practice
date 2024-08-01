package c_rank_std_in_out_step2;

import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
		//ここで整数nを入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        

        
      //ここでn+1行を出力する
        for (int i = 1; i <= n; i++) {
        	int input = sc.nextInt();
        	System.out.println(input);
        }
        
	}

}
