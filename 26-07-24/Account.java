public class Account{
	private String bankName;
	private long accountNo;
	private String bankHolderName;
	private double balance;
	private String account_type;
	private String branchName;
	private String branchCode;
	private int amount;
	private String email;
	private String adress;
	
	
	public String getbankName(){
		return bankName;
	}
	public void setbankName(String bankName){
		this.bankName=bankName;
	}
	public long getaccountNo(){
		return accountNo;
	}
	public void setaccountNo(long accountNo){
		this.accountNo=accountNo;
	}
	public String getbankHolderName(){
		return bankHolderName;
	}
	public void setbankHolderName(String bankHolderName){
	 this.bankHolderName=bankHolderName;	
	}
	public double getbalance(){
		return balance;
	}
	public void setbalance(double balance){
		this.balance=balance;
	}
	public String getaccount_type(){
		return account_type;
	}
	public void setaccount_type(String account_type){
		this.account_type=account_type;
	}
	public String getbranchName(){
		return branchName;
	}
	public void setbranchName(String branchName){
		this.branchName=branchName;
	}
	public String getbranchCode(){
		return branchCode;
	}
	public void setbranchCode(String branchCode){
		this.branchCode=branchCode;
	}
	public int getamount(){
		return amount;
	}
	public void setamount(int amount){
		this.amount=amount;
	}
	public String getemail(){
		return email;
	}
	public void setemail(String email){
		this.email=email;
	}
	public String getadress(){
		return adress;
	}
	public void setadress(String adress){
		this.adress=adress;
	}
}