

package j04005;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        s.print();
    }

}
