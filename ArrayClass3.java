public class ArrayClass3 {
    public static void main(String[] args) {
        int[] specialNumbers = {11, 22, 13, 54, 75};
		char[] grades = {'a','b','c','d','e'};
		long[] noOfPeoples = { 10000L, 2000L, 3000L, 40099L };
		String[] mobiles = {"vivo","oppo","poco"};
		
		for (int i = 0; i < specialNumbers.length; i++) {
		System.out.println("Elements are :"  + specialNumbers[i]);
        }
		for (int k = 0; k < grades.length; k++) {
		System.out.println("Elements are :"  +grades[k]);
		}
		for (int n = 0; n < noOfPeoples.length; n++) {
		System.out.println("Elements are :"  +noOfPeoples[n]);
		}
		for (int q = 0; q < mobiles.length; q++) {
		System.out.println("Elements are :"  +mobiles[q]);
		}
	}
}