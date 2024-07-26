

package th3_bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nducmd
 */

public class TH3_bai2 {
    public static class Student implements Comparable<Student>{
        private String ten;
        private int onl;
        private Date vao, ra;

        public Student(String ten, String vao, String ra) throws ParseException {
            this.ten = ten;
            this.vao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(vao);
            this.ra = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(ra);
            this.onl = (int) TimeUnit.MILLISECONDS.toMinutes(this.ra.getTime() - this.vao.getTime());
        }

        @Override
        public String toString() {
            return ten + " " + onl;
        }

        @Override
        public int compareTo(Student o) {
            if (this.onl == o.onl) {
                return this.ten.compareTo(o.ten);
            }
            return -this.onl + o.onl;
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (Student stu : a) {
            System.out.println(stu);
        }
    }

}
