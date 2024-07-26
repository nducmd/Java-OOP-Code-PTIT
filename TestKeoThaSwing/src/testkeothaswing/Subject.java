

package testkeothaswing;

/**
 *
 * @author nducmd
 */

public class Subject implements Comparable<Subject>{
    private String id;
    private String name;
    private String credit;
    public Subject(String id, String name, String credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }
    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCredit() {
        return credit;
    }
    
    public Object[] toObject() {
        return new Object[] {id, name, credit};
    }
    
}