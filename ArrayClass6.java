public class ArrayClass6 {
    public static void main(String[] args) {
        int[] idNo = {12, 02, 73};
		char[] type = {'a','b','c'};
		long[] strength = { 450L, 200L, 300L };
		String[] classes = {"sectionA","sectionB","sectionC"};
		
		for (int i = 0; i < idNo.length; i++) {
		System.out.println("Elements are :"  + idNo[i]);
        }
		for (int k = 0; k < type.length; k++) {
		System.out.println("Elements are :"  +type[k]);
		}
		for (int n = 0; n < strength.length; n++) {
		System.out.println("Elements are :"  +strength[n]);
		}
		for (int q = 0; q < classes.length; q++) {
		System.out.println("Elements are :"  +classes[q]);
		}
	}
}