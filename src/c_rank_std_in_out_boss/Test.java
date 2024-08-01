package c_rank_std_in_out_boss;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //整数n
        int n = sc.nextInt();
        sc.nextLine();
        
        
        
        //スプリット使う　
//        String[] array = name.split(" ");
        
        
        for (int i = 0; i < n; i++) {
        	String inputname = sc.next();
        	int inputage = sc.nextInt();
        	
        	 System.out.println( inputname + " " + (inputage + 1));
        	
        }	
	}

}
