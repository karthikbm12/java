public class EarPhoneRunner {
    public static void main(String args[]) {
        EarPhone eartype = new EarPhone();
        System.out.println("Number of eart ypes: " + eartype.arraylength());
        System.out.println(eartype.createEarPhone("noiseless"));
        System.out.println(eartype.createEarPhone("wireless earphone"));
        System.out.println(eartype.createEarPhone("wired earphone"));
        System.out.println(eartype.createEarPhone("Neck bands"));
        System.out.println(eartype.createEarPhone("bone conduction"));
        eartype.readByEarPhone();
        String update = eartype.updateByEarPhone("noiseless", "Active noise cancellation");
        System.out.println(update);
        String delete = eartype.deleteByEarPhone("wired earphone");
        System.out.println(delete);
        String search = eartype.searchByEarPhone("bone conduction");
        System.out.println(search);
     
    }
}
