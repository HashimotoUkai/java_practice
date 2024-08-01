package c_rank_string_step4;

import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
		//ここで整数nを入力
        Scanner sc = new Scanner(System.in);
        
        //数字４桁　入力
        String line = sc.nextLine();
        
        
        char first = line.charAt(0);
        char second = line.charAt(1);
        char third = line.charAt(2);
        char forth = line.charAt(3);
        
        int firstInt = Character.getNumericValue(first);
        int secondInt = Character.getNumericValue(second);
        int thirdInt = Character.getNumericValue(third);
        int forthInt = Character.getNumericValue(forth);
        

        
        int left = firstInt + forthInt;
        int right = secondInt + thirdInt;
        
        String leftString = String.valueOf(left);
        String rightString = String.valueOf(right);
        
        System.out.println(leftString + rightString);
        
	}

}
