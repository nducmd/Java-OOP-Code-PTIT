

package j05035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05035 {
    public static class Student implements Comparable<Student>{
        private static int no = 1;
        private String id, ten, lop, email, cty;
        private int stt;
        public Student(String id, String ten, String lop, String email, String cty) {
            this.id = id;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            this.cty = cty;
            this.stt = no++;
        }

        public String getCty() {
            return cty;
        }
        
        @Override
        public String toString() {
            return stt + " " + id + " " + ten + " " + lop + " " + email + " " + cty;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
        
        @Override
        public int compareTo(Student o) {
            return this.id.compareTo(o.id);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
        
    }
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new Student(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim()));
        }
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            for (Student stu : a) {
                if (stu.getCty().equals(s)) {
                    System.out.println(stu);
                }
            }
        }
    }

}
