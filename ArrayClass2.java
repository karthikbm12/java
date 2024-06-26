public class ArrayClass2 {
    public static void main(String[] args) {
        int[] randomNumbers = {1, 2, 3, 4, 5};
		char[] initials = {'v','a','i','s','h'};
		long[] population = { 10000L, 2000L, 3000L, 40099L };
		String[] headlines = {"news","movie","covid19"};
		System.out.println("Array length: " + randomNumbers.length);
		System.out.println("Array length: " + initials.length);
		System.out.println("Array length: " + population.length);
		System.out.println("Array length: " + headlines.length);
		for (int i = 0; i < randomNumbers.length; i++) {
		System.out.println("Elements are :"  + randomNumbers[i]);
        }
		for (int k = 0; k < initials.length; k++) {
		System.out.println("Elements are :"  +initials[k]);
		}
		for (int n = 0; n < population.length; n++) {
		System.out.println("Elements are :"  +population[n]);
		}
		for (int q = 0; q < headlines.length; q++) {
		System.out.println("Elements are :"  +headlines[q]);
		}
	}
}