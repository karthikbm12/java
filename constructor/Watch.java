public class Watch {
    String brand; 
    String type; 
    String color; 
    boolean isSmartWatch; 
    double price;
    public Watch() {
        this("Generic", "Analog");
        System.out.println("Here is the current information on the default watch");
    }

    public Watch(String brand, String type) {
        this(false, 0.0);
        this.brand = brand;
        this.type = type;
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }

    public Watch(boolean isSmartWatch, double price) {
        this("Black", "Generic");
        this.isSmartWatch = isSmartWatch;
        this.price = price;
        System.out.println("Is the watch a smartwatch: " + isSmartWatch);
        System.out.println("Price: $" + price);
    }
    public Watch(String color, String type) {
        this.color = color;
        this.type = type;
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);