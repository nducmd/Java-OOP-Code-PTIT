

package j04009;

/**
 *
 * @author nducmd
 */

public class Point {
    private double x;
    private double y;
    private double d;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point p) {
        return Math.sqrt((this.x - p.x)*(this.x-p.x) + (this.y - p.y)*(this.y-p.y)); 
    }
    public static double distance(Point p1, Point p) {
        return Math.sqrt((p1.x - p.x)*(p1.x-p.x) + (p1.y - p.y)*(p1.y-p.y)); 
    }
    public void setD(double a) {
        this.d = a;
    }
    @Override
    public String toString() {
        return String.format("%.4f", this.d);
    }
}
