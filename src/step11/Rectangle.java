package step11;

public class Rectangle implements Shape {
	
	
	//メンバ変数
	private double width;
	private double height;
	
	
	//コンストラクタ
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	
	
	//面積 計算
	@Override
	public double area() {
		return this.width * this.height;
	}
	
	
	
	//周囲長　計算
	@Override
	public double perimeter() {
		return (this.width + this.height) * 2;
		
	}

}
