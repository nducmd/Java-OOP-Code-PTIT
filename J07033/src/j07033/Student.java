package j07033;

/**
 *
 * @author nducmd
 */
public class Student implements Comparable<Student>{

    private String id;
    private String name;
    private String clas;
    private String email;
    public String chuanhoaTen(String s) {
        s = s.trim().toLowerCase();
        String[] path = s.split("\\s+");
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += String.valueOf(path[i].charAt(0)).toUpperCase() + path[i].substring(1) + " ";
        }
        return res.trim();
    }
    public Student(String id, String name, String clas, String email) {
        this.id = id;
        this.name = chuanhoaTen(name);
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
    }
}
