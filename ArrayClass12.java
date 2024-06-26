public class ArrayClass12 {
    public static void main(String[] args) {
        int[] articles = {1, 2, 3, 4, 10};
		char[] category = {'n','w','s'};
		long[] noOfWordCount = { 45000L, 2000L, 3000L, 40099L };
		String[] newsTypes = {"covid19","sports","exams"};
		
		for (int i = 0; i < articles.length; i++) {
		System.out.println("articles are :"  + articles[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("categories are :"  +category[k]);
		}
		for (int n = 0; n < noOfWordCount.length; n++) {
		System.out.println("no Of Word Counts are :"  +noOfWordCount[n]);
		}
		for (int q = 0; q < newsTypes.length; q++) {
		System.out.println("news Types are :"  +newsTypes[q]);
		}
	}
}