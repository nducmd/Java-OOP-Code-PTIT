package th1_bai14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class TH1_bai14 {

    public static class SinhVien implements Comparable<SinhVien> {

        private String id, name, phone, email;
        private String gv, dt;

        public SinhVien(String id, String name, String phone, String email) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.email = email;
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
            return this.dt.compareTo(o.dt);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String toString() {
            return id + " " + name + " " + phone + " " + email + " " + gv + " " + dt;
        }

    }

    public static class DeTai {

        public static int no = 1;
        private String id, gv, name;

        public DeTai(String gv, String name) {
            this.id = String.format("DT%03d", no++);
            this.gv = gv;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getGv() {
            return gv;
        }

        public String getName() {
            return name;
        }
        
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        Scanner sc3 = new Scanner(new File("NHIEMVU.in"));
        Map<String, SinhVien> mapSinhVien = new HashMap<>();
        Map<String, DeTai> mapDeTai = new HashMap<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        while (n-- > 0) {
            SinhVien sv = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            mapSinhVien.put(sv.getId(), sv);
        }
        int m = sc2.nextInt();
        sc2.nextLine();
        while (m-- > 0) {
            DeTai dt = new DeTai(sc2.nextLine(), sc2.nextLine());
            mapDeTai.put(dt.getId(), dt);
        }
        int p = sc3.nextInt();
        sc3.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (p-- > 0) {
            String msv = sc3.next();
            String mdt = sc3.next();
            SinhVien sv = mapSinhVien.get(msv);
            DeTai dt = mapDeTai.get(mdt);
            sv.setDt(dt.getName());
            sv.setGv(dt.gv);
            a.add(sv);
        }
        Collections.sort(a);
        for (SinhVien sv : a) {
            System.out.println(sv);
        }
    }

}
