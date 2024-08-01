package c_rank_sort_boss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			
			//人の数　N人
			int N = sc.nextInt();
			sc.nextLine();
		    
			//出力された銀と金の数の格納先
			ArrayList<int[]> number = new ArrayList<>();
			
			for (int i = 0; i < N; i++) {
				int goldNumber = sc.nextInt();
				int silverNumber = sc.nextInt();
				number.add(new int[] {goldNumber,silverNumber});
			}
			
			Collections.sort(number, new Comparator<int[]> () {
				@Override
				//比較ロジック
				public int compare(int[] p1, int[] p2) {
					//金の数の比較
					if (p1[1] != p2[1]) {
						return Integer.compare(p2[1], p1[1]);
					} else {
					return Integer.compare(p2[0], p1[0]);
					}
				}
				
				
			});
			//ソートされたペアを出力
			for (int[] pair : number) {
				System.out.println(pair[0] + " " + pair[1]);
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
