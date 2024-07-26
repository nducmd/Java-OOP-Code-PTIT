

package j02009;

/**
 *
 * @author nducmd
 */

public class Customer implements Comparable<Customer>{
    private int t, d;
    public Customer(int t, int d) {
        this.t = t;
        this.d = d;
    }

    public int getT() {
        return t;
    }

    public int getD() {
        return d;
    }

    @Override
    public int compareTo(Customer o) {
        return this.t - o.t;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
