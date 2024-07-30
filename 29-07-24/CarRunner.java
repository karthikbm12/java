public class CarRunner {
    public static void main(String args[]) {
        Car car = new Car();
        car.carDetails();
        car.carType("SUV", 30000);
        String carPrice = car.carPrice();
        System.out.println("The car details are: " + carPrice);
        double carLength = car.carLength(4.5);
        System.out.println("The car details are: " + carLength);
    }
}
