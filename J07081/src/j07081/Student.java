

package j07081;

/**
 *
 * @author nducmd
 */

public class Student implements Comparable<Student>{
    private String id, name, phone, email, firstName;
    public Student(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        String[] path = name.split("\\s+");
        firstName = path[path.length-1];
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + email ;
    }
    @Override
    public int compareTo(Student o) {
        if (this.firstName.equals(o.firstName)) {
            if (this.name.equals(o.name)) {
                return this.id.compareTo(o.id);
            }
            return this.name.compareTo(o.name);
        }
        return this.firstName.compareTo(o.firstName);
    }
}
