public class Car {
    String car_Type;
    int price;
    double length;

    public static void carDetails() {
        System.out.println("The car details are:");
    }

    public static void carType(String car_Type, int price) {
        System.out.println("The car details are: " + car_Type + " " + price);
    }

    public static String carPrice() {
        return "carPrice";
    }

    public static double carLength(double length) {
        return length;
    }
}