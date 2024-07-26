

package th2_bai7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH2_bai7 {
    public static class Student implements Comparable<Student>{
        private String id, name, lop, email, phone;

        public Student(String id, String name, String lop, String email, String phone) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
            this.phone = "0" + phone;
        }
        @Override
        public String toString() {
            return id + " " + name + " " + lop + " " + email + " "+ phone;
        }
        @Override
        public int compareTo(Student o) {
            if (this.lop.equals(o.lop)) {
                return this.id.compareTo(o.id);
            }
            return this.lop.compareTo(o.lop);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            a.add(new Student(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        for (Student s : a) {
            System.out.println(s);
        }
    }

}
