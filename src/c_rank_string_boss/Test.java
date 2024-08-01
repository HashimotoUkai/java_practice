package c_rank_string_boss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//ここで整数nを入力
        Scanner sc = new Scanner(System.in);
        //整数nの入力
        int n = sc.nextInt();
        sc.nextLine();
        
        //ここで結果格納リスト作成
        List<String> results = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
        	
            String time = sc.next();
            //時に足す時間
            int plusHours = sc.nextInt();
            //分に足す時間
            int plusMinutes = sc.nextInt();
            
            //時と分に分けた
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            
            hours += plusHours;
            minutes += plusMinutes;
        	
            //分の条件
        	if (minutes >= 60) {
        		minutes -= 60;
        		hours += 1;
        	}
        	//時の条件
        	if (hours >= 24) {
        		hours -= 24;
        	}
            
        	
          // 結果をリストに追加
        	results.add(String.format("%02d:%02d", hours, minutes));  
        }
        for (String result : results) {
            System.out.println(result);
        }
        
	}
}










