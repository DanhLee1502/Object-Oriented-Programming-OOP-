public class ENTY {
    public static void main(String[] agrs){
        // -------------------------------
        // 1️⃣ Kiểm tra lớp Point
        // -------------------------------
        POINT A=new POINT(2, 3);
        POINT B=new POINT(6, 7);
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("Khoang cach AB = " + A.distance(B));
        System.out.println();

        // -------------------------------
        // 2️⃣ Kiểm tra lớp Line
        // -------------------------------
        LINE line = new LINE(A, B);
        System.out.println("Doan thang: " + line);
        System.out.println("Do dai doan thang AB = " + line.distance());
        System.out.println("Giao diem voi truc X (xIntercept) = " + line.getXintercept());
        System.out.println("Giao diem voi truc Y (yIntercept) = " + line.getYintercept());
        System.out.println();

        // -------------------------------
        // 3️⃣ Kiểm tra lớp Circle
        // -------------------------------
        POINT center = new POINT(0, 0);
        CIRCLE circle = new CIRCLE(center, 5);
        System.out.println("Hinh tron: " + circle);
        System.out.println("Dien tich hinh tron = " + circle.getArea());
        System.out.println();

        // -------------------------------
        // 4️⃣ Kiểm tra lớp Cylinder (kế thừa Circle)
        // -------------------------------
        CYLINDER cylinder = new CYLINDER(center, 5, 10);
        System.out.println("Hinh tru: " + cylinder);
        System.out.println("Dien tich hinh tru = " + cylinder.getArea());
        System.out.println("The tich hinh tru = " + cylinder.getVolume());
    }
}
