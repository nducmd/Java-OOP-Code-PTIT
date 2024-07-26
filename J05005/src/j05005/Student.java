package j05005;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nducmd
 */
public class Student implements Comparable<Student>{

    public static int no = 1;
    private String name, dob, lop, id;
    private double gpa;

    public Student(String name, String lop, String date, double gpa) throws ParseException {
        this.id = String.format("B20DCCN%03d", no++);
        this.name = standardName(name);
        this.lop = lop;
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.dob = new SimpleDateFormat("dd/MM/yyyy").format(d);
        this.gpa = gpa;
    }

    public String standardName(String name) {
        name = name.trim().toLowerCase();
        String[] path = name.split("\\s+");
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += path[i].substring(0, 1).toUpperCase() + path[i].substring(1) + " ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(Student o) {
        if (o.gpa > this.gpa) {
            return 1;
        }
        return -1;
       
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
