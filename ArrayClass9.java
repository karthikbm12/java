public class ArrayClass9 {
    public static void main(String[] args) {
        int[] count = {1, 2, 3};
		char[] type = {'a','o','b'};
		long[] liters = { 45000L, 2000L, 3000L};
		String[] personNames = {"aruu","vaii","sakshi"};
		
		for (int i = 0; i < count.length; i++) {
		System.out.println("Elements are :"  + count[i]);
        }
		for (int k = 0; k < type.length; k++) {
		System.out.println("Elements are :"  +type[k]);
		}
		for (int n = 0; n < liters.length; n++) {
		System.out.println("Elements are :"  +liters[n]);
		}
		for (int q = 0; q < personNames.length; q++) {
		System.out.println("Elements are :"  +personNames[q]);
		}
	}
}