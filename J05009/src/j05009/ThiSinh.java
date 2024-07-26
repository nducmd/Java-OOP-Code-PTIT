

package j05009;

import java.text.DecimalFormat;

/**
 *
 * @author nducmd
 */

public class ThiSinh implements Comparable<ThiSinh>{
    private String name, dob;
    private int id;
    public static int no = 1;
    private double d1, d2, d3, d;
    public ThiSinh(String name, String dob, double d1, double d2, double d3) {
        this.id = no++;
        this.name = name;
        this.dob = dob;
        this.d = d1 + d2 + d3;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + (new DecimalFormat().format(d));
    }

    public double getD() {
        return d;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return this.id - o.id;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
