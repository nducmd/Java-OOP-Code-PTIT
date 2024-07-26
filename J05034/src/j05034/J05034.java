

package j05034;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05034 {
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
            return this.ten.compareTo(o.ten);
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

/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/