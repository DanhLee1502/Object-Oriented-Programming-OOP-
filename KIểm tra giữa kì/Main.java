import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap he so mat phang 1 (a1 b1 c1 d1): ");
        double a1 = sc.nextDouble(), b1 = sc.nextDouble(), c1 = sc.nextDouble(), d1 = sc.nextDouble();

        System.out.print("Nhap he so mat phang 2 (a2 b2 c2 d2): ");
        double a2 = sc.nextDouble(), b2 = sc.nextDouble(), c2 = sc.nextDouble(), d2 = sc.nextDouble();

        Plane p1 = new Plane(a1, b1, c1, d1);
        Plane p2 = new Plane(a2, b2, c2, d2);

        System.out.println("\nMat phang 1: " + p1);
        System.out.println("Mat phang 2: " + p2);

        double vx = b1 * c2 - c1 * b2;
        double vy = c1 * a2 - a1 * c2;
        double vz = a1 * b2 - b1 * a2;

        if (vx == 0 && vy == 0 && vz == 0) {
            System.out.println("Hai mat phang song song hoac trung nhau.");
            sc.close();
            return;
        }

        double x0 = 0, y0 = 0, z0 = 0;
        double det;

        det = a1 * b2 - a2 * b1;
        if (det != 0) {
            x0 = (-d1 * b2 + d2 * b1) / det;
            y0 = (-a1 * d2 + a2 * d1) / det;
            z0 = 0;
        } else {
            det = a1 * c2 - a2 * c1;
            if (det != 0) {
                x0 = (-d1 * c2 + d2 * c1) / det;
                y0 = 0;
                z0 = (-a1 * d2 + a2 * d1) / det;
            } else {
                det = b1 * c2 - b2 * c1;
                if (det != 0) {
                    x0 = 0;
                    y0 = (-d1 * c2 + d2 * c1) / det;
                    z0 = (-b1 * d2 + b2 * d1) / det;
                } else {
                    System.out.println("Hai mat phang song song hoac trung nhau.");
                    sc.close();
                    return;
                }
            }
        }

        Line3D line = new Line3D(
            new Point3D(x0, y0, z0),
            new Point3D(x0 + vx, y0 + vy, z0 + vz)
        );

        System.out.println("Giao tuyen tim duoc: " + line);
        sc.close();
    }
}