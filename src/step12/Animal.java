package step12;

public class Animal {
	
	protected String animalsound;
	protected String name;
	
	
	
	public Animal() {
		this.animalsound = "";
		this.name = "";
	}
	public Animal(String name) {
		this.animalsound = "";
		this.name = name;
	}
	
	

    
    //スペックを表示
    public void sound(){
        System.out.println(this.name + "の鳴き声は" + this.animalsound);
    }
}
