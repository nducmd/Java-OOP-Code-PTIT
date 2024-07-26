

package th1_bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH1_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
 
        Map<String, Truong> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Truong tg = new Truong(sc.nextLine(), sc.nextLine());
            mp.put(tg.getId(), tg);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (ThiSinh ts : a) {
            System.out.print(ts + " ");
            System.out.println(mp.get(ts.getTeamCode()));
        }
    }

}