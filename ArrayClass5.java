public class ArrayClass5 {
    public static void main(String[] args) {
        int[] versions = {1, 2, 3, 4, 10};
		char[] categoryType = {'t','i','e','r','s'};
		long[] cost = { 45000L, 65000L, 35000L, };
		String[] laptopTypes = {"lenovo","hp","dell"};
		
		for (int i = 0; i < versions.length; i++) {
		System.out.println("Elements are :"  + versions[i]);
        }
		for (int k = 0; k < categoryType.length; k++) {
		System.out.println("Elements are :"  +categoryType[k]);
		}
		for (int n = 0; n < cost.length; n++) {
		System.out.println("Elements are :"  +cost[n]);
		}
		for (int q = 0; q < laptopTypes.length; q++) {
		System.out.println("Elements are :"  +laptopTypes[q]);
		}
	}
}