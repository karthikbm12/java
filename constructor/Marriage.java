public class Marriage{
	
	String name;
	int age;
	String  qualification;
	float height;
	public Marriage(String name,int age,String  qualification,float height){
		this.name = name;
		this.age=age;
		this.qualification = qualification;
		this.height = height;
	 }
	public void getProfileDetails(String name){
		if(this.name == "rahul")
		{
		System.out.println("The groom found");
		System.out.println("The groom name "+name);
		  }else{
			System.out.prinln("Groom not found");
		}
	}
		public void getProfileDetails(String name,int age){
		if(this.name == "rahul" && this.age == 26)	
			{
			System.out.println("The name and age of groom is matched");
			}else{
				System.out.println("The name and age of groom not matched");	
			}
			
		}
		public void getProfileDetails(String name,int age,String qualification){
			if(this.name == "rahul" && this.age == 26 && this.qualification=="BE"){
				
					System.out.println("The name and age of groom is matched with qualification");
			}else{
					System.out.println("The name and age of groom not matched with qualification");
			}
			
		}
		public void getProfileDetails(String name,int age,String qualification,float height){
			if(this.name == "rahul" && this.age == 26 && this.qualification=="BE" && this.float == 5.8F){
				
					System.out.println("The name and age of groom is matched with qualification and height");
			}else{
					System.out.println("The name and age of groom not matched with qualification and height");
			}
			
		}
	   
}