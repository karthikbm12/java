public class ClothesRunner{
	public static void main(String args[]){
	Clothes cloth = new Clothes();
	System.out.println("length is "+cloth.arraylength());
	cloth.createClothes("puma");
	cloth.createClothes("peterengland");
	cloth.createClothes("srk");
	cloth.createClothes("louis");
	cloth.createClothes("raymond");
	cloth.createClothes("hilander");
	cloth.readByClothes();
	String update = cloth.updateByClothes("puma","zara");
	System.out.println(update);
	String delete = cloth.deleteByClothes("peterengland");
	System.out.println(delete);
	String search = cloth.searchByClothes("raymond");
	System.out.println(search);
	
	}
	}