package c_rank_string_step5;
import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
        // ここで時刻の入力
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        
        String[] hour = time.split(":");
        
        //時と分をそれぞれ定義
        String hours = hour[0];
        String minutes = hour[1];
        
        //入力された数値に０がついていた場合、０を削除
        hours = hours.replaceFirst("^0+", "");
        minutes= minutes.replaceFirst("^0+", "");
        
        
        //文字列型を数値型に変換
        int hours1 = Integer.parseInt(hour[0]);
        int minutes1 = Integer.parseInt(hour[1]);
        
	      //ここで改行ありで時と分をそれぞれ表示
        System.out.println(hours1);
        System.out.println(minutes1);
        


 
        
        
 
        
        
        
        
        
	}

}
