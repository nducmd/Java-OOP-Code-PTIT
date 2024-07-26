package jx003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class JX003 {

    public static class Num implements Comparable<Num> {

        private int k, v;

        public Num(int k, int v) {
            this.k = k;
            this.v = v;
        }

        public int getK() {
            return k;
        }

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }

        @Override
        public int compareTo(Num o) {
            return -this.v + o.v;
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Num> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                a.add(new Num(tmp, 1));
                if (m.containsKey(tmp)) {
                    m.put(tmp, m.get(tmp) + 1);
                } else {
                    m.put(tmp, 1);
                }
            }
            for (Num num : a) {
                num.setV(m.get(num.getK()));
            }
//            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
//                a.add(new Num(entry.getKey(), entry.getValue()));
//            }
            Collections.sort(a);
            for (Num num : a) {
                System.out.print(num.getK() + " ");

            }
            System.out.println("");
        }

    }

}
