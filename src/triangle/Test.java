package triangle;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			//ピラミッドの高さ
		    int hight = sc.nextInt(); 
		    
		    
		    for (int i = 0; i < hight; i++) {
		    	for (int k = 0; k < hight - (i + 1); k++) {
		    		System.out.print(" ");
		    	}
		    	for (int j = 0; j < (i + 1); j++) {
		    		System.out.print("*");    	
		    	}
		    	System.out.println();
		    }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
