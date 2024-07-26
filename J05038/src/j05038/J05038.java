

package j05038;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05038 {
    public static class NhanVien {
        private static int no = 1;
        private String ten, id;
        private int luongthang, thuong, phucap, thuclinh;

        public NhanVien(String ten, int luongngay, int songay, String chucvu) {
            this.id = String.format("NV%02d", no++);
            this.ten = ten;
            this.luongthang = luongngay * songay;
            if (songay >= 25) {
                thuong = luongthang / 5;
            } else if (songay >= 22) {
                thuong = luongthang / 10;
            } else {
                thuong = 0;
            }
            if (chucvu.equals("GD")) {
                phucap = 250000;
            } else if (chucvu.equals("PGD")) {
                phucap = 200000;
            } else if (chucvu.equals("TP")) {
                phucap = 180000;
            } else {
                phucap = 150000;
            }
            thuclinh = luongthang + thuong + phucap;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(" ");
            sb.append(ten).append(" ");
            sb.append(luongthang).append(" ");
            sb.append(thuong).append(" ");
            sb.append(phucap).append(" ");
            sb.append(thuclinh).append(" ");
            return sb.toString();
        }

        public int getThuclinh() {
            return thuclinh;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        int sum = 0;
        for (NhanVien nv : a) {
            System.out.println(nv);
            sum += nv.getThuclinh();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }

}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
*/