

package j07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        double diemTrungTuyen = 0;
        while (t-- > 0) {
            sc.nextLine();
            ThiSinh q = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(q);
        }
        int chiTieu = sc.nextInt();
        Collections.sort(a);
        if (chiTieu < a.size()) {
            diemTrungTuyen = a.get(chiTieu-1).getDiem();
        } else {
            diemTrungTuyen = a.get(a.size()-1).getDiem();
        }
        System.out.println(String.format("%.1f",diemTrungTuyen));
        for (int i = 0; i < a.size(); i++) {
            a.get(i).setNote(diemTrungTuyen);
            System.out.println(a.get(i));
        }
    }

}
