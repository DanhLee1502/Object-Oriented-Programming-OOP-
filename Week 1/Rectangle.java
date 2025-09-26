/*Yêu cầu:
1.  Tạo class Rectangle với:
        Thuộc tính width (double), height (double).
        Constructor để khởi tạo width, height.
        Getter, Setter cho width, height.
        Phương thức getArea() trả về diện tích.
        Phương thức getPerimeter() trả về chu vi.
2.  Trong main():
        Tạo 2 hình chữ nhật với kích thước khác nhau.
        In ra diện tích và chu vi của từng hình. */

public class Rectangle {
    private double width;
    private double height;
 
    //Constructor mặc định
    public Rectangle(){

    }

    //Constructor có tham số
    public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
    }
    
    //Getter cho width
    public double getWidth(){
        return width;
    }

    //Setter cho width
    public void setWidth(double width){
        this.width = width;
    }

    //Getter cho height
    public double getHeight(){
        return height;
    }

    //Setter cho height
    public void setHeight(double height){
        this.height = height;
    }

    //Tính diện tích
    public double getArea(){
        return width*height;
    }

    //Tính chu vi
    public double getPerimeter(){
        return (width + height)*2;
    }

    //Hàm main
    public static void main(String[] args){
        Rectangle r1 = new Rectangle (2,5);
        Rectangle r2 = new Rectangle (3,6);
        System.out.println ("Rectangle 1: Area = " + r1.getArea() +
                            " Perimeter = " + r1.getPerimeter());
        System.out.println ("Rectangle 2: Area = " + r2.getArea() +
                            " Perimeter = " + r2.getPerimeter());
    }
}

