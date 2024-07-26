

package j04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;





/**
 *
 * @author nducmd
 */

public class Student {
    private String msv, name;
    private String clas;
    private Date dob;
    private float gpa;
    public Student(String name, String clas, String dob, float gpa) throws ParseException{
        this.msv = "B20DCCN001";
        this.name = name;
        this.clas = clas;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return msv + " " + name + " " + clas + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + String.format("%.2f", gpa);
    }
}
