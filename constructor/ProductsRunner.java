
public class ProductsRunner{

public static void main(String args[]){

Products detail = new Products();
Products product_info = new Products("Oppo",(byte)5,true,170000);

	
	Products.info("Mobile",10000);
	Products.detail("Bag",3000);
	Products.collection("Laptop",170000);
	Products.prices("Cloth",6800);
	Products.information("Chair",4500);

}
}
