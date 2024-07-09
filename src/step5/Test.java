package step5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		// HashMap作成　mapという変数にキーと値を追加
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "りんご");
		map.put(2, "いちご");
		map.put(3, "みかん");
		map.put(4, "ばなな");
		map.put(5, "メロン");

		// for文を使ってMapのキーと値を取得する。
		for (Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String name = entry.getValue();

			System.out.println("キーは、" + key + " 値は、" + name + "です。");
		}
		
		System.out.println(map.get(1));
	}
}

