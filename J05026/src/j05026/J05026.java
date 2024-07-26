

package j05026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05026 {
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
            String s = sc.nextLine().toUpperCase();
            String tmp = "";
            String path[] = s.split("\\s+");
            for (int i = 0; i < path.length; i++) {
                tmp += path[i].charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for (Student stu : a) {
                if (stu.getNganh().equals(tmp)) {
                    System.out.println(stu);
                }
            }
        }
    }

}
