public class Laptop {

    public static void laptopDetails() {
        System.out.println("Laptop Details");
        
        // constructor chaining
        Laptop.laptopDetails("MacBook Pro", 2500);
    }
    
    public static void laptopDetails(String name, int price) {
        System.out.println("Laptop Name is: " + name);
        System.out.println("Laptop Price is: " + price);
    }
}
