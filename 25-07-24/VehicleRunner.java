public class VehicleRunner {
    public static void main(String args[]) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Number of vehicles: " + vehicle.arraylength());
        vehicle.createVehicle("Toyota");
        vehicle.createVehicle("Honda");
        vehicle.createVehicle("Ford");
        vehicle.createVehicle("Chevrolet");
        vehicle.createVehicle("BMW");
        vehicle.createVehicle("Mercedes");
        vehicle.readByVehicle();
        String update = vehicle.updateByVehicle("Toyota", "Tesla");
        System.out.println(update);
        String delete = vehicle.deleteByVehicle("Honda");
        System.out.println(delete);
        String search = vehicle.searchByVehicle("BMW");
        System.out.println(search);
    }
}