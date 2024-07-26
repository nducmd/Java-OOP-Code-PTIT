

package j07010;

/**
 *
 * @author nducmd
 */

public class Student {
    private String msv, name;
    private String clas, dob;
    private float gpa;
    public static int no = 1;
    public Student(String name, String clas, String dob, float gpa) {
        this.msv = String.format("B20DCCN%03d", no++); 
        this.name = name;
        this.clas = clas;
        this.dob = dob;
        this.gpa = gpa;
    }
    public void chuanhoaDob() {
        if (dob.charAt(2) != '/') {
            dob = "0" + dob;
        }
        
        if (dob.charAt(5) != '/') {
            dob = dob.substring(0,3) + "0" + dob.substring(3);
        }
    }
    public void print() {
        chuanhoaDob();
        System.out.printf("%s %s %s %s %.2f",msv, name, clas, dob, gpa);
        System.out.println("");
    }
}
