

package j07057;

/**
 *
 * @author nducmd
 */

public class Student implements Comparable<Student>{

    private String id;
    private String name;
    private double diemTb;
    private String note;
    private static int no = 1;

    public String standardName(String name) {
        name = name.trim().toLowerCase();
        String[] path = name.split("\\s+");
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += path[i].substring(0, 1).toUpperCase() + path[i].substring(1) + " ";
        }
        return res.trim();
    }

    public double getDiem() {
        return this.diemTb;
    }
    public String getNote(double a) {
        if (a >= 20.5) {
            return "Do";
        }
        return "Truot";
    }
    public double getCongDanToc(String dantoc) {
        if (dantoc.equals("Kinh")) {
            return 0;
        }
        return 1.5;
    }
    public double getCongKhuVuc(int khuvuc) {
        if (khuvuc == 1) {
            return 1.5;
        } else if (khuvuc == 2) {
            return 1;
        }
        return 0;
    }
    public Student(String name, double diem, String dantoc, int khuvuc) {
        this.id = String.format("TS%02d", no++);
        this.name = standardName(name);
        this.diemTb = diem + getCongDanToc(dantoc) + getCongKhuVuc(khuvuc);
        this.note = getNote(diemTb);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f",diemTb) + " " +note;
    }

    @Override
    public int compareTo(Student o) {
        if (diemTb > o.diemTb) {
            return -1;
        } else if (diemTb < o.diemTb) {
            return 1;
        }
        return this.id.compareTo(o.id);
    }
}
