

package j04018;

/**
 *
 * @author nducmd
 */

public class ComplexNum {
    private int a, b;
    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public ComplexNum plus(ComplexNum c2) {
        return new ComplexNum(this.a + c2.a, this.b + c2.b);
    }
    public ComplexNum mul(ComplexNum c2) {
        int c = c2.a;
        int d = c2.b;
        return new ComplexNum(a*c-b*d, a*d+b*c);
    }
    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + "i";
        }
        return a + " - " + (-1*b) + "i";
    }
}
