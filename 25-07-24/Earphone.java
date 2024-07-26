public class EarPhone{

	int index = 0;
	String type[] = new String[5];
	
	public int arraylength(){
		
		return type.length;
	}
	public String createEarPhone(String typeName){
		if(this.index<this.arraylength()){
			type[index]=typeName;
			index++;
		}
		return "array is full";
		
	}
	public void readByEarPhone()
	{
		for(int index = 0;index<this.arraylength();index++)
		{
			System.out.println("EarPhone are :"+type[index]);
		}
	}
	public String updateByEarPhone(String oldname,String newname){
		for(int index =0;index<this.arraylength();index++){
			if(type[index] == oldname){
				type[index] = newname;
				System.out.println("The type is :"+type[index]);
				return "updated successfully";
			}
			System.out.println("The type is :"+type[index]);
			
		}
		return "Not updated";
	}
	public String deleteByEarPhone(String typeName){
		for(int index =0;index<this.arraylength();index++){
			if(type[index] == typeName){
				type[index] = null;
				System.out.println("The type is :"+type[index]);
				return "deleted successfully";
			}
			System.out.println("The type is :"+type[index]);
			
		}
		return "Not deleted";
	}
	public String searchByEarPhone(String typeName){
		for(String typeNames:type){
			if(typeName == typeNames){
				return "Found :"+typeName;
			}
		}
		return "search not found";
	}
	}
