public class Solar {
    int capacity;
    String material; 
    String color; 
    boolean isRenewable;
    double price; 
    public Solar() {
        this(100, "Silicon");
        System.out.println("Here is the current information on the default solar panel");
    }

    public Solar(int capacity, String material) {
        this(true, 0.0);
        this.capacity = capacity;
        this.material = material;
        System.out.println("Capacity: " + capacity + " watts");
        System.out.println("Material: " + material);
    }

    public Solar(boolean isRenewable, double price) {
        this("Black", "Silicon");
        this.isRenewable = isRenewable;
        this.price = price;
        System.out.println("Is the solar energy system renewable: " + isRenewable);
        System.out.println("Price: $" + price);
    }

    public Solar(String color, String material) {
        this.color = color;
        this.material = material;
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }
}