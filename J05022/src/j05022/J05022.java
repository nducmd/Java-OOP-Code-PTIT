

package j05022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String clas = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + clas + ":");
            for (Student s : a) {
                if (s.getClas().equals(clas)) {
                    System.out.println(s);
                }
            }
        }
    }

}
