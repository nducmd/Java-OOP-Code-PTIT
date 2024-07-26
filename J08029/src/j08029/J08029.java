

package j08029;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J08029 {
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
    public static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
    public static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    public static int solve(String x, String y) {
        int[][] visited = new int[10][10];
        int[][] d = new int[10][10];
        int t = x.charAt(0) - 'a';
        int s = x.charAt(1) - '0' - 1;
        int v = y.charAt(0) - 'a';
        int u = y.charAt(1) - '0' - 1;
        visited[s][t] = 1;
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        d[s][t] = 0;
        q.add(new Pair(s,t));
        while (!q.isEmpty()) {
            int a = q.peek().getFirst();
            int b = q.peek().getSecond();
            q.poll();
            if (a == u && b == v) {
                return d[u][v];
            }
            for (int i = 0; i < 8; i++) {
                int e = a + dx[i];
                int f = b + dy[i];
                if (e >= 0 && e <= 8 && f >= 0 && f <= 8 && visited[e][f] == 0){
                    visited[e][f] = 1;
                    d[e][f] = d[a][b] + 1;
                    q.add(new Pair(e, f));
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] path = s.split("\\s+");
            System.out.println(solve(path[0], path[1]));
        }
    }

}
