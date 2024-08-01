package c_rank_for_step4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
		    //番号m
		    int m = sc.nextInt();
		    sc.nextLine();
		    
		    //mの文字配列を作成
		    String[] myArray = new String[m];
		    
		    //m回回して文字を取得
		    for (int i = 0; i < m; i++) {
		    	myArray[i] = sc.nextLine();
		    }
		    
		    //番号n
		    int n = sc.nextInt();
		    sc.nextLine();
		    
		    //nの文字配列
		    String[] newArray = new String[n];
		   
		    //nの文字を取得
		    for (int i = 0; i < n; i++) {
		    	newArray[i] = sc.nextLine();
		    }
		    
		    
		    
		    //文字列を入力し判定
		    for (String word : myArray) {
		    	for (String newWord :newArray) {
		    		if (newWord.contains(word)) {
		    			System.out.println("YES");
		    		} else {
		    			System.out.println("NO");
		    		}
		    	}
		    		
		    }

		    

		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
