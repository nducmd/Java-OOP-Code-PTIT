package j04013;

import java.text.DecimalFormat;

/**
 *
 * @author nducmd
 */
public class ThiSinh {

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
        if (this.diem + plus(id) >= n) {
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
        this.name = name;
        this.diem = toan + ly + hoa + toan;
        setNote(24);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + (new DecimalFormat().format(plus(id))) + " " + (new DecimalFormat().format(diem)) + " " + note;
    }
}
/*
KV2A002
Hoang Thanh Tuan
5
6
7

KV2B123
Ly Thi Thu Ha
8
6.5
7
*/