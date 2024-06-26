public class ArrayClass19 {
    public static void main(String[] args) {
		String[] role = {"PromtEngineer","developer","softwareengineer"};
        int[] workingHours = {40,56,23};
		char[] category = {'t','i','p'};
		long[] noOfPeoples = { 45000L, 2000L, 3000L};
		
		for (int i = 0; i < role.length; i++) {
		System.out.println("role is :"  + role[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("Elements are :"  +category[k]);
		}
		for (int n = 0; n < workingHours.length; n++) {
		System.out.println("working Hours are :"  +workingHours[n]);
		}
		for (int q = 0; q < noOfPeoples.length; q++) {
		System.out.println("no Of Peoples are :"  +noOfPeoples[q]);
		}
	}
}