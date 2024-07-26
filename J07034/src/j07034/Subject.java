

package j07034;

/**
 *
 * @author nducmd
 */

public class Subject implements Comparable<Subject>{
    private String id;
    private String name;
    private int credit;
    public Subject(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + credit;
    }
    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.name);
    }
}
