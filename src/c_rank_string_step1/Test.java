package c_rank_string_step1;

import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
		//ここで整数nを入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        

        
      //ここでn+1行を出力する
        for (int i =0; i < n; i++) {
        	String input = sc.next();
        	
        	
        	System.out.println(input.length());
        }
        
	}

}
