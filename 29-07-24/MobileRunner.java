public class MobileRunner {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        Mobile mobile1 = new Mobile();
        System.out.println("--------------------------");
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S21", 799.99);
        System.out.println("--------------------------");
        
        mobile2.setMobileBrand("Apple");
        System.out.println(mobile2.getMobileBrand());
        
        mobile2.setMobileModel("iPhone 13");
        System.out.println(mobile2.getMobileModel());
        
        mobile2.setMobilePrice(999.99);
        System.out.println(mobile2.getMobilePrice());
        
        System.out.println("--------------------------");
        mobile2.Mobile();
        System.out.println("--------------------------");
    }
}
