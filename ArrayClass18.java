public class ArrayClass18 {
    public static void main(String[] args) {
		String[] softwareName = {"copilot","chatgpt","chrome"};
        char[] category = {'A','B','N'};
        long[] downloads = {1000000L,33334566L,78904577L};
		int[] versions = {3,6,5};
		
		for (int i = 0; i < softwareName.length; i++) {
		System.out.println("softwareName are :"  + softwareName[i]);
        }
		for (int k = 0; k < category.length; k++) {
		System.out.println("category are :"  +category[k]);
		}
		for (int n = 0; n < downloads.length; n++) {
		System.out.println("downloads are :"  +downloads[n]);
		}
		for (int q = 0; q < versions.length; q++) {
		System.out.println("versions are :"  +versions[q]);
		}
	}
}