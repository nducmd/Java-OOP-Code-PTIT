

package j04004;



/**
 *
 * @author nducmd
 */

public class Fraction {
    private long a;
    private long b;
    public Fraction(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public void minimalist() {
        long gcd = J04004.gcd(this.a, this.b);
        this.a = this.a / gcd;
        this.b = this.b / gcd;
    }
    public void print() {
        System.out.println(this.a + "/" + this.b);
    }
    public void plus(Fraction f) {
        long mau = this.b * f.b;
        long tu  = a*f.b + f.a*b;
        long gcd = J04004.gcd(mau, tu);
        System.out.println((tu / gcd) + "/" + (mau/gcd));
    }
}
