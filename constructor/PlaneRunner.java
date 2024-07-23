public class PlaneRunner {

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane("Boeing 737");
        Plane plane3 = new Plane(180, "Boeing 737");
        Plane plane4 = new Plane(2, 180, "Boeing 737");
        Plane plane5 = new Plane("Passenger", 2, 180, "Boeing 737");
    }
}
