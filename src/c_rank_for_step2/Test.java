package c_rank_for_step2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
		    //整数nの設定
		    int n = sc.nextInt();
		    
		    boolean isFoundSeven = false;
		    
		    for (int i = 0; i < n; i++) {
		    	int number = sc.nextInt();
		    	if (number == 7) {
		    		isFoundSeven = true;
		    	}
		    }
			
		    if (isFoundSeven) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
		} catch(Exception e) {
		}
        
	}

}
