package pyramid;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
//			//ピラミッドの高さ
//		    int hight = sc.nextInt(); 
//			
//			for (int i = 0; i < hight; i++) {
//				for (int j = 0; j < hight - (i + 1); j++) {
//					System.out.print(" ");
//				}
//				for (int k = 0; k < (i + 1) * 2 - 1; k++) {
//					System.out.print("*");
//				}
//				//行の最後に改行
//				System.out.println();
			
			//ピラミッドの高さ
			int height = sc.nextInt();
			
			for (int i = 0; i < height; i++) {
				//スペースの設定
				for (int j = 0; j < height - (i + 1); j++) {
					System.out.print(" ");
				}
				//アスタリスクの設定
				for (int k = 0; k < (i + 1) * 2 - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

        
	}

}
