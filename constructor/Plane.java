public class Plane {
    public String planeName;
    public String type;
    public int capacity;
    public short engines;

    public Plane() {
        this("Boeing 737");
        System.out.println("Default Plane Type");
    }

    public Plane(String planeName) {
        this(180, "Boeing 737");
        System.out.println("Name of the Plane is: " + planeName);
    }

    public Plane(int capacity, String planeName) {
        this((short)2, 180, "Boeing 737");
        System.out.println("Capacity of the Plane is: " + capacity);
        System.out.println("Name of the Plane is: " + planeName);
    }

    public Plane(short engines, int capacity, String planeName) {
        this("Passenger", (short)2, 180, "Boeing 737");
        System.out.println("Number of Engines in the Plane is: " + engines);
        System.out.println("Capacity of the Plane is: " + capacity);
        System.out.println("Name of the Plane is: " + planeName);
    }

    public Plane(String type, short engines, int capacity, String planeName) {
        System.out.println("Type of the Plane is: " + type);
        System.out.println("Number of Engines in the Plane is: " + engines);
        System.out.println("Capacity of the Plane is: " + capacity);
        System.out.println("Name of the Plane is: " + planeName);
    }
}
