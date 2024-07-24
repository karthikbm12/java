public class Vehicle{
	String name;
	long price;
	public Vehicle(String name){
		this("mahindra",560000l);
		this.name=name;
	System.out.println("Thename of the vehicle is "+name);
	}
	public Vehicle(String name,long price){
		//this("Scorpio");
		this.name=name;
		this.price=price;
		System.out.println("Thename and cost is"+name +"  "+price);
	}
	}