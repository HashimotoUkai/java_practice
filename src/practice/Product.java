package practice;

public class Product {
	
	
	//**********フィールド*************
	String name;
	int price;
	
	
	
	
	//*********コンストラクタ***********
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
		}
	
	
	//**********メソッド***************
	
	int up(int amt) {
		return price += amt;
		
	}
	
	int down(int amt) {
		return price -= amt;
	}
	
	void display() {
		System.out.println("名前: " + name );
		System.out.println("売上: " + price + "円");
	}
	
	
	


}
