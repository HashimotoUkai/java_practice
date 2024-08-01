package c_rank_dictionary_step1;

import java.util.HashMap;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			
			//人の数　N人
		    int N = sc.nextInt();
		    sc.nextLine();
		    
		    
		    HashMap<String, String> map = new HashMap<>(); // Mapの宣言
		    
		    //N回入力する
		    for (int i = 0; i < N; i++) {
		    	String name = sc.next();
		    	String age = sc.next();
		    	 map.put(name,age);
		    }
		    
		    //指定のkeyを入力
		    String name = sc.next();
		    
		    
		    //指定のkeyに付随するvalueを表示
		    String age = map.get(name);
		    System.out.println(age);
		    

		    
		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
