public class Bottle {
    int capacity;
    String material; 
    String color; 
    boolean isReusable; 
    double price; 

    public Bottle() {
        this(500, "Plastic");
        System.out.println("Here is the current information on the default bottle");
    }

    public Bottle(int capacity, String material) {
        this(false, 0.0);
        this.capacity = capacity;
        this.material = material;
        System.out.println("Capacity: " + capacity + "ml");
        System.out.println("Material: " + material);
    }

    public Bottle(boolean isReusable, double price) {
        this("Transparent", "Plastic");
        this.isReusable = isReusable;
        this.price = price;
        System.out.println("Is the bottle reusable: " + isReusable);
        System.out.println("Price: $" + price);
    }

    public Bottle(String color, String material) {
        this.color = color;
        this.material = material;
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }
	}