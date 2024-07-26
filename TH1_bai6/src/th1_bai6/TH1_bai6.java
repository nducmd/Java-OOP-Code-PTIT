

package th1_bai6;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH1_bai6 {
    public static class DonHang {
        private String name, id;
        private int dongia, soluong;
        private int tamtinh, giamgia, thanhtien;

        public DonHang(String name, String id, int dongia, int soluong) {
            this.name = name;
            this.id = id;
            this.dongia = dongia;
            this.soluong = soluong;
            this.tamtinh = soluong * dongia;
            if (id.endsWith("2")) {
                this.giamgia = this.tamtinh / 100 * 30;
            } else {
                this.giamgia = this.tamtinh / 100 * 50;
            }
            this.thanhtien = this.tamtinh - this.giamgia;
        }
        @Override
        public String toString() {
            return name + " " + id + " " + id.substring(1,4) + " " + giamgia + " " + thanhtien;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            DonHang dh = new DonHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            System.out.println(dh);
        }
    }

}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/