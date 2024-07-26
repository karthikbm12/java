public class Laptop{

	int index = 0;
	String brand[] = new String[5];
	
	public int arraylength(){
		
		return brand.length;
	}
	public String createLaptop(String brandName){
		if(this.index<this.arraylength()){
			brand[index]=brandName;
			index++;
		}
		return "array is full";
		
	}
	public void readByLaptop()
	{
		for(int index = 0;index<this.arraylength();index++)
		{
			System.out.println("Laptop are :"+brand[index]);
		}
	}
	public String updateByLaptop(String oldname,String newname){
		for(int index =0;index<this.arraylength();index++){
			if(brand[index] == oldname){
				brand[index] = newname;
				System.out.println("The brand is :"+brand[index]);
				return "updated successfully";
			}
			System.out.println("The brand is :"+brand[index]);
			
		}
		return "Not updated";
	}
	public String deleteByLaptop(String brandName){
		for(int index =0;index<this.arraylength();index++){
			if(brand[index] == brandName){
				brand[index] = null;
				System.out.println("The brand is :"+brand[index]);
				return "deleted successfully";
			}
			System.out.println("The brand is :"+brand[index]);
			
		}
		return "Not deleted";
	}
	public String searchByLaptop(String brandName){
		for(String brandNames:brand){
			if(brandName == brandNames){
				return "Found :"+brandName;
			}
		}
		return "search not found";
	}
	}
