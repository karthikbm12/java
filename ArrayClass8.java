public class ArrayClass8 {
    public static void main(String[] args) {
        int[] vaccancies = {1, 2, 3};
		char[] category = {'t','i','e'};
		long[] salary = { 45000L, 20000L, 35000L };
		String[] jobType = {"developer","tester","admin"};
		
		for (int i = 0; i < vaccancies.length; i++) {
		System.out.println("Elements are :"  + vaccancies[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("Elements are :"  +category[k]);
		}
		for (int n = 0; n < salary.length; n++) {
		System.out.println("Elements are :"  +salary[n]);
		}
		for (int q = 0; q < jobType.length; q++) {
		System.out.println("Elements are :"  +jobType[q]);
		}
	}
}