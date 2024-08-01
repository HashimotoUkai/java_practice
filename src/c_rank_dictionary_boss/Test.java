package c_rank_dictionary_boss;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			
			//Aグループの人数
			int P = sc.nextInt();
			//Bグループの人数
			int Q = sc.nextInt();
			//Cグループの人数
			int R = sc.nextInt();
			sc.nextLine();
			
			//ABのペアmap
			Map<Integer, Integer> abMap = new HashMap<>();
			//BCのペアmap
			Map<Integer, Integer> bcMap = new HashMap<>();
			
			//ABのペア入力　Bをkeyにする
			for (int i = 0; i < P; i++) {
				int pNumber = sc.nextInt();//aの値
				int qNumber = sc.nextInt();//bの値
				//ペアを格納
				abMap.put(pNumber, qNumber);
			}
			
			//BCの入力　Bをkeyにする
			for (int j = 0; j < Q; j++) {
				int qNumber = sc.nextInt();//bの値
				int rNumber = sc.nextInt();//cの値
				//ペアを格納
				bcMap.put(qNumber, rNumber);
			}
			
			//ACのペアmap格納用
			Map<Integer, Integer> acMap = new HashMap<>();
			
			//Map同士を比較してpNumberを持つものを出力
			for(Entry<Integer, Integer> entry : abMap.entrySet()) {
				int key = entry.getKey();//aの値
				int value = entry.getValue();//bの値
				
				if (bcMap.containsKey(value)) {
					int c = bcMap.get(value);//cの値
					acMap.put(key, c);//ACのペアmapに格納
				}
			}
	        
	        
	        //リストを使ったもの リストに変換
	        List<Map.Entry<Integer, Integer>> acList = new ArrayList<>(acMap.entrySet());
	        
	        
	        //ACのペアmapを昇順にソート, aのmeyでソートしている
	        acList.sort((e1, e2) -> e1.getKey().compareTo(e2.getKey()));
	        
	        
	        //ソートされたものを出力
	        for(Entry<Integer, Integer> entry : acList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}

}
