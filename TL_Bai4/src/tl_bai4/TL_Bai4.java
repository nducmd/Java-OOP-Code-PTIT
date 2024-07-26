package tl_bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class TL_Bai4 {

    public static class MonHoc {

        private String id, ten;

        public MonHoc(String id, String ten) {
            this.id = id;
            this.ten = ten;
        }

    }

    public static class GiangVien {

        private String id, ten;
        private double tong = 0;

        public GiangVien(String id, String ten) {
            this.id = id;
            this.ten = ten;
        }

        public String getId() {
            return id;
        }

        public String getTen() {
            return ten;
        }
        public void tangGio (double n) {
            this.tong += n;
        }

        @Override
        public String toString() {
            //return "GiangVien{" + '}';
            return ten + " " + String.format("%.2f", tong);
        }
        
    }

    public static class Gio {

        private String gv, mon;
        private double gio;
        public Gio(String gv, String mon, double gio) {
            this.gv = gv;
            this.mon = mon;
            this.gio = gio;
        }

        public String getGv() {
            return gv;
        }

        public double getGio() {
            return gio;
        }
        

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> mh = new ArrayList<>();
        ArrayList<GiangVien> gv = new ArrayList<>();
        ArrayList<Gio> gio = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String tmp = sc.nextLine();
            String[] path = tmp.split("\\s+");
            mh.add(new MonHoc(path[0], tmp.substring(path[0].length() + 1)));
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String tmp = sc.nextLine();
            String[] path = tmp.split("\\s+");
            gv.add(new GiangVien(path[0], tmp.substring(path[0].length() + 1)));
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String tmp = sc.nextLine();
            String[] path = tmp.split("\\s+");
            gio.add(new Gio(path[0], path[1], Double.parseDouble(path[2])));
        }
        for (Gio g : gio) {
            for (GiangVien gvv : gv) {
                if (gvv.getId().equals(g.getGv())) {
                    gvv.tangGio(g.getGio());
                }
            }
        }
        for (GiangVien g : gv) {
            System.out.println(g);
        }
    }

}
