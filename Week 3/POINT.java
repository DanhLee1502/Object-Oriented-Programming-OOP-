public class POINT {
    private int x;
    private int y;

    public POINT(){

    }

    public POINT(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x=x;
    }

    public void setY(int y) {
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(POINT p) {
        return Math.sqrt((this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()));
    }

    public String toString() {
        return "x: "+x+" y: "+y;
    }
}