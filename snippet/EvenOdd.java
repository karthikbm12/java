 public class EvenOdd{
	public static void main(String args[]){
	int numbers[] = {2,3,4,5,6,7,8,10};
	int counter_even=0,counter_odd=0;
	for(int i=0;i<numbers.length;i++){
	 if(numbers[i]%2==0){
	  counter_even++;
	 }else{
		 counter_odd++;
	 }
	}
	System.out.println("The even count is :"+counter_even);
	System.out.println("The odd count is :"+counter_odd);
	
	}
 }