package j05018;




/**
 *
 * @author nducmd
 */

public class Student implements Comparable<Student>{
    private String name, id, note;
    private double d;
    public static int no = 1;
    
    public Student(String name, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.name = name;
        this.id = String.format("HS%02d", no++);
        d = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d1 + d2;
        d = d / 12;
        if (d >= 9) {
            note = "XUAT SAC";
        } else if (d >= 8) {
            note = "GIOI";
        } else if (d >= 7) {
            note = "KHA";
        } else if (d >= 5) {
            note = "TB";
        } else {
            note = "YEU";
        }
        
    }
    
    @Override
    public String toString() {
        double rNum = Math.round(d*10.0) / 10.0;
        return id + " " + name + " " + rNum + " " + note;
    }

    @Override
    public int compareTo(Student o) {
        if (this.d == o.d) {
            return this.id.compareTo(o.id);
        }
        if (this.d < o.d) {
            return 1;
        }
        return -1;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
