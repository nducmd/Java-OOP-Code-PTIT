package j07052;

import java.text.DecimalFormat;

/**
 *
 * @author nducmd
 */
public class ThiSinh implements Comparable<ThiSinh> {

    private String id;
    private String name;
    private double diem;
    private String note = "";

    public double plus(String id) {
        if (id.startsWith("KV1")) {
            return (double) 0.5;
        } else if (id.startsWith("KV2")) {
            return (double) 1.0;
        }
        return (double) 2.5;
    }

    public String standardName(String name) {
        name = name.trim().toLowerCase();
        String[] path = name.split("\\s+");
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += path[i].substring(0, 1).toUpperCase() + path[i].substring(1) + " ";
        }
        return res.trim();
    }

    public void setNote(double n) {
        if (this.diem >= n) {
            this.note = "TRUNG TUYEN";
        } else {
            this.note = "TRUOT";
        }
    }

    public double getDiem() {
        return this.diem;
    }

    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = standardName(name);
        this.diem = toan + ly + hoa + toan + plus(id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + (new DecimalFormat().format(plus(id))) + " " + (new DecimalFormat().format(diem)) + " " + note;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (diem > o.diem) {
            return -1;
        } else if (diem < o.diem) {
            return 1;
        }
        return this.id.compareTo(o.id);

    }
}
