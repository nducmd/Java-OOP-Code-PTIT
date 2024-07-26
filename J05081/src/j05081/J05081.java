

package j05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05081 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       sc.nextLine();
       ArrayList<Product> a = new ArrayList<>();
       while (t-- > 0) {
           a.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
       }
       Collections.sort(a);
       for (Product p : a) {
           System.out.println(p);
       }
    }

}
