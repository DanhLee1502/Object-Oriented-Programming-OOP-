public class CYLINDER extends CIRCLE {
    private int height;

    public CYLINDER() {

    }

    public CYLINDER(POINT p, int r, int height) {
        super(p,r);
        this.height=height;
    }

    public void setHeight(int height) {
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return 2*super.getArea()+height*2*getR()*Math.PI;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    public String toString() {
        return "Cylinder[center=" + getCenter() + ", r=" + getR() + ", height=" + height + "]";
    }
}
