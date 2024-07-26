

package j07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = sc.nextInt();
        ArrayList<Enterprise> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            Enterprise s = new Enterprise(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(s);
        }
        Collections.sort(a);
        for(Enterprise e : a) {
            System.out.println(e);
        }
    }

}
