

package j07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07056 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<Customer> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            Customer c = new Customer(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
            a.add(c);
        }
        Collections.sort(a);
        for (Customer c : a) {
            System.out.println(c);
        }
    }

}
