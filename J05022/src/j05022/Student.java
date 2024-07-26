

package j05022;

/**
 *
 * @author nducmd
 */

public class Student {
    private String id, name, clas, email;

    public Student(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }

    public String getClas() {
        return clas;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + email;
    }
}
