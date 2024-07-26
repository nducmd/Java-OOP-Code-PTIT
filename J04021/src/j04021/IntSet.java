

package j04021;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class IntSet {
    private Set<Integer> s = new TreeSet<>();

    public IntSet() {
    }
    
    public IntSet(int[] a) {
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
    }
    public IntSet union(IntSet is2) {
        IntSet res = new IntSet();
        for (Integer i : this.s) {
            res.s.add(i);
        }
        for (Integer i : is2.s) {
            res.s.add(i);
        }
        return res;
    }
    @Override
    public String toString() {
        String res = "";
        for (Integer i : s) {
            res += Integer.toString(i) + " ";
        }
        return res.trim();
    }
}
