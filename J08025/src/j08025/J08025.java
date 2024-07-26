

package j08025;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J08025 {
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
    public static class Square {
        int[] a = new int[6];

        public Square(int[] b) {
            for (int i = 0; i < 6; i++) {
                a[i] = b[i];
            }
        }

        public int[] getA() {
            return a;
        }
        
        public int[] rotateRight() {
            int[] tmp = new int[6];
            tmp[0] = a[0];
            tmp[1] = a[4];
            tmp[2] = a[1];
            tmp[3] = a[3];
            tmp[4] = a[5];
            tmp[5] = a[2];
            
            return tmp;
        }
        public int[] rotateLeft() {
            int[] tmp = new int[6];
            tmp[0] = a[3];
            tmp[1] = a[0];
            tmp[2] = a[2];
            tmp[3] = a[4];
            tmp[4] = a[1];
            tmp[5] = a[5];
            
            return tmp;
        }
        @Override
        public boolean equals(Object o) {
            Square ot = (Square) o;
            for (int i = 0; i < 6; i++) {
                if (this.a[i] != ot.a[i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[6];
            int[] b = new int[6];
            for (int i = 0; i < 6; i++) {
                a[i] = sc.nextInt();
                
            }
            for (int i = 0; i < 6; i++) {
                b[i] = sc.nextInt();
            }
            Square s1 = new Square(a);
            Square s2 = new Square(b);
            
            Queue<Pair<Square, Integer>> q = new LinkedList<>();
            q.add(new Pair(s1, 0));
            while (!q.isEmpty()) {
                Square curr = new Square(q.peek().getFirst().getA());
                if (curr.equals(s2)) {
                    System.out.println(q.peek().getSecond());
                    break;
                }
                q.add(new Pair(new Square(curr.rotateLeft()),q.peek().getSecond()+1 ));
                q.add(new Pair(new Square(curr.rotateRight()),q.peek().getSecond()+1 ));
                q.poll();
            }
        }
    }

}
