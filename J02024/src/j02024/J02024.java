package j02024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02024 {

    public static List<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<Integer> curr = new ArrayList<>();

    public static void Try(int i, ArrayList<Integer> a, int sum) {
        if (curr.size() > a.size()) {
            return;
        }
        if (sum % 2 == 1) {
            String s = "";
            for (int k = 0; k < curr.size(); k++) {
                s += curr.get(k) + " ";
            }
            //res.add(s.trim());
            res.add(new ArrayList<>());
            res.get(res.size() - 1).addAll(curr);
        }
        for (int j = i; j < a.size(); j++) {

            curr.add(a.get(j));
            sum += a.get(j);
            Try(j + 1, a, sum);
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
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            Collections.sort(a, (o1, o2) -> o2.compareTo(o1));
            Try(0, a, 0);
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
