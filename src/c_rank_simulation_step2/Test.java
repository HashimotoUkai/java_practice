package c_rank_simulation_step2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		//整数Nの入力
		int N = sc.nextInt();
		
		//a倍
		int a = sc.nextInt();
		
		//bで割る
		int b = sc.nextInt();
		
		//paiza君初期値
		int paiza = 1;
		//霧島京子さん初期値
		int kyoko = 1;
		//paiza君の操作回数
		int count = 0;
		
		while(kyoko <= N) {
			//paizaが行うこと
			kyoko += paiza * a;
			//操作回数をプラス１
			count++;
			
			
			if (kyoko > N) {
				break;
			}
			
			//霧島京子が行うこと
			paiza += kyoko % b;
		}
		
		System.out.println (count);
		

	}

}
