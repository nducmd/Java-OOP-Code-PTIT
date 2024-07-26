

package j08026;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J08026 {
    public static class Pair<T, S> {
        private T first;
        private S second;

        public Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0 ){
            Map<Integer, Integer> m = new HashMap<>();
            Queue<Pair<Integer, Integer>> q = new LinkedList<>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            m.put(a, 1);
            q.add(new Pair(a,0));
            while (!q.isEmpty()) {
                int c = q.peek().getFirst();
                int d = q.peek().getSecond();
               
                q.poll();
                if (c == b) {
                    System.out.println(d);
                    break;
                }
                if (c < b && !m.containsKey(c*2)) {
                    q.add(new Pair(c*2, d+1));
                    m.put(c*2, 1);
                }
                if (c > 1 && !m.containsKey(c-1)) {
                    q.add(new Pair(c-1, d+1));
                    m.put(c-1, 1);
                }
            }
        }
    }

}
