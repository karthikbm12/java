public class CollegeRunner {
    public static void main(String args[]) {
        College college = new College();
        System.out.println("Number of Colleges: " + college.arraylength());
        System.out.println(college.createCollege("CSE"));
        System.out.println(college.createCollege("ISE"));
        System.out.println(college.createCollege("EEE"));
        System.out.println(college.createCollege("ECE"));
        System.out.println(college.createCollege("AIML"));
        college.readByCollege();
        String update = college.updateByCollege("ISE", "Data Science");
        System.out.println(update);
        String delete = college.deleteByCollege("EEE");
        System.out.println(delete);
        String search = college.searchByCollege("CSE");
        System.out.println(search);
     
    }
}
