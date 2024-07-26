package j04007;

/**
 *
 * @author nducmd
 */
public class Employee {

    private String mnv, name, gender;
    private String address, dob, taxCode, date;
    private float gpa;

    public Employee(String name, String gender, String dob, String address, String taxCode, String date) {
        this.mnv = "00001";
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.date = date;
    }

    public void chuanhoaDob() {
        if (dob.charAt(2) != '/') {
            dob = "0" + dob;
        }

        if (dob.charAt(5) != '/') {
            dob = dob.substring(0, 3) + "0" + dob.substring(3);
        }
    }

    public void print() {
        System.out.println(mnv + " " + name + " "+ gender + " " + dob + " " + address + " " + taxCode + " " + date);
    }
}
