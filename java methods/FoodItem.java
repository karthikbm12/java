public class FoodItem{
	public static final int pricePerItem =10;
public static void FoodOrdered(String item,int quantity){
	double totalPrice = FoodItem.pricePerItem * quantity;
	System.out.println("ORDERED : "+item+" / QUANTITY : "+quantity+" / TOTAL PRICE : "+totalPrice);
}
}