package c_rank_string_step3;

import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
		//ここで整数nを入力
        Scanner sc = new Scanner(System.in);
        
        //0~999　数字入力
        int n = sc.nextInt();
        
        System.out.println(String.format("%03d", n));
	}

}
