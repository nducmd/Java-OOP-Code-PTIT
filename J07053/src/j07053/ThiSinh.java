

package j07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nducmd
 */

public class ThiSinh {
    private static int no = 1;
    private String name, id, note;
    private String dob;
    private int age;
    private double diemLiThuyet, diemThucHanh, diemThuong;
    private int diemTrungBinh;
    public String standardName(String name) {
        name = name.trim().toLowerCase();
        String[] path = name.split("\\s+");
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += path[i].substring(0, 1).toUpperCase() + path[i].substring(1) + " ";
        }
        return res.trim();
    }
    public double getDiemThuong(double a, double b) {
        if (a >= 8 && b >= 8) {
            return 1;
        } else if (a >=7.5 && b >= 7.5) {
            return 0.5;
        }
        return 0;
    }
    public String getNote(int a) {
        if (a < 5) {
            return "Truot";
        } else if (a < 7) {
            return "Trung binh";
        } else if (a  == 7) {
            return "Kha";
        } else if (a == 8) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
    
    public ThiSinh(String name, String dob, double diemLyThuyet, double diemThucHanh) throws ParseException {
        this.id = String.format("PH%02d", no++);
        this.name = standardName(name);
        Date fm = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.dob = new SimpleDateFormat("dd/MM/yyyy").format(fm);
        this.age = 2021 - Integer.parseInt(this.dob.substring(6));
        this.diemLiThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.diemThuong = getDiemThuong(diemLyThuyet, diemThucHanh);
        this.diemTrungBinh =(int) Math.round((diemLyThuyet + diemThucHanh) / 2 + this.diemThuong);
        if (this.diemTrungBinh > 10) {
            this.diemTrungBinh = 10;
        }
        this.note = getNote(diemTrungBinh);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + diemTrungBinh + " " + note;
    }
}
