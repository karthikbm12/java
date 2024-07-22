public class MarbleRunner {
    public static void main(String[] args) {
        Marble marble1 = new Marble();
        Marble marble2 = new Marble("Red");
        Marble marble3 = new Marble("Red", 1.5f);
        Marble marble4 = new Marble("Red", 1.5f, "Glass");
        Marble marble5 = new Marble("Red", 1.5f, "Glass", true);
        Marble marble6 = new Marble("Red", 1.5f, "Glass", true, 0.02f);
        Marble marble7 = new Marble("Red", 1.5f, "Glass", true, 0.02f, "Swirl");
    }
}
