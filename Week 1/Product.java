/*Yêu cầu:
1.  Tạo class Product với:
        Thuộc tính id (int), name (String), price (double).
        Constructor để khởi tạo.
        Getter, Setter.
    Phương thức displayInfo() in ra thông tin sản phẩm.
2.  Trong main():
        Tạo một mảng Product[] gồm 3 sản phẩm.
        In ra danh sách sản phẩm.
        Tính và in ra giá trung bình của 3 sản phẩm. */

public class Product {
    private int id;
    private String name;
    private double price;

    //Constructor mặc định
    public Product(){
    }

    //Constructor có tham số
    public Product (int id, String name, double price){
        this.id = id;
        this.name = name;
        this. price = price;
    }
    //Getter và Setter cho id
    public int getId(){
        return id;
    }
    public void setId (int id){
        this.id = id;
    }

    //Getter và Setter cho name
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    //Getter và Setter cho price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    //Hiển thị thông tin
    public void displayInfo(){
        System.out.println ("ID: " + id + " Name: " + name + " Price: " + price +" USD");
    }
    
    //Hàm main
    public static void main (String[] args){
        Product[] products = new Product [3];
        products[0] = new Product (1, "Laptop", 2000);
        products[1] = new Product (2, "Keyboard", 100);
        products[2] = new Product (3, "Mouse", 100);

        System.out.println("Danh sach cac san pham:");
        double total = 0;
        for (Product p : products){
            p.displayInfo();
            total+=p.getPrice();
        }
        double average = total / products.length;
        System.out.println ("Gia trung binh cua 3 san pham la: " + average + " USD");
    }
}

