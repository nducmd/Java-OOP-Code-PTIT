

package j05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Product> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            Product p = new Product(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(p);
        }
        
        Collections.sort(a);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/