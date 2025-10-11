public class Line3D {
    Point3D point;
    Point3D direction;

    public Line3D (Point3D p1, Point3D p2) {
        this.point = p1;
        this.direction = new Point3D(
            p2.getX() - p1.getX(),
            p2.getY() - p1.getY(),
            p2.getZ() - p1.getZ()
        );
    }

    @Override
    public String toString() {
        return "Diem: " + point + ", Vector chi phuong: " + direction;
    }
}