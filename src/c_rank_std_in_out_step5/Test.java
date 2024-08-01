package c_rank_std_in_out_step5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String line = sc.nextLine();
        //スプリット使う　
        String[] array = line.split(" ");
        
        
        for (int i = 0; i < n; i++) {
        	System.out.println(array[i]);
        }	
	}

}
