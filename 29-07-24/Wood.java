public class Wood{
	String wood_Type;
	int price;
	double length;
	
	public static void woodDetails(){
	System.out.println("the wood details are :");
	} 
	public static void woodtype(String wood_Type,int price){
		System.out.println("the wood details are :"+wood_Type + " " +price);
	}
	public static String woodprice(){
		return "woodprice";
	}
	public static double woodlength(double length){
		return length;
	}
}