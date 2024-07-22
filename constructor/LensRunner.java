public class LensRunner {
    public static void main(String[] args) {
        Lens lens1 = new Lens();
        Lens lens2 = new Lens("Canon");
        Lens lens3 = new Lens("Canon", 50.0f);
        Lens lens4 = new Lens("Canon", 50.0f, "Prime");
        Lens lens5 = new Lens("Canon", 50.0f, "Prime", 1.8f);
        Lens lens6 = new Lens("Canon", 50.0f, "Prime", 1.8f, false);
        Lens lens7 = new Lens("Canon", 50.0f, "Prime", 1.8f, false, 4.5f);
    }
}
