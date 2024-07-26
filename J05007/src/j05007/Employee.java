package j05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nducmd
 */
public class Employee implements Comparable<Employee>{

    private String name, id, dob, address, code, date, gender;
    private Date age;
    public static int no = 1;

    public Employee(String name, String gender, String dob, String address, String code, String date) throws ParseException {
        this.id = String.format("%05d", no++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.code = code;
        this.date = date;
        this.age = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + code + " " + date;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.age.getTime() > o.age.getTime()) {
            return 1;
        }
        return -1;
        //return (int)(-this.age.getTime() + o.age.getTime());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
