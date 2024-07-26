

package j04008;



/**
 *
 * @author nducmd
 */

public class Triangle {
    private Point A, B, C;
    private double AB, AC, BC;
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        A = new Point(x1, y1);
        B = new Point(x2, y2);
        C = new Point(x3, y3);
        this.AB = A.distance(B);
        this.AC = A.distance(C);
        this.BC = B.distance(C);
    }
    @Override
    public String toString()
    {
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
            return String.format("INVALID");
        return String.format("%.3f", AB + AC + BC);
    }
}

