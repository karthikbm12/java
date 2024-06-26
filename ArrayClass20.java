public class ArrayClass20 {
    public static void main(String[] args) {
      int[] waterAmountMl = {500,466,880};
	  long[] numberOfMolecules = {15000000000L,678955555L,908877777L};
	  char[] waterState = {'L','M','F'};
		String[] waterTypes = {"brakish","fresh","salt"};
		
		for (int i = 0; i < waterAmountMl.length; i++) {
		System.out.println("water Amount are :"  + waterAmountMl[i]);
        }
		for (int k = 0; k < numberOfMolecules.length; k++) {
		System.out.println("number Of Molecules are :"  +numberOfMolecules[k]);
		}
		for (int n = 0; n < waterState.length; n++) {
		System.out.println("water States are :"  +waterState[n]);
		}
		for (int q = 0; q < waterTypes.length; q++) {
		System.out.println("water Types are :"  +waterTypes[q]);
		}
	}
}