public class CountNumber{
		public static void main(String args[]){
		int numbers[]={0,1,0,0,1,0,1,0,1};
		int counterzero=0,counterone=0;
		for(int i=0;i<numbers.length;i++){
		if(numbers[i]==0){
		counterzero++;
		}else if (numbers[i]==1){
		counterone++;
		}
		System.out.println("The no of zeros are"+counterzero);
		System.out.println("The no of ones are"+counterone);
		}
		}
		}