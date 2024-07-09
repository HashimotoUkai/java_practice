package step11;

public class Test {

	public static void main(String[] args) {
		
		//長方形のインスタンスを作成
		Rectangle rectangle = new Rectangle(9, 5);
		
		 //三角形のインスタンスを作成。
		Triangle triangle = new Triangle(5, 6);
		
		//円のインスタンスを作成
		Circle circle = new Circle(12, 6);
		
		
		
		
		
		
		
		//長方形
		//面積と周囲長を出力
		System.out.println("面積は" + rectangle.area() + "平方センチメートル");
		System.out.println("周囲長は" + rectangle.perimeter() + "センチメートル");
		
		//三角形
		//面積と周囲長を出力
		System.out.println("面積は" + triangle.area() + "平方センチメートル");
		System.out.println("周囲長は" + triangle.perimeter() + "センチメートル");
		
		//円
		//面積と周囲長を出力
		System.out.println("面積は" + circle.area() + "平方センチメートル");
		System.out.println("周囲長は" + circle.perimeter() + "センチメートル");
		

		
		
		
	}

}
