public class Train {
    public String name;
    public int numberOfCarriages;
    public float speed;
    public String color;
    public boolean isElectric;
    public float ticketPrice;

    public Train() {
        System.out.println("------------------------------");
        System.out.println("No argument constructor");
    }

    public Train(String name) {
        this.name = name;
        System.out.println("------------------------------");
        System.out.println("1 argument constructor");
        System.out.println("The Train name is: " + name);
    }

    public Train(String name, int numberOfCarriages) {
        this.name = name;
        this.numberOfCarriages = numberOfCarriages;
        System.out.println("------------------------------");
        System.out.println("2 argument constructor");
        System.out.println("The Train name is: " + name);
        System.out.println("The Train numberOfCarriages is: " + numberOfCarriages);
    }

    public Train(String name, int numberOfCarriages, float speed) {
        this.name = name;
        this.numberOfCarriages = numberOfCarriages;
        this.speed = speed;
        System.out.println("------------------------------");
        System.out.println("3 argument constructor");
        System.out.println("The Train name is: " + name);
        System.out.println("The Train numberOfCarriages is: " + numberOfCarriages);
        System.out.println("The Train speed is: " + speed);
    }

    public Train(String name, int numberOfCarriages, float speed, String color) {
        this.name = name;
        this.numberOfCarriages = numberOfCarriages;
        this.speed = speed;
        this.color = color;
        System.out.println("------------------------------");
        System.out.println("4 argument constructor");
        System.out.println("The Train name is: " + name);
        System.out.println("The Train numberOfCarriages is: " + numberOfCarriages);
        System.out.println("The Train speed is: " + speed);
        System.out.println("The Train color is: " + color);
    }

    public Train(String name, int numberOfCarriages, float speed, String color, boolean isElectric) {
        this.name = name;
        this.numberOfCarriages = numberOfCarriages;
        this.speed = speed;
        this.color = color;
        this.isElectric = isElectric;
        System.out.println("------------------------------");
        System.out.println("5 argument constructor");
        System.out.println("The Train name is: " + name);
        System.out.println("The Train numberOfCarriages is: " + numberOfCarriages);
        System.out.println("The Train speed is: " + speed);
        System.out.println("The Train color is: " + color);
        System.out.println("The Train isElectric is: " + isElectric);
    }

    public Train(String name, int numberOfCarriages, float speed, String color, boolean isElectric, float ticketPrice) {
        this.name = name;
        this.numberOfCarriages = numberOfCarriages;
        this.speed = speed;
        this.color = color;
        this.isElectric = isElectric;
        this.ticketPrice = ticketPrice;
        System.out.println("------------------------------");
        System.out.println("6 argument constructor");
        System.out.println("The Train name is: " + name);
        System.out.println("The Train numberOfCarriages is: " + numberOfCarriages);
        System.out.println("The Train speed is: " + speed);
        System.out.println("The Train color is: " + color);
        System.out.println("The Train isElectric is: " + isElectric);
        System.out.println("The Train ticketPrice is: " + ticketPrice);
    }
}
