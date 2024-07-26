

package j07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07033 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(s);
        }
        Collections.sort(a);
        for (Student s : a) {
            System.out.println(s);
        }
    }

}
