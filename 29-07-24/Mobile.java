public class Mobile {
    private String brand;
    private String model;
    private double price;

    public Mobile() {
        System.out.println("This is a No Argument Constructor");
    }

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

        System.out.println("The Mobile Brand is: " + brand);
        System.out.println("The Mobile Model is: " + model);
        System.out.println("The Mobile Price is: " + price);
    }

    public void setMobileBrand(String brand) {
        this.brand = brand;
    }

    public String getMobileBrand() {
        return this.brand;
    }

    public void setMobileModel(String model) {
        this.model = model;
    }

    public String getMobileModel() {
        return this.model;
    }

    public void setMobilePrice(double price) {
        this.price = price;
    }

    public double getMobilePrice() {
        return this.price;
    }

    public void Mobile() {
        this.Mobile("Unknown Brand");
        System.out.println("Without return type without arguments");
    }

    public void Mobile(String brand) {
        System.out.println(this.brand);
        System.out.println("Without return type with arguments");
        System.out.println("The Mobile Brand is: " + brand);
    }

    public String Mobile1() {
        this.Mobile("Unknown Brand", "Unknown Model", 0.0);
        System.out.println("With return type without arguments");
        return "Returned Success";
    }

    public String Mobile3(String brand, String model, double price) {
        System.out.println("With return type with arguments");
        System.out.println("The Mobile Brand is: " + brand);
        System.out.println("The Mobile Model is: " + model);
        System.out.println("The Mobile Price is: " + price);
        return "Success";
    }
}
