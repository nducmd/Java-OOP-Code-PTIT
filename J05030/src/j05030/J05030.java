

package j05030;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05030 {
    public static class Student implements Comparable<Student>{
        private String id, ten, lop;
        private double d1, d2, d3;

        public Student(String id, String ten, String lop, double d1, double d2, double d3) {
            this.id = id;
            this.ten = ten;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        @Override
        public String toString() {
            DecimalFormat df = new DecimalFormat("#.0");
            return id + " " + ten + " " + lop + " " + df.format(d1) + " " + df.format(d2) + " " + df.format(d3);
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
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(),
                Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a);
        int no = 1;
        for (Student stu : a) {
            System.out.print(no++ + " ");
            System.out.println(stu);
        }
    }

}
