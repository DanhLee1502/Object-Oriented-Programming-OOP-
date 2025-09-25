public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);

        System.out.println("Circle 1: radius=" + c1.getRadius() +
                           ", color=" + c1.getColor() +
                           ", area=" + c1.getArea());

        System.out.println("Circle 2: radius=" + c2.getRadius() +
                           ", color=" + c2.getColor() +
                           ", area=" + c2.getArea());
    }
}
