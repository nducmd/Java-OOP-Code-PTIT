package j04014;

/**
 *
 * @author nducmd
 */
public class Fraction {

    private long a;
    private long b;
    
    public static long cntGcd(long a, long b) {
        long r = 0;
        while (b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public Fraction(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public void minimalist() {
        long gcd = cntGcd(this.a, this.b);
        this.a = this.a / gcd;
        this.b = this.b / gcd;
    }

    public Fraction plus(Fraction f) {
        long mau = this.b * f.b;
        long tu = a * f.b + f.a * b;
        long gcd = cntGcd(mau, tu);
        return new Fraction((tu / gcd), (mau / gcd));
    }
    public Fraction mul(Fraction f) {
        long mau = this.b * f.b;
        long tu = this.a * f.a ;
        long gcd = cntGcd(mau, tu);
        return new Fraction((tu / gcd), (mau / gcd));
    }
    @Override
    public String toString() {
        return a + "/" + b;
    }
}
