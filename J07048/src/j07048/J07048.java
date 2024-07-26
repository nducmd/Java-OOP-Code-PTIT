

package j07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList<Product> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            Product p = new Product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(p);
        }
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}
