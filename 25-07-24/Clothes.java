public class Clothes{

	int index = 0;
	String brand[] = new String[5];
	
	public int arraylength(){
		
		return brand.length;
	}
	public String createClothes(String brandName){
		if(this.index<this.arraylength()){
			brand[index]=brandName;
			index++;
		}
		return "array is full";
		
	}
	public void readByClothes()
	{
		for(int index = 0;index<this.arraylength();index++)
		{
			System.out.println("clothes are :"+brand[index]);
		}
	}
	public String updateByClothes(String oldname,String newname){
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
	public String deleteByClothes(String brandName){
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
	public String searchByClothes(String brandName){
		for(String brandNames:brand){
			if(brandName == brandNames){
				return "Found :"+brandName;
			}
		}
		return "search not found";
	}
	}
