public class TruckRunner {

    public static void main(String[] args) {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck("Freightliner Cascadia");
        Truck truck3 = new Truck(25, "Freightliner Cascadia");
        Truck truck4 = new Truck((short)6, 25, "Freightliner Cascadia");
        Truck truck5 = new Truck("Cargo", (short)6, 25, "Freightliner Cascadia");
    }
}
