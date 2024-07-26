package j05024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J05024 {

    public static class Student {

        private String id, ten, lop, email;
        private String nganh;

        public Student(String id, String ten, String lop, String email) {
            this.id = id;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            setNganh();
        }
        public void setNganh() {
            if (id.contains("DCKT")) {
                this.nganh = "KE TOAN";
                return;
            }
            if (id.contains("DCCN") && lop.charAt(0) != 'E') {
                this.nganh = "CONG NGHE THONG TIN";
                return;
            }
            if (id.contains("DCAT") && lop.charAt(0) != 'E') {
                this.nganh = "AN TOAN THONG TIN";
                return;
            }
            if (id.contains("DCVT")) {
                this.nganh = "VIEN THONG";
                return;
            }
            if (id.contains("DCDT")) {
                this.nganh = "DIEN TU";
                return;
            }
            this.nganh = "";
        }
        @Override
        public String toString() {
            return id + " " + ten + " " + lop + " " + email;
        }

        public String getNganh() {
            return nganh;
        }


    }

    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            for (Student stu : a) {
                if (stu.getNganh().equals(s)) {
                    System.out.println(stu);
                }
            }
        }
    }

}
