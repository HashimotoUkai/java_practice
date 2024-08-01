package c_rank_simulation_boss;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		
		//paiza君の体力Hを入力
		int stamina = sc.nextInt();
		
		// paiza君が受けるダメージ量
		int damage = 0;
		
		//monsterが受けるダメージ量
		int monsterDamage = 0;
		
		//カウンター変数
		int counter = 0;
		
		//前回までのmonsterDamageを保持する変数
		int lastMonsterDamage = 1;
		
		//前々回までのmonsterDamageを保持する変数
		int beforeLastMonsterDamage = 1;
		
		//前回までのpaizaのdamageを保持する関数
		int lastDamage = 1;
		
		//前々回までのpaizaのdamageを保持する関数
		int beforeLastDamage = 1;
		
		
		
		while(stamina > 0) {
			//カウンターが増えていく
			counter++;
			//2回目までのそれぞれの数値
			if(counter <= 2) {
				
				//paiza君が受けたダメージ //最初のダメージは1
				damage = 1;
				//monsterが受けたダメージ //最初のダメージは1
				monsterDamage = 1;
				
				//スタミナからダメージを引く
				stamina -= damage;
				
				
			
			} else {
				//3回目以降のそれぞれの処理・数値
				//paiza君がmonsterに与えるダメージ量
				 monsterDamage = lastDamage + beforeLastDamage;
				 
				//monsterがpaiza君に与えるダメージ量
				//前回までの値と前々回の値を定義し、ここで呼び出す
				//ここでは-1ではなく、前回の値と前々回の値を記載する。
				 damage = (lastMonsterDamage * 2) + beforeLastMonsterDamage;
				 
				 //前回、前々回の値を都度更新
				 //monster用ダメージ
				 beforeLastMonsterDamage = lastMonsterDamage;
				 lastMonsterDamage = monsterDamage;
				 //paiza君用ダメージ
				 beforeLastDamage = lastDamage;
				 lastDamage = damage;
				 
				 //スタミナからダメージを引く　体力を計算0になった時点でwhile文が終了
				 stamina -= damage;
			}
			
		}
		
		//何回目でスタミナがゼロになったかのカウンターを表示
		System.out.println(counter);
		
		
	}

}