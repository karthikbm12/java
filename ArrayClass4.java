public class ArrayClass4 {
    public static void main(String[] args) {
        int[] experiance = {1, 2, 3, 4, 10};
		char[] category = {'t','i','e','r','s'};
		long[] noOfPeoples = { 45000L, 2000L, 3000L, 40099L };
		String[] places = {"bang","bhalki","sirsi"};
		
		for (int i = 0; i < experiance.length; i++) {
		System.out.println("Elements are :"  + experiance[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("Elements are :"  +category[k]);
		}
		for (int n = 0; n < noOfPeoples.length; n++) {
		System.out.println("Elements are :"  +noOfPeoples[n]);
		}
		for (int q = 0; q < places.length; q++) {
		System.out.println("Elements are :"  +places[q]);
		}
	}
}