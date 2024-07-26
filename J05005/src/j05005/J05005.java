

package j05005;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05005 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
            a.add(s);
//System.out.println(s);
        }
        Collections.sort(a);
        for (Student s : a) {
            System.out.println(s);
        }
    }

}
/*
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
*/