public class College{

	int index = 0;
	String courses[] = new String[5];
	
	public int arraylength(){
		
		return courses.length;
	}
	public String createCollege(String coursesName){
		if(this.index<this.arraylength()){
			courses[index]=coursesName;
			index++;
		}
		return "array is full";
		
	}
	public void readByCollege()
	{
		for(int index = 0;index<this.arraylength();index++)
		{
			System.out.println("College are :"+courses[index]);
		}
	}
	public String updateByCollege(String oldname,String newname){
		for(int index =0;index<this.arraylength();index++){
			if(courses[index] == oldname){
				courses[index] = newname;
				System.out.println("The courses is :"+courses[index]);
				return "updated successfully";
			}
			System.out.println("The courses is :"+courses[index]);
			
		}
		return "Not updated";
	}
	public String deleteByCollege(String coursesName){
		for(int index =0;index<this.arraylength();index++){
			if(courses[index] == coursesName){
				courses[index] = null;
				System.out.println("The courses is :"+courses[index]);
				return "deleted successfully";
			}
			System.out.println("The courses is :"+courses[index]);
			
		}
		return "Not deleted";
	}
	public String searchByCollege(String coursesName){
		for(String coursesNames:courses){
			if(coursesName == coursesNames){
				return "Found :"+coursesName;
			}
		}
		return "search not found";
	}
	}
