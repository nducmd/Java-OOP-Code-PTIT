

package j04015;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
        t.print();
    }

}
