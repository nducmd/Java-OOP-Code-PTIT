

package j05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05042 {
    public static class SinhVien implements Comparable<SinhVien>{
        private String ten;
        private int submit, ac;

        public SinhVien(String ten, int ac, int submit) {
            this.ten = ten;
            this.submit = submit;
            this.ac = ac;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ten).append(" ");
            sb.append(ac).append(" ");
            sb.append(submit).append(" ");
            return sb.toString();
        }
        
        @Override
        public int compareTo(SinhVien o) {
            if (this.ac == o.ac) {
                if (this.submit == o.submit) {
                    return this.ten.compareTo(o.ten);
                }
                return this.submit - o.submit;
            }
            return -this.ac + o.ac;
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            String ten = sc.nextLine();
            String tmp = sc.nextLine();
            String[] path = tmp.split("\\s+");
            a.add(new SinhVien(ten, Integer.parseInt(path[0]), Integer.parseInt(path[1])));
        }
        Collections.sort(a);
        for (SinhVien sv : a) {
            System.out.println(sv);
        }
    }

}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/