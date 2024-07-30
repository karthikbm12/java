public class WoodRunner{
	public static void main(String args[]){
	Wood wood = new Wood();
	wood.woodDetails();
	wood.woodtype("oak",15000);
	String wooden = wood.woodprice();
	System.out.println("the wood details are :"+wooden);
	double wooden1 = wood.woodlength(1.5);
	System.out.println("the wood details are :"+wooden1);
	}
	}