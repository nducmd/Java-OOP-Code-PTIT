

package th1_bai3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class TH1_bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        sc.nextLine();
        Set<String> set1 =  new TreeSet<>();
        Set<String> set2 =  new TreeSet<>();
        for (int i = 0; i < n1; i++) {
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String[] path = s.split("\\s+");
            for (int j = 0; j < path.length; j++) {
               
                set1.add(path[j]);
            }
        }
        int n2 = sc.nextInt();
        sc.nextLine();
        //System.out.println(set1);
        for (int i = 0; i < n2; i++) {
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String[] path = s.split("\\s+");
            for (int j = 0; j < path.length; j++) {
               
                set2.add(path[j]);
            }
        }
        for (String s : set1) {
            if (!set2.contains(s)) {
                System.out.print(s + " ");
            }
        }
        System.out.println("");
        for (String s : set2) {
            if (!set1.contains(s)) {
                System.out.print(s + " ");
            }
        }
    }

}
/*
2
Lap trinh huong doi tuong
ngon ngu lap trinh C++
2
lap trinh co ban
lap trinh huong thanh phan
*/