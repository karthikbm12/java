public class BankLoan{
		public static void main(String args[]){
		String degree="BachelorofEng";
		boolean job=true;
		int age=35;
		if(age>=25 && age<=60){
			
			System.out.println("minimum age required"+age);
		}
		else if(degree == BachelorofEng){
			System.out.println("The degree is matched"+degree);
			
		}
		else if(job==true){
			System.out.println("The person selected for loan"+job);
		}
		else{
			System.out.println("you are not selected for loan");
		}
		}
		}