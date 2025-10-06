public class Circle {
    // Thuộc tính private
    private double radius;
    private String color;

    // Bộ khởi tạo mặc định
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle()");
    }

    // Bộ khởi tạo với bán kính
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle(radius)");
    }

    // Bộ khởi tạo với bán kính và màu
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Constructed a Circle with Circle(radius, color)");
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Mô tả thông tin đối tượng theo dạng chuỗi
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    // Tính diện tích hình tròn
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
