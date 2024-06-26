public class EvenOdd {
	public static void main (String[] args){
	int[] numbers = {5,16,29,34,56,67};
	int even = 0;
	int odd = 0;
	for(int i=0;i<numbers.length;i++){
	if(numbers[i]%2 == 0){
	even++;
	}else
	{
	odd++;
	}
	System.out.println("The even number is :"+ even);
	System.out.println("The odd number is :"+ odd);
	}
	}
				}