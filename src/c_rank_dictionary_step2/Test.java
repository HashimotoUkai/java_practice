package c_rank_dictionary_step2;

import java.util.HashMap;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			
			//人の数　N人
		    int N = sc.nextInt();
		    sc.nextLine();
		    // 名前とダメージの初期値 0 のMapの宣言
		    HashMap<String, Integer> damageMap = new HashMap<>(); // 名前とダメージのMap宣言
		    
		    //N回名前を入力し、mapに格納
		    for (int i = 0; i < N; i++) {
		    	String name = sc.nextLine();
		    	damageMap.put(name, 0);//ダメージは初期値
		    }
		    
		    
		    //攻撃の数　M回
		    int M = sc.nextInt();
		    sc.nextLine();

		    
		    //攻撃のダメージと受けた人の名前
		    for (int i = 0; i < M; i++) {
		    	String name = sc.next();
		    	int damage = sc.nextInt();
		    	
		    	sc.nextLine();
		    	
			    //名前が存在する場合はダメージを加算
			    if (damageMap.containsKey(name)) {
			    	damageMap.put(name, damageMap.get(name) + damage);
			    }
		    	}

		    //指定の名前を入力
		    String targetName = sc.nextLine();
		    
		    //指定のkeyに付随するvalueを表示
		    //名前は存在する場合はダメージ合計を表示、存在しない場合は0を表示
		    System.out.println(damageMap.getOrDefault(targetName, 0));
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}

}
