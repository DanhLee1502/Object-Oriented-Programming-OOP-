public class LINE {
    private POINT A;
    private POINT B;

    public LINE() {

    }

    public LINE(POINT p1, POINT p2) {
        this.A=p1;
        this.B=p2;
    }

    public void setA(POINT p) {
        this.A=p;
    }

    public void setB(POINT p) {
        this.B=p;
    }

    public POINT getA() {
        return A;
    }

    public POINT getB() {
        return B;
    }

    public double distance() {
        return A.distance(B);
    }

    private double xIntercept() {
        if (A.getY() == B.getY()) return Double.NaN; 
        return A.getX() + (B.getX() - A.getX()) * (-A.getY()) / (double)(B.getY() - A.getY());
    }

    private double yIntercept() {
    if (A.getX() == B.getX()) return Double.NaN; 
    return A.getY() + (B.getY() - A.getY()) * (-A.getX()) / (double)(B.getX() - A.getX());
    }

    public double getXintercept() {
        return xIntercept();
    }

    public double getYintercept() {
        return yIntercept();
    }

    public String toString() {
        return A + " " + B;
    }
}
