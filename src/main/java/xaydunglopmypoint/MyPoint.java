package xaydunglopmypoint;

public class MyPoint {
    static double x = 0;
    static double y = 0;

    public MyPoint() {

    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        double khoang_cach = Math.pow((x*x + y*y), 0.5);
        return khoang_cach;
    }
}
