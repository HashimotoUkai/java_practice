package c_rank_string_step6;
import java.util.Scanner; 

public class Test {

	public static void main(String[] args) {
		
      // ここで時刻 (XX:XX) を入力
      Scanner sc = new Scanner(System.in);
      String time = sc.nextLine();
      
      //時と分を分割
      String[] parts = time.split(":");
      
      
      
      
      int hours = Integer.parseInt(parts[0]);
      int minutes = Integer.parseInt(parts[1]);
      
      //30分追加の内容
      minutes += 30;
      if (minutes >= 60) {
    	  minutes -= 60;
    	  hours += 1;
      }
      
      
      
      
      
      System.out.println(String.format("%02d",hours ) + ":" + String.format("%02d",minutes ));
      
	}
}