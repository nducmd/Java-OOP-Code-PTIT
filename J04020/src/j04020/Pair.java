

package j04020;

/**
 *
 * @author nducmd
 */

public class Pair<F, S> {
    private F first;
    private S second;
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public boolean check(Integer n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime() {
        return check((Integer) this.first) && check((Integer) this.second);
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.first, this.second);
    }
}
