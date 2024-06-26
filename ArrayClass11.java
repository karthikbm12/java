public class ArrayClass11 {
    public static void main(String[] args) {
        int[] noOfPins = {1, 2, 3};
		char[] category = {'t','l','s'};
		long[] prices = { 4500L, 2000L, 3000L };
		String[] watchType = {"lg","sonata","titan"};
		
		for (int i = 0; i < noOfPins.length; i++) {
		System.out.println("no Of Pins are :"  + noOfPins[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("category is :"  +category[k]);
		}
		for (int n = 0; n < prices.length; n++) {
		System.out.println("prices are :"  +prices[n]);
		}
		for (int q = 0; q < watchType.length; q++) {
		System.out.println("watchTypes are :"  +watchType[q]);
		}
	}
}