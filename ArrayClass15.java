public class ArrayClass15 {
    public static void main(String[] args) {
        int[] ticketId = {1,2,3};
        long[] VisitorId = {123456789L,54634678L,876654L};
        char[] ticketCategory = {'A','B','K'};
		String[] places = {"bang","mumbai","belgavi"};
		
		for (int i = 0; i < ticketId.length; i++) {
		System.out.println("ticketIds are :"  + ticketId[i]);
        }
		for (int k = 0; k < VisitorId.length; k++) {
		System.out.println("VisitorId are :"  +VisitorId[k]);
		}
		for (int n = 0; n < ticketCategory.length; n++) {
		System.out.println("ticketCategory are :"  +ticketCategory[n]);
		}
		for (int q = 0; q < places.length; q++) {
		System.out.println("places are :"  +places[q]);
		}
	}
}