public class ArrayClass10 {
    public static void main(String[] args) {
        int[] noOfBuildings = {17, 2, 3};
		char[] category = {'c','r','c'};
		long[] expenditure = { 450007L, 20009L, 30800L };
		String[] materials = {"cement","road","concrete"};
		
		for (int i = 0; i < noOfBuildings.length; i++) {
		System.out.println("no Of Buildings are :"  + noOfBuildings[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("category are :"  +category[k]);
		}
		for (int n = 0; n < expenditure.length; n++) {
		System.out.println("expenditure are :"  +expenditure[n]);
		}
		for (int q = 0; q < materials.length; q++) {
		System.out.println("materials are :"  +materials[q]);
		}
	}
}