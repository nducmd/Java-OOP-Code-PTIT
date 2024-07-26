

package j07055;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = sc.nextInt();
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            a.add(new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}
