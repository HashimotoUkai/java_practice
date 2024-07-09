package step11;

public class Circle {
	
	//直径
	public double diameter;
	//半径
	public double radius;
	
	
	//コンストラクタ
	public Circle(double diameter, double radius) {
		this.diameter = diameter;
		this.radius = radius;
	}
	
	
	//面積の計算
	public double area() {
		return (this.radius * this.radius) * 3.14;
	}
	
	
	
	//円周の計算
	public double perimeter() {
		return this.diameter * 3.14;
	}
	
	
	
	
	
	
	

}
