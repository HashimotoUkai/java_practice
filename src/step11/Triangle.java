package step11;

public class Triangle implements Shape {
	
	//底辺
	private double side;
	//高さ
	private double height;
	
	
	//コンストラクタ
	public Triangle(double side, double height) {
		this.side = side;
		this.height = height;
	}
	
	
	//面積　計算
	@Override
	public double area() {
		return (this.side * this.height) / 2;
	}
	@Override
	//周囲長　計算
	public double perimeter() {
		return this.side * 3;
	}
	

}
