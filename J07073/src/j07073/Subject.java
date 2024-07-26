

package j07073;

/**
 *
 * @author nducmd
 */

public class Subject implements Comparable<Subject>{
    private String id, name, credit, theory, practice;
    public Subject(String id, String name, String credit, String theory, String practice) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.theory = theory;
        this.practice = practice;
    }

    public String getPractice() {
        return practice;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + credit + " " + theory + " " + practice;
    }
    @Override
    public int compareTo(Subject o) {
        return this.id.compareTo(o.id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
