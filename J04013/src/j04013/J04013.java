

package j04013;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh e = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        System.out.println(e);
    }

}
