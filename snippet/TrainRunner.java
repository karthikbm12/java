public class TrainRunner {
    public static void main(String args[]) {
        Train train1 = new Train("Express");
        Train train2 = new Train("Express", 10);
        Train train3 = new Train("Express", 10, 80.0f);
        Train train4 = new Train("Express", 10, 80.0f, "Blue");
        Train train5 = new Train("Express", 10, 80.0f, "Blue", true);
        Train train6 = new Train("Express", 10, 80.0f, "Blue", true, 120.0f);
    }
}
