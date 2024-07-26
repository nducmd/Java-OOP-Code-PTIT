

package j05036;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05036 {
    public static class MatHang {
        private static int no = 1;
        private String ten, dvt, id;
        private int nhap, sl;
        private int vanchuyen, thanhtien, giaban;
        public MatHang(String ten, String dvt, int nhap, int sl) {
            this.id = String.format("MH%02d", no++);
            this.ten = ten;
            this.dvt = dvt;
            this.nhap = nhap;
            this.sl = sl;
            this.vanchuyen = (int) Math.round((nhap * sl) * 0.05);
            this.thanhtien = (int) Math.round((nhap * sl) + this.vanchuyen);
            this.giaban = (int) Math.round(this.thanhtien * 1.02);
        }

        @Override
        public String toString() {
            return id + " " + ten + " " + dvt + " " + vanchuyen + " " + thanhtien + " " + giaban;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
     
         
        
    }
    public static void main(String[] args) {
        ArrayList<MatHang> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        for (MatHang mh : a) {
            System.out.println(mh);
        }
    }

}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
*/