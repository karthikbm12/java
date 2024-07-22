public class Marble {
    public String color;
    public float diameter;
    public String material;
    public boolean isTransparent;
    public float weight;
    public String pattern;

    public Marble() {
        System.out.println("------------------------------");
        System.out.println("No argument constructor");
    }

    public Marble(String color) {
        this.color = color;
        System.out.println("------------------------------");
        System.out.println("1 argument constructor");
        System.out.println("The Marble color is: " + color);
    }

    public Marble(String color, float diameter) {
        this.color = color;
        this.diameter = diameter;
        System.out.println("------------------------------");
        System.out.println("2 argument constructor");
        System.out.println("The Marble color is: " + color);
        System.out.println("The Marble diameter is: " + diameter);
    }

    public Marble(String color, float diameter, String material) {
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        System.out.println("------------------------------");
        System.out.println("3 argument constructor");
        System.out.println("The Marble color is: " + color);
        System.out.println("The Marble diameter is: " + diameter);
        System.out.println("The Marble material is: " + material);
    }

    public Marble(String color, float diameter, String material, boolean isTransparent) {
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        this.isTransparent = isTransparent;
        System.out.println("------------------------------");
        System.out.println("4 argument constructor");
        System.out.println("The Marble color is: " + color);
        System.out.println("The Marble diameter is: " + diameter);
        System.out.println("The Marble material is: " + material);
        System.out.println("The Marble is transparent: " + isTransparent);
    }

    public Marble(String color, float diameter, String material, boolean isTransparent, float weight) {
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        this.isTransparent = isTransparent;
        this.weight = weight;
        System.out.println("------------------------------");
        System.out.println("5 argument constructor");
        System.out.println("The Marble color is: " + color);
        System.out.println("The Marble diameter is: " + diameter);
        System.out.println("The Marble material is: " + material);
        System.out.println("The Marble is transparent: " + isTransparent);
        System.out.println("The Marble weight is: " + weight);
    }

    public Marble(String color, float diameter, String material, boolean isTransparent, float weight, String pattern) {
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        this.isTransparent = isTransparent;
        this.weight = weight;
        this.pattern = pattern;
        System.out.println("------------------------------");
        System.out.println("6 argument constructor");
        System.out.println("The Marble color is: " + color);
        System.out.println("The Marble diameter is: " + diameter);
        System.out.println("The Marble material is: " + material);
        System.out.println("The Marble is transparent: " + isTransparent);
        System.out.println("The Marble weight is: " + weight);
        System.out.println("The Marble pattern is: " + pattern);
    }
}
