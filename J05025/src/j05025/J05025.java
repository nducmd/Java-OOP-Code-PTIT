

package j05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05025 {
    
    public static class Student implements Comparable<Student>{
        private static int no = 1;
        private String id, hoten, nganh, ten;
      
        public Student(String hoten, String nganh) {
            this.id = String.format("GV%02d", no++);
            this.hoten = hoten;
            String tmp = "";
            String path[] = nganh.split("\\s+");
            for (int i = 0; i < path.length; i++) {
                tmp += path[i].charAt(0);
            }
            this.nganh = tmp.toUpperCase();
            setTen();
        }
        public void setTen() {
            String path[] = hoten.split("\\s+");
            ten = path[path.length - 1];
            return;
        }

        @Override
        public String toString() {
            return id + " " + hoten + " " + nganh;
        }

        @Override
        public int compareTo(Student o) {
            if (this.ten.equals(o.ten)) {
                return this.id.compareTo(o.id);
            }
            return this.ten.compareTo(o.ten);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new Student(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (Student stu : a) {
            System.out.println(stu);
        }
    }

}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
*/