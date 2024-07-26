

package j04007;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        e.print();
    }

}
