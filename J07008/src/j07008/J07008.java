package j07008;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */
public class J07008 {

    public static ArrayList<Integer> curr = new ArrayList<Integer>();
    public static Set<String> data = new TreeSet<>();

    public static void Try(int i, int n, int[] a, int[] b) {
        if (i >= n) {
            return;
        }
        for (int j = i; j < n; j++) {
            if (b[j] == 0) {
                if (curr.isEmpty() || curr.get(curr.size() - 1) < a[j]) {
                    b[j] = 1;
                    curr.add(a[j]);
                    if (curr.size() > 1) {
                        String tmp = Integer.toString(curr.get(0));
                        for (int k = 1; k < curr.size(); k++) {
                            tmp = tmp + " " + curr.get(k);
                        }
                        data.add(tmp);
                    }
                    
                    Try(j + 1, n, a, b);
                    curr.remove(curr.size() - 1);
                    b[j] = 0;
                }

            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Try(0, n, a, b);
        for (String s : data) {
            System.out.println(s);
        }
    }

}
