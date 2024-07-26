

package j02026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J02026 {
    public static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<Integer> curr = new ArrayList<>();

    public static void Try(int i, int K, ArrayList<Integer> a, int sum) {
        if (curr.size() > K) {
            return;
        }
        if (curr.size() == K) {
            res.add(new ArrayList<>());
            res.get(res.size() - 1).addAll(curr);
        }
        for (int j = i; j < a.size(); j++) {

            curr.add(a.get(j));
            sum += a.get(j);
            Try(j + 1, K, a, sum);
            sum -= a.get(j);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            res.clear();
            curr.clear();
            ArrayList<Integer> a = new ArrayList<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            Collections.sort(a);
            Try(0, k, a,0);
            Collections.sort(res, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                    int minLength = Math.min(list1.size(), list2.size());

                    for (int i = 0; i < minLength; i++) {
                        int result = Integer.compare(list1.get(i), list2.get(i));
                        if (result != 0) {
                            return result;
                        }
                    }

                    return Integer.compare(list1.size(), list2.size());
                }
            });
            for (int i = 0; i < res.size(); i++) {
                for (int j = 0; j < res.get(i).size(); j++) {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println("");
            }
        }
    }

}

