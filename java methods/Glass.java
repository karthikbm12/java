public class Glass{
	public static boolean glass_name(){
	boolean glass_name = true;
	if(glass_name){
	    System.out.println("carbon");
	}else{
		System.out.println("Not a glass");
	}
	if(glass_name){
	    System.out.println("plastic");
		return true;
	}else{
		System.out.println("Not a plastic");
		return false;
	}
}
}