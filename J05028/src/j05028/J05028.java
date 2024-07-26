

package j05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05028 {
    public static class CongTy implements Comparable<CongTy>{
        private String id, ten;
        private int sl;
        public CongTy(String id, String ten, int sl) {
            this.id = id;
            this.ten = ten;
            this.sl = sl;
        }

        @Override
        public String toString() {
            return id + " " + ten + " " +sl;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        @Override
        public int compareTo(CongTy o) {
            if (this.sl == o.sl) {
                return this.id.compareTo(o.id);
            }
            return -this.sl + o.sl;
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) {
        ArrayList<CongTy> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new CongTy(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a);
        for (CongTy ct : a) {
            System.out.println(ct);
        }
    }

}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
*/