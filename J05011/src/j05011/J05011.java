

package j05011;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05011 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Customer> a = new ArrayList<>();
        while (t-- > 0) {
            Customer e = new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(e);
            //System.out.println(e);
        }
        Collections.sort(a);
        for (Customer c : a) {
            System.out.println(c);
        }
    }

}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/