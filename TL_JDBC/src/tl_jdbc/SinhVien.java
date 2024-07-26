

package tl_jdbc;

/**
 *
 * @author nducmd
 */

public class SinhVien {
    private int id;
    private String ten, lop;
    private double gpa;

    public SinhVien(int id, String ten, String lop, double gpa) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public SinhVien(String ten, String lop, double gpa) {
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }
    
    public Object[] toObject() {
        return new Object[] {id, ten, lop, gpa};
    }
}
