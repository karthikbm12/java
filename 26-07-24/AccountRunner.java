public class AccountRunner{
	public static void main(String args[]){
	
	Account details = new  Account();
	
	details.setbankName("hdfc");
	System.out.println("the bank name is :"+details.getbankName());
	
	details.setaccountNo(3459203093l);
	System.out.println("The account no is :"+details.getaccountNo());
	
	details.setbankHolderName("Raghu");
	System.out.println("The person name is:"+details.getbankHolderName());
	
	details.setbalance(5000.05);
	System.out.println("The bank balance is :"+details.getbalance());
	
	details.setaccount_type("Savings");
	System.out.println("The account type is :"+details.getaccount_type());
	
	details.setbranchName("Kolar");
	System.out.println("The branch is :"+details.getbranchName());
	
	details.setbranchCode("IFSC0012");
	System.out.println("The brach is :"+details.getbranchCode());
	
	details.setamount(25000);
	System.out.println("The amount is :"+details.getamount());
	
	details.setemail("raghu56@gmail.com");
	System.out.println("The email is :"+details.getemail());
	
	details.setadress("Malur");
	System.out.println("The address of person is:"+details.getadress());
	
	}
}