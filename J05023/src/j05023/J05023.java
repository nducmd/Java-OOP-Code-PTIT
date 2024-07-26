

package j05023;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05023 {
    public static class Student {
        private String id, ten, lop, email;
        private String khoa;
        public Student(String id, String ten, String lop, String email) {
            this.id = id;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            this.khoa = "20" + lop.substring(1, 3);
        }
        
        @Override
        public String toString() {
            return id + " " + ten + " " + lop + " " + email;
        }

        public String getKhoa() {
            return khoa;
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
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for (Student stu : a) {
                if (stu.getKhoa().equals(s)) {
                    System.out.println(stu);
                }
            }
        }
    }

}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
2015
*/