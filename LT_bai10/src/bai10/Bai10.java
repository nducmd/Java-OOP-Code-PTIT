

package bai10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class Bai10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            a.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        for (SinhVien sv : a) {
            System.out.println(sv);
        }
    }

}
