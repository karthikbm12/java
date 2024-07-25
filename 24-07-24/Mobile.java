public class Mobile {

    // instance variables
    String modelName;
    String brand;
    double price;
    char grade;
    String ownerName;
    
    // static variables
    static int totalUnitsSold;
    static int warrantyYears;
    static boolean isSmartphone;
    static boolean isAvailable;
    static boolean isHighEnd;
    
    public Mobile() {
        this.modelName = "Galaxy S21";
        this.brand = "Samsung";
        this.price = 799.99;
        this.grade = 'A';
        this.ownerName = "John Doe";
        
        totalUnitsSold = 5000000;
        warrantyYears = 2;
        isSmartphone = true;
        isAvailable = true;
        isHighEnd = true;
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        System.out.println("Model Name: " + mobile.modelName);
        System.out.println("Brand: " + mobile.brand);
        System.out.println("Price: $" + mobile.price);
        System.out.println("Grade: " + mobile.grade);
        System.out.println("Owner Name: " + mobile.ownerName);
        System.out.println("Total Units Sold: " + totalUnitsSold);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Is Smartphone: " + isSmartphone);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is High End: " + isHighEnd);
    }
}
