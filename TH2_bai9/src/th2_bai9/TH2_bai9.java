package th2_bai9;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class TH2_bai9 {

    public static class KhachHang implements Comparable<KhachHang> {

        public static int no = 1;
        private String id, ten, diachi, idSP, date;
        private Date d;
        private int tien, sl;
        public KhachHang(String ten, String diachi, String idSP, int sl, String date) throws ParseException {
            this.id = String.format("KH%02d", no++);
            this.ten = ten;
            this.diachi = diachi;
            this.idSP = idSP;
            this.sl = sl;
            this.date = date;
            

        }

        public void setD(Date d) {
            this.d = d;
            this.date = new SimpleDateFormat("dd/MM/yyyy").format(d);
        }
        
        public String getDate() {
            return date;
        }

        public String getIdSP() {
            return idSP;
        }

        public int getSl() {
            return sl;
        }

        public void setTien(int tien) {
            this.tien = tien;
        }
        @Override
        public String toString() {
            return id + " " + ten + " " + diachi + " " + idSP + " " + tien + " " + date;
        }
        @Override
        public int compareTo(KhachHang o) {
            if (this.d.getTime() == o.d.getTime()) {
                return this.id.compareTo(o.id);
            }
            if (this.d.getTime() < o.d.getTime()) {
                return -1;
            }
            return 1;
        }
    }
    public static class SanPham {
        private String id, ten;
        private int gia, thang;

        public SanPham(String id, String ten, int gia, int thang) {
            this.id = id;
            this.ten = ten;
            this.gia = gia;
            this.thang = thang;
        }

        public String getId() {
            return id;
        }

        public int getGia() {
            return gia;
        }

        public int getThang() {
            return thang;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList<SanPham> sp = new ArrayList<>();
        ArrayList<KhachHang> kh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sp.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            KhachHang tmp = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            
            for (SanPham s : sp) {
                if (s.getId().equals(tmp.getIdSP())) {
                    int soThangThem = s.getThang();
                    Date d = new SimpleDateFormat("dd/MM/yyyy").parse(tmp.getDate());
                    Calendar calender = Calendar.getInstance();
                    calender.setTime(d);
                    calender.add(Calendar.MONTH, soThangThem);
                    Date dd = calender.getTime();
                    tmp.setD(dd);
                    
                    int gia = s.getGia();
                    tmp.setTien(gia * tmp.getSl());
                    
                    kh.add(tmp);
                    break;
                }
            }
        }
        Collections.sort(kh);
        for (KhachHang k : kh) {
            System.out.println(k);
        }
    }

}
