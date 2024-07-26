public class Vehicle{

	int index = 0;
	String name[] = new String[5];
	
	public int arraylength(){
		
		return name.length;
	}
	public String createVehicle(String nameName){
		if(this.index<this.arraylength()){
			name[index]=nameName;
			index++;
		}
		return "array is full";
		
	}
	public void readByVehicle()
	{
		for(int index = 0;index<this.arraylength();index++)
		{
			System.out.println("Vehicle are :"+name[index]);
		}
	}
	public String updateByVehicle(String oldname,String newname){
		for(int index =0;index<this.arraylength();index++){
			if(name[index] == oldname){
				name[index] = newname;
				System.out.println("The name is :"+name[index]);
				return "updated successfully";
			}
			System.out.println("The name is :"+name[index]);
			
		}
		return "Not updated";
	}
	public String deleteByVehicle(String nameName){
		for(int index =0;index<this.arraylength();index++){
			if(name[index] == nameName){
				name[index] = null;
				System.out.println("The name is :"+name[index]);
				return "deleted successfully";
			}
			System.out.println("The name is :"+name[index]);
			
		}
		return "Not deleted";
	}
	public String searchByVehicle(String nameName){
		for(String nameNames:name){
			if(nameName == nameNames){
				return "Found :"+nameName;
			}
		}
		return "search not found";
	}
	}
