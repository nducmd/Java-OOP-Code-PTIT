

package j05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Student(sc.nextLine(),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next()),
                    Double.parseDouble(sc.next())));
            sc.nextLine();
        }
        Collections.sort(a);
        for (Student s : a) {
            System.out.println(s);
        }
        
    }

}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/