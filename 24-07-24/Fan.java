public class Fan{
	String name;
	int price;
	
	public Fan(){
		System.out.println("The fan details are");
	}
	public Fan(String name){
		this.name=name;
		System.out.println("The fan name is:"+name);
	}
	public Fan(String name,int price){
		
		this.name=name;
		this.price=price;
		System.out.println("The fan name and price is :"+name +" "+price);
	}
	}