public class TrainRunner {
    public static void main(String args[]) {
        Train trainDetails = new Train();

        trainDetails.setTrainName("Express Train");
        System.out.println("The train name is: " + trainDetails.getTrainName());

        trainDetails.setTrainNumber(12345);
        System.out.println("The train number is: " + trainDetails.getTrainNumber());

        trainDetails.setTrainType("Superfast");
        System.out.println("The train type is: " + trainDetails.getTrainType());

        trainDetails.setNumberOfCoaches(20);
        System.out.println("The number of coaches is: " + trainDetails.getNumberOfCoaches());

    }
}
