package c_rank_string_step2;

import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
		//ここで整数nを入力
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String a = sc.nextLine();
        
        if (a.contains(line)) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
        
	}

}
