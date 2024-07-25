public class Steel {

    public void steelDetails() {
        System.out.println("Steel Details");
    }

    public void steelDetails(String type, double weight) {
        System.out.println("Steel Type is: " + type);
        System.out.println("Steel Weight is: " + weight + " kg");
        this.steelDetails();
    }

    public static void main(String[] args) {
        Steel steel = new Steel();
        steel.steelDetails();
        steel.steelDetails("Stainless", 25.5);
    }
}