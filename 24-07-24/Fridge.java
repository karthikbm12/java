public class Fridge{
	String name;
    int price;
	
	public Fridge(){
		System.out.println("The Fridge details are");
	}
	public Fridge(String name){
		this("Haier",50000);
		this.name=name;
		System.out.println("The Fridge name is:"+name);
	}
	public Fridge(String name,int price){
		//this("Samsung");
		this.name=name;
		this.price=price;
		System.out.println("The Fridge name and price is :"+name +" "+price);
	}
	}