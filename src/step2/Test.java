package step2;

public class Test {

	public static void main(String[] args) {
		
		
		int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] arr2 = new int [10];
		
		for (int i = 0; i < arr1.length; i++) {
		    arr2[i] = arr1[arr1.length - 1 - i];
		}

		// arr1を出力する
		System.out.println("arr1:");
		for (int i = 0; i < arr1.length; i++) {
		    System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// arr2を出力する
		System.out.println("arr2:");
		for (int i = 0; i < arr2.length; i++) {
		    System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
//		１．変数「i」の中身は、最初は「0」だよ【1】
//		２．変数「i」の中身がarr1の各々より小さい時、繰り返すよ【2】
//		３．i が増えるにつれて順番に前の要素に移動します。
//		４．繰り返すごとに変数「i」の中身に1足すよ【3】
	}

}
