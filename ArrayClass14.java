public class ArrayClass14 {
    public static void main(String[] args) {
        int[] trainNumber = {1, 2, 3};
		char[] category = {'t','r','a'};
		long[] noOfPeoples = { 450L, 200L, 3000L};
		String[] nextStationName = {"bang","bhalki","sirsi"};
		
		for (int i = 0; i < trainNumber.length; i++) {
		System.out.println("train Number is :"  + trainNumber[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("category are :"  +category[k]);
		}
		for (int n = 0; n < noOfPeoples.length; n++) {
		System.out.println("no Of Peoples are :"  +noOfPeoples[n]);
		}
		for (int q = 0; q < nextStationName.length; q++) {
		System.out.println("next Station Name are :"  +nextStationName[q]);
		}
	}
}