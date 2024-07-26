

package j05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nducmd
 */

public class Student {
    public static int no = 1;
    private String name, dob, lop, id;
    private double gpa;
    public Student(String name, String lop, String date, double gpa) throws ParseException {
        this.id = String.format("B20DCCN%03d", no++);
        this.name = name;
        this.lop = lop;
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.dob = new SimpleDateFormat("dd/MM/yyyy").format(d);
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
