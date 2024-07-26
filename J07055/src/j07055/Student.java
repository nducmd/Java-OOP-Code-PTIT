

package j07055;

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
        if (a >= 8) {
            return "GIOI";
        } else if (a >= 6.5) {
            return "KHA";
        } else if (a >= 5) {
            return "TRUNG BINH";
        }
        return "KEM";
    }
    public Student(String name, double diem1, double diem2, double diem3) {
        this.id = String.format("SV%02d", no++);
        this.name = standardName(name);
        this.diemTb = (diem1*25 + diem2*35 + diem3*40) / 100;
        this.note = getNote(diemTb);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f",diemTb) + " " +note;
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

