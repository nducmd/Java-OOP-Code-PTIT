

package j07037;

/**
 *
 * @author nducmd
 */

public class Enterprise implements Comparable<Enterprise>{
    private String id;
    private String name;
    private int credit;
    public Enterprise(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + credit;
    }
    @Override
    public int compareTo(Enterprise o) {
        return this.id.compareTo(o.id);
    }
}
