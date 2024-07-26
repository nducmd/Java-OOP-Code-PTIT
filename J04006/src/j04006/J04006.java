

package j04006;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04006 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(s);
    }

}
