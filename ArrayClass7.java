public class ArrayClass7 {
    public static void main(String[] args) {
        int[] speed = {156, 78, 103, 74, 130};
		char[] category = {'a','u','d'};
		long[] cost = { 450000L, 200000L, 300000L };
		String[] carType = {"audi","toyota","Mercedes"};
		
		for (int i = 0; i < speed.length; i++) {
		System.out.println("Elements are :"  + speed[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("Elements are :"  +category[k]);
		}
		for (int n = 0; n < cost.length; n++) {
		System.out.println("Elements are :"  +cost[n]);
		}
		for (int q = 0; q < carType.length; q++) {
		System.out.println("Elements are :"  +carType[q]);
		}
	}
}