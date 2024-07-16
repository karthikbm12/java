public class Cat{
		public static void CatDetails(String name){
		System.out.println("The catdetails are"+name);
		Cat.CatDetails(36);
		}
		public static void CatDetails(int weight){
		System.out.println("The catdetails are :"+weight);
		Cat.CatDetails("jacky");
		}
		}