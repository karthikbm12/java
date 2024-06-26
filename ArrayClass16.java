public class ArrayClass16 {
    public static void main(String[] args) {
        int[]  attendance = {25000,40000,55550};
		long[] matchDuration = {12000000L,1333300L,888000L};
		char[] playerInitial = {'D','M','K'};
		String[] playersNames = {"virat","dhoni","hardik"};
		
		for (int i = 0; i < attendance.length; i++) {
		System.out.println("attendance are :"  + attendance[i]);
        }
		for (int k = 0; k < matchDuration.length; k++) {
		System.out.println("match Duration are :"  +matchDuration[k]);
		}
		for (int n = 0; n < playerInitial.length; n++) {
		System.out.println("player Initial are :"  +playerInitial[n]);
		}
		for (int q = 0; q < playersNames.length; q++) {
		System.out.println("players Names are :"  +playersNames[q]);
		}
	}
}