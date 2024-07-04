public class Cloth{
	public static void detail (boolean cloth_types){
		System.out.println("Types Of Cloths are:");
			if(cloth_types){
			System.out.println("Cotton");	
			}else{
			System.out.println("null");	
			}
			
			
		
		if(cloth_types){
			System.out.println("Chiffon");	
			}else{
			System.out.println("null");	
			}
			
			
		
		if(cloth_types){
			System.out.println("Silk");	
			}else{
			System.out.println("null");	
			}
			
		}
		public static void details (boolean cloth_types_rates){
		System.out.println("Types Of Cloths And Rates:");
		int cotton=150;
			if(cloth_types_rates){
			System.out.println("Cotton:"+cotton);	
			}else{
			System.out.println("null");	
			}
			
			
		int silk=190;
		if(cloth_types_rates){
			System.out.println("silk:"+silk);	
			}else{
			System.out.println("null");	
			}
			
			
		int wool=150;
		if(cloth_types_rates){
			System.out.println("wool:"+wool);	
			}else{
			System.out.println("null");	
			}
	
		}
		public static void info (boolean cloth_types_ratings){
		System.out.println("Ratings are:");
		int cotton=4;
			if(cloth_types_ratings){
			System.out.println(cotton+"Stars");	
			}else{
			System.out.println("null");	
			}
			
			
		int silk=5;
		if(cloth_types_ratings){
			System.out.println(silk+"Stars");	
			}else{
			System.out.println("null");	
			}
			
			
		int wool=2;
		if(cloth_types_ratings){
			System.out.println(wool+"Stars");	
			}else{
			System.out.println("null");	
			}
	
		}
		public static void informations (boolean  advantages ){
			System.out.println("Fabrics Advantages are:");	
	
		if(advantages){
			System.out.println("Versatile");	
			}else{
			System.out.println("Zero");	
			}
			
		if(advantages){
			System.out.println("Feels good to Skin");	
			}else{
			System.out.println("Zero");	
			}
			
		if(advantages){
			System.out.println("Longlasting");	
			}else{
			System.out.println("Zero");	
			}
			
			
		}
}