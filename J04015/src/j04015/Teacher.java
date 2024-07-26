

package j04015;

/**
 *
 * @author nducmd
 */

public class Teacher {
    private String code;
    private String name;
    private long luongcoban;
    private long phucap;
    private long income;
    private long heso;
    public Teacher(String code, String name, long luongcoban) {
        this.code = code;
        this.name = name;
        this.luongcoban = luongcoban;
        if (code.startsWith("HT")) {
            this.phucap = 2000000;
        } else if (code.startsWith("HP")) {
            this.phucap = 900000;
        } else {
            this.phucap = 500000;
        }
        this.heso = Integer.parseInt(code.substring(2));
        this.income = this.phucap + this.luongcoban * heso;
    }
    public void print() {
        System.out.println(code + " " + name + " " + heso + " " + phucap + " " + income );
    }
}
