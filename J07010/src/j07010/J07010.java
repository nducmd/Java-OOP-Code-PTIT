

package j07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
            s.print();
        }
    }

}
