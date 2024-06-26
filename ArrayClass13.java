public class ArrayClass13 {
    public static void main(String[] args) {
        int[] totalVotes = {1, 2, 3, 4, 10};
		char[] partySymbol = {'c','b','j'};
		long[] electionResult = { 45000L, 2000L, 3000L, 40099L };
		String[] candidateName = {"ravi","raju","bhagya"};
		
		for (int i = 0; i < totalVotes.length; i++) {
		System.out.println("total Votes are :"  + totalVotes[i]);
        }
		for (int k = 0; k < partySymbol.length; k++) {
		System.out.println("party Symbols are :"  +partySymbol[k]);
		}
		for (int n = 0; n < electionResult.length; n++) {
		System.out.println("election Results are :"  +electionResult[n]);
		}
		for (int q = 0; q < candidateName.length; q++) {
		System.out.println("candidate Names are :"  +candidateName[q]);
		}
	}
}