

package th1_bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH1_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int sum = 0;
            ArrayList<Character> list = new ArrayList<>();
            for (char x : s.toCharArray()) {
                if (Character.isDigit(x)) {
                    sum += x - '0';
                } else {
                    list.add(x);
                }
            }
            Collections.sort(list);
            for (char x : list) {
                System.out.print(x);
            }
            System.out.println(sum);
        }
    }

}
