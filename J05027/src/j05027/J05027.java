

package j05027;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05027 {
    public static class Student{
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

        public String getNganh() {
            return nganh;
        }

        public String getHoten() {
            return hoten;
        }

        
        
    }
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new Student(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for (Student stu : a) {
                if (stu.getHoten().toUpperCase().contains(s.toUpperCase())) {
                    System.out.println(stu);
                }
            }
        }
    }

}
