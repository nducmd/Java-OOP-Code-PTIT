

package j07058;

/**
 *
 * @author nducmd
 */

public class Subject implements Comparable<Subject>{
    private String id, name, form;
    public Subject(String id, String name, String form) {
        this.id=  id;
        this.name = name;
        this.form = form;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + form;
    }
    @Override
    public int compareTo(Subject o) {
        return this.id.compareTo(o.id);
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
