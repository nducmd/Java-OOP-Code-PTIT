

package j07053;

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

public class J07053 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}
