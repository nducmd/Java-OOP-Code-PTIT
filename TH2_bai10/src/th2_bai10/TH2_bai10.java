

package th2_bai10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH2_bai10 {
    public static class MonHoc {
        private String id, ten;

        public MonHoc(String id, String ten) {
            this.id = id;
            this.ten = ten;
        }

        public String getId() {
            return id;
        }
        
    }
    public static class GiangVien {
        private String id, ten;
        private double gio;

        public GiangVien(String id, String ten) {
            this.id = id;
            this.ten = ten;
            this.gio = 0;
        }

        public String getId() {
            return id;
        }

        public void setGio(double gio) {
            this.gio = gio;
        }

        public double getGio() {
            return gio;
        }
        @Override
        public String toString() {
            return ten + " " + String.format("%.2f", gio);
        }
    }
    public static class GioChuan {
        private String gv, mh;
        private double gio;

        public GioChuan(String gv, String mh, double gio) {
            this.gv = gv;
            this.mh = mh;
            this.gio = gio;
        }

        public double getGio() {
            return gio;
        }

        public String getGv() {
            return gv;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        ArrayList<GiangVien> gv = new ArrayList<>();
        ArrayList<MonHoc> mh = new ArrayList<>();
        ArrayList<GioChuan> gc = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine());
        while (t-- > 0) {
            String s = sc1.nextLine();
            String[] path = s.split("\\s+");
            mh.add(new MonHoc(path[0], path[1]));
        }
        t = Integer.parseInt(sc2.nextLine());
        while (t-- > 0) {
            String s = sc2.nextLine();
            String[] path = s.split("\\s+");
            String tmp = "";
            for (int i = 1; i < path.length; i++) {
                tmp = tmp +" " +  path[i];
            }
            gv.add(new GiangVien(path[0], tmp.trim()));
        }
        t = Integer.parseInt(sc3.nextLine());
        while (t-- > 0) {
            String s = sc3.nextLine();
            String[] path = s.split("\\s+");
            gc.add(new GioChuan(path[0], path[1], Double.parseDouble(path[2])));
        }
        for (GioChuan a : gc) {
            String magv = a.getGv();
            double sogio = a.getGio();
            for (GiangVien b : gv) {
                if (b.getId().equals(magv)) {
                    b.setGio(b.getGio() + sogio);
                    break;
                }
            }
        }
        for (GiangVien a : gv) {
            System.out.println(a);
        }
    }

}
