public class LaptopRunner {
    public static void main(String args[]) {
        Laptop laptop = new Laptop();
        System.out.println("Number of laptops: " + laptop.arraylength());
        System.out.println(laptop.createLaptop("Dell"));
        System.out.println(laptop.createLaptop("HP"));
        System.out.println(laptop.createLaptop("Apple"));
        System.out.println(laptop.createLaptop("Lenovo"));
        System.out.println(laptop.createLaptop("Asus"));
        laptop.readByLaptop();
        String update = laptop.updateByLaptop("Dell", "Acer");
        System.out.println(update);
        String delete = laptop.deleteByLaptop("HP");
        System.out.println(delete);
        String search = laptop.searchByLaptop("ffggg");
        System.out.println(search);
     
    }
}
