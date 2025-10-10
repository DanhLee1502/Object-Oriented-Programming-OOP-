public class CIRCLE {
    private POINT center;
    private int r;

    public CIRCLE() {

    }

    public CIRCLE(POINT p, int r) {
        this.center=p;
        this.r=r;
    } 

    public void setCenter(POINT p) {
        this.center=p;
    }

    public void setR(int r) {
        this.r=r;
    }

    public POINT getCenter() {
        return center;
    }

    public int getR() {
        return r;
    }

    public double getArea() {
        return Math.PI*r*r;
    }

    public String toString() {
        return "center: "+center+" r: "+r;
    }
}
