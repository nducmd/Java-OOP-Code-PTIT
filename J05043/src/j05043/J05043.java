

package j05043;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05043 {
    public static class NhanVien {
        private static int no = 1;
        private String id, ten;
        private int phucap, luong, tamung, conlai;

        public NhanVien(String ten, String chucvu, int luongngay, int songay) {
            this.id = String.format("NV%02d", no++);
            this.ten = ten;
            if (chucvu.equals("GD")) {
                this.phucap = 500;
            } else if (chucvu.equals("PGD")) {
                this.phucap = 400;
            } else if (chucvu.equals("TP")) {
                this.phucap = 300;
            } else if (chucvu.equals("KT")) {
                this.phucap = 250;
            } else {
                this.phucap = 100;
            } 
            this.luong = luongngay * songay;
            if (((phucap + luong)*2/3) < 25000) {
                this.tamung =(int) Math.round((double)(phucap + luong)*2/3000) * 1000;
            } else {
                this.tamung = 25000;
            }
            this.conlai = this.luong + this.phucap - this.tamung;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(id);
            sb.append(" ").append(ten);
            sb.append(" ").append(phucap);
            sb.append(" ").append(luong);
            sb.append(" ").append(tamung);
            sb.append(" ").append(conlai);
            return sb.toString();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for (NhanVien nv : a) {
            System.out.println(nv);
        }
    }

}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/