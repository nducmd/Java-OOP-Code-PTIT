

package j05021;

/**
 *
 * @author nducmd
 */

public class Student implements Comparable<Student>{
private String id, name, clas, email;

    public Student(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + email;
    }

    @Override
    public int compareTo(Student o) {
       
            return this.id.compareTo(o.id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
