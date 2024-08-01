package c_rank_dictionary_step3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			
			//名前とダメージの初期値0のMap 宣言
			 TreeMap<String, Integer> treeMap = new TreeMap<>();//名前とダメージのMap宣言
			
			//人の数N
			int N = sc.nextInt();
			sc.nextLine();
			 
			 //N回名前を入力し、Mapに格納
			 for (int i = 0; i < N; i++) {
				 String name = sc.nextLine();
				 treeMap.put(name, 0);//ダメージは初期値S
			 }
			 
			 //攻撃の数　M回
			 int M = sc.nextInt();
			 sc.nextLine();
			 
			 //ダメージを受けた人、ダメージ数
			 for (int i = 0; i < M; i++) {
				 String name = sc.next();
				 int damage = sc.nextInt();
				 
				 
				 if (treeMap.containsKey(name)) {
					 treeMap.put(name, treeMap.get(name) + damage);
				 }
			 }
			 
			 for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
				 System.out.println(entry.getValue());
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}

}
