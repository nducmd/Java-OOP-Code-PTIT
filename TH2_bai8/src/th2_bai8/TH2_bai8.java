package th2_bai8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class TH2_bai8 {

    public static class SinhVien implements Comparable<SinhVien> {

        private String id, ten, lop, email, sdt;
        private String gv, dt;

        public SinhVien(String id, String ten, String lop, String email, String sdt) {
            this.id = id;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            this.sdt = "0" + sdt;
        }

        public String getId() {
            return id;
        }

        public void setGv(String gv) {
            this.gv = gv;
        }

        public void setDt(String dt) {
            this.dt = dt;
        }

        @Override
        public int compareTo(SinhVien o) {
            return this.id.compareTo(o.id);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String toString() {
            return id + " " + ten + " " + gv + " " + dt + " " + sdt;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        while (sc1.hasNextLine()) {
            a.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        int t = Integer.parseInt(sc2.nextLine());
        while (t-- > 0) {
            String s = sc2.nextLine();
            String[] path = s.split("\\s+");
            String tmp = "";
            for (int i = 0; i < path.length - 1; i++) {
                tmp = tmp + " " + path[i];
            }
            tmp = tmp.trim();
            int tt = Integer.parseInt(path[path.length - 1]);
            while (tt-- > 0) {
                String x = sc2.nextLine();
                String[] path1 = x.split("\\s+");
                String tmp1 = "";
                for (int i = 1; i < path1.length; i++) {
                    tmp1 = tmp1 + " " + path1[i];
                }
                tmp1 = tmp1.trim();
                for (SinhVien sv : a) {
                    if (sv.getId().equals(path1[0])) {
                        sv.setDt(tmp1);
                        sv.setGv(tmp);
                        break;
                    }
                }
            }
        }
        Collections.sort(a);
        for (SinhVien sv : a) {
            System.out.println(sv);
        }

    }

}
/*
B21DCAT661 Hoang Tam Anh Tran Van Nam Xay dung ung dung quan ly ban hang 0966554321
B21DCCN111 Ly Van Binh Tran Van Nam Phat trien ung dung TMDT 0978652142
B21DCCN123 Tran Van Toan Duong Tuan Anh Xay dung game nhap vai voi Unity 3D 0987654321
B21DCAT661 Hoang Tam Anh Tran Van Nam Xay dung ung dung quan ly ban hang 0966554321
B21DCCN111 Ly Van Binh Tran Van Nam Phat trien ung dung TMDT 0978652142
B21DCCN123 Tran Van Toan Duong Tuan Anh Xay dung game nhap vai voi Unity 3D 0987654321
*/