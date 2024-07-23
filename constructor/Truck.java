public class Truck {
    public String truckName;
    public String type;
    public int capacity;
    public short axles;

    public Truck() {
        this("Volvo FH16");
        System.out.println("Default Truck Type");
    }

   
    public Truck(String truckName) {
        this(18, "Volvo FH16");
        System.out.println("Name of the Truck is: " + truckName);
    }

    public Truck(int capacity, String truckName) {
        this((short)4, 18, "Volvo FH16");
        System.out.println("Capacity of the Truck is: " + capacity + " tons");
        System.out.println("Name of the Truck is: " + truckName);
    }

    public Truck(short axles, int capacity, String truckName) {
        this("Freight", (short)4, 18, "Volvo FH16");
        System.out.println("Number of Axles in the Truck is: " + axles);
        System.out.println("Capacity of the Truck is: " + capacity + " tons");
        System.out.println("Name of the Truck is: " + truckName);
    }

    public Truck(String type, short axles, int capacity, String truckName) {
        System.out.println("Type of the Truck is: " + type);
        System.out.println("Number of Axles in the Truck is: " + axles);
        System.out.println("Capacity of the Truck is: " + capacity + " tons");
        System.out.println("Name of the Truck is: " + truckName);
    }
}
