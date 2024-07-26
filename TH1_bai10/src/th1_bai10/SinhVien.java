

package th1_bai10;

/**
 *
 * @author nducmd
 */

public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int ac, sub;

    public SinhVien(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }
    @Override
    public String toString() {
        return name + " " + ac + " " + sub;
    }
    @Override
    public int compareTo(SinhVien o) {
        if (this.ac == o.ac) {
            if (this.sub == o.sub) {
                return this.name.compareTo(o.name);
            }
            return this.sub - o.sub;
        }
        return this.ac - o.ac;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
