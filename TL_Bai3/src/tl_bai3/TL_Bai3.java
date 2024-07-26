

package tl_bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TL_Bai3 {
    public static class MonHoc {
        private String id, ten;
        private int stc;

        public MonHoc(String id, String ten, int stc) {
            this.id = id;
            this.ten = ten;
            this.stc = stc;
        }

        public String getId() {
            return id;
        }

        public String getTen() {
            return ten;
        }

        public int getStc() {
            return stc;
        }

        @Override
        public String toString() {
            return "MonHoc{" + "id=" + id + ", ten=" + ten + ", stc=" + stc + '}';
        }
        
        
    }
    public static class Lich implements Comparable<Lich>{
        private static int no = 1;
        private String nhom, mon, gv, phong;
        private int ngay, kip;
        private String tenmon;
        public Lich(String mon, int ngay, int kip, String gv, String phong) {
            this.nhom = String.format("HP%03d", no++);
            this.gv = gv;
            this.mon = mon;
            this.ngay = ngay;
            this.kip = kip;
            this.phong = phong;
        }

        public String getMon() {
            return mon;
        }
        
        public void setTenmon(String tenmon) {
            this.tenmon = tenmon;
        }
        
        public String getGv() {
            return gv;
        }

        @Override
        public int compareTo(Lich o) {
            if (this.ngay == o.ngay) {
                if (this.kip == o.kip) {
                    return this.gv.compareTo(o.gv);
                }
                return this.kip - o.kip;
            }
            return this.ngay - o.ngay;
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(nhom);
            sb.append(" ").append(tenmon);
            sb.append(" ").append(ngay);
            sb.append(" ").append(kip);
            sb.append(" ").append(phong);
            
            return sb.toString();
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        ArrayList<Lich> lich = new ArrayList<>();
        while (t-- > 0) {
            mh.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            
        }
        
        sc = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            Lich tmp = new Lich(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            for (MonHoc m : mh) {
                if (m.getId().equals(tmp.getMon())) {
                    tmp.setTenmon(m.getTen());
                    break;
                }
            }
            lich.add(tmp);
        }
        Collections.sort(lich);
        String tengv = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + tengv +":");
        for (Lich l : lich) {
            if (l.getGv().equals(tengv)) {
                System.out.println(l);
            }
        }
    }

}
