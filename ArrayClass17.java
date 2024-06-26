public class ArrayClass17 {
    public static void main(String[] args) {		
        int[] releaseYear = {2019,2023,2024};
        char[] genCode = {'P','S','N'};
		String[] songTitle = {"classic","hiphop","rocktrack"};
		long[] noOfseconds = { 45000L, 2000L, 3000L };
		
		
		for (int i = 0; i < releaseYear.length; i++) {
		System.out.println("release Year are :"  + releaseYear[i]);
        }
		for (int k = 0; k < genCode.length; k++) {
		System.out.println("genCode are :"  +genCode[k]);
		}
		for (int n = 0; n < songTitle.length; n++) {
		System.out.println("song Title are :"  +songTitle[n]);
		}
		for (int q = 0; q < noOfseconds.length; q++) {
		System.out.println("no Of seconds are :"  +noOfseconds[q]);
		}
	}
}