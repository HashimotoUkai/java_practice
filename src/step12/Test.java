package step12;

public class Test {

    	
        public static void main(String[] args) {
            // Catのインスタンスを作成
            Cat cat = new Cat("猫ちゃん");
            cat.sound();
            
            Dog dog = new Dog();
            dog.sound();
            
            
            Lion  lion = new Lion("トライアル");
            lion.sound();
        }

}

