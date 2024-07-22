public class Lens {
    public String brand;
    public float focalLength;
    public String type;
    public float aperture;
    public boolean isZoom;
    public float rating;

    public Lens() {
        System.out.println("------------------------------");
        System.out.println("No argument constructor");
    }

    public Lens(String brand) {
        this.brand = brand;
        System.out.println("------------------------------");
        System.out.println("1 argument constructor");
        System.out.println("The Lens brand is: " + brand);
    }

    public Lens(String brand, float focalLength) {
        this.brand = brand;
        this.focalLength = focalLength;
        System.out.println("------------------------------");
        System.out.println("2 argument constructor");
        System.out.println("The Lens brand is: " + brand);
        System.out.println("The Lens focal length is: " + focalLength);
    }

    public Lens(String brand, float focalLength, String type) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.type = type;
        System.out.println("------------------------------");
        System.out.println("3 argument constructor");
        System.out.println("The Lens brand is: " + brand);
        System.out.println("The Lens focal length is: " + focalLength);
        System.out.println("The Lens type is: " + type);
    }

    public Lens(String brand, float focalLength, String type, float aperture) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.type = type;
        this.aperture = aperture;
        System.out.println("------------------------------");
        System.out.println("4 argument constructor");
        System.out.println("The Lens brand is: " + brand);
        System.out.println("The Lens focal length is: " + focalLength);
        System.out.println("The Lens type is: " + type);
        System.out.println("The Lens aperture is: " + aperture);
    }

    public Lens(String brand, float focalLength, String type, float aperture, boolean isZoom) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.type = type;
        this.aperture = aperture;
        this.isZoom = isZoom;
        System.out.println("------------------------------");
        System.out.println("5 argument constructor");
        System.out.println("The Lens brand is: " + brand);
        System.out.println("The Lens focal length is: " + focalLength);
        System.out.println("The Lens type is: " + type);
        System.out.println("The Lens aperture is: " + aperture);
        System.out.println("The Lens isZoom is: " + isZoom);
    }

    public Lens(String brand, float focalLength, String type, float aperture, boolean isZoom, float rating) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.type = type;
        this.aperture = aperture;
        this.isZoom = isZoom;
        this.rating = rating;
        System.out.println("------------------------------");
        System.out.println("6 argument constructor");
        System.out.println("The Lens brand is: " + brand);
        System.out.println("The Lens focal length is: " + focalLength);
        System.out.println("The Lens type is: " + type);
        System.out.println("The Lens aperture is: " + aperture);
        System.out.println("The Lens isZoom is: " + isZoom);
        System.out.println("The Lens rating is: " + rating);
    }
}
