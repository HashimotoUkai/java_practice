package c_rank_sort_step3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			//整数n
			int n = sc.nextInt();
			sc.nextLine();
			
			//出力された数値の格納先（ArrayListを使用）
			ArrayList<int[]> intList = new ArrayList<>();
			
			//数のペアを入力し、リストに格納
			for (int i = 0; i < n; i++) {
				int apple = sc.nextInt();
				int banana = sc.nextInt();
				intList.add(new int[] {apple,banana});
			}
			
			//ソート
			Collections.sort(intList, new Comparator<int[]>() {
				@Override
				//ここで比較ロジック
				public int compare(int[] p1, int[] p2) {
					//りんごの数で比較
					if (p1[0] != p2[0]) {
						return Integer.compare(p2[0], p1[0]);//りんごの数が多い方が偉い
					}
					//りんごの数が同じならバナナの数で比較
					return Integer.compare(p2[1], p1[1]);//バナナの数が多い方が偉い
				}
			});
			
			//ソートされたペアを出力
			for (int[] pair : intList) {
				System.out.println(pair[0] + " " + pair[1]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
