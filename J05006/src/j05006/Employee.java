

package j05006;

/**
 *
 * @author nducmd
 */

public class Employee {
    private String name, id, dob, address, code, date, gender;
    public static int no = 1;
    public Employee(String name, String gender, String dob, String address, String code, String date) {
        this.id = String.format("%05d", no++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.code = code;
        this.date = date;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + code + " " + date;
    }
}
