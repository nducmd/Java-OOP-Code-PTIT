package j04019;

/**
 *
 * @author nducmd
 */
public class Triangle {

    Point A, B, C;
    double a,b,c;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public boolean valid() {
        a = A.distance(B);
        b = B.distance(C);
        c = A.distance(C);
        return 2 * Math.max(a, Math.max(b, c)) < a + b + c;
    }
    public String getPerimeter() {
        return String.format("%.3f", a + b + c);
    }
}
