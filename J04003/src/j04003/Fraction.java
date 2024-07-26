

package j04003;

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
        long gcd = J04003.gcd(this.a, this.b);
        this.a = this.a / gcd;
        this.b = this.b / gcd;
    }
    public void print() {
        System.out.println(this.a + "/" + this.b);
    }
}
