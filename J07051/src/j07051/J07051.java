

package j07051;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07051 {
    
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<Customer> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            Customer c = new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(c);
        }
        Collections.sort(a);
        for (int i = 0 ; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}
