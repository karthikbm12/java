public class Products{
	public String product_name;
	public byte rating;
	public boolean is_good;
	public int price;

	public Products (){
	System.out.println("No argument with default constructor");
}
	public Products (String product_name,byte rating,boolean is_good,int price){
		this.product_name=product_name;
		this.rating=rating;
		this.is_good=is_good;
		this.price=price;
	System.out.println("Product Name:"+product_name);
	System.out.println("Product rating:"+rating);
	System.out.println("Product is useful:"+is_good);
	System.out.println("Product Price:"+price);
}
	
public static void info(String pdt_name,int price1){
	System.out.println("product name is :"+pdt_name);
	System.out.println("Price is :"+price1);
	int dis_prd=20;
	int value=dis_prd%100*dis_prd;
	double no_disc_price=price1-value;
	if(pdt_name=="Laptop"){
		System.out.println(pdt_name+"Product discount is 20%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price);
	System.out.println(value);
	}
public static void detail(String pdt_name2,int price2){
	System.out.println("product name is :"+pdt_name2);
	System.out.println("Price is :"+price2);
	int dis_prd1=10;
	int price_to_value1=dis_prd1%100*dis_prd1;
	double no_disc_price1=price2-price_to_value1;
	if(pdt_name2=="Plants"){
		System.out.println(pdt_name2+"Product discount is 10%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price1);
	System.out.println(price_to_value1);
	}
public static void collection(String pdt_name3,int price3){
	System.out.println("product name is :"+pdt_name3);
	System.out.println("Price is :"+price3);
	int dis_prd3=4;
	int price_to_value2=dis_prd3%100*dis_prd3;
	double no_disc_price2=price3-price_to_value2;
	if(pdt_name3=="Chair"){
		System.out.println(pdt_name3+"Product discount is 4%");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price2);
	System.out.println(price_to_value2);
	}
public static void prices(String pdt_name4,int price4){
	System.out.println("product name is :"+pdt_name4);
	System.out.println("Price is :"+price4);
	int dis_prd4=7;
	int price_to_value3=dis_prd4%100*dis_prd4;
	double no_disc_price3=price4-price_to_value3;
	if(pdt_name4=="Bag"){
		System.out.println(pdt_name4+"Product discount is 7%:");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price3);
	System.out.println(price_to_value3);
	}
public static void pen(String pdt_name5,int price5){
	System.out.println("product name is :"+pdt_name5);
	System.out.println("Price is :"+price5);
	float dis_prd5=0.1f;
	float price_to_value4=dis_prd5%100*dis_prd5;
	double no_disc_price4=price5-price_to_value4;
	if(pdt_name5=="Pen"){
		System.out.println(pdt_name5+"Product discount is 0.1%:");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price4);
	System.out.println(price_to_value4);
	}

public static void information(String pdt_name7,int price6){
	System.out.println("product name is :"+pdt_name7);
	System.out.println("Price is :"+price6);
	int dis_prd6=30;
	int price_to_value5=dis_prd6%100*dis_prd6;
	double no_disc_price5=price6-price_to_value5;
	if(pdt_name7=="Cloth"){
		System.out.println(pdt_name7+"Product discount is 30%:");
	}
	 
	System.out.println("Product price With out discount is :"+no_disc_price5);
	System.out.println(price_to_value5);
	}
}