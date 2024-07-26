

package j07054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07054 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = sc.nextInt();
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            a.add(new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        int top = 1;
        for (int i = 0; i < a.size(); i++) {
            if (i == 0 ){
                System.out.print(a.get(i));
                System.out.println(i+1);
                top = i + 1;
            } else if (a.get(i).getDiem() == a.get(i-1).getDiem()) {
                System.out.print(a.get(i));
                System.out.println(top);
            } else {
                System.out.print(a.get(i));
                System.out.println(i+1);
                top = i + 1;
            }
        }
    }

}
