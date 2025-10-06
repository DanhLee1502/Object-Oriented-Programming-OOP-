public class Cylinder extends Circle {
    // Thuộc tính riêng của Cylinder
    private double height;

    // Constructor mặc định
    public Cylinder() {
        super();    // Gọi Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }

    // Constructor với height
    public Cylinder(double height) {
        super();    // Gọi Circle()
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }

    // Constructor với height và radius
    public Cylinder(double height, double radius) {
        super(radius);    // Gọi Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }

    // Constructor với height, radius và color
    public Cylinder(double height, double radius, String color) {
        super(radius, color);   // Gọi Circle(radius, color)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }

    // Getter & Setter cho height
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình trụ
    public double getVolume() {
        return getArea() * height;
    }

    // Override toString
    @Override
    public String toString() {
        return "Cylinder: radius=" + getRadius()
             + ", color=" + getColor()
             + ", height=" + height
             + ", base area=" + getArea()
             + ", volume=" + getVolume();
    }
}
