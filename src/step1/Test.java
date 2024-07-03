package step1;

public class Test {

	public static void main(String[] args) {
		
		
		String str1 = "aaa";
		String str2 = "bbb";
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("交換前:atr1 = " + str1 +" str2 = " + str2);
		
		//交換処理
		String w = str1;//一時変数wにaを代入
		str1 = str2;
		str2 = w;
		
		//交換結果を表示
		System.out.println("交換後:atr1 = " + str1 + " str2 = " + str2 );
		
		
		
	}

}
