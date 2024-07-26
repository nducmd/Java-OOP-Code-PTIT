

package tap_hop_so_nguyen;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class Tap_hop_so_nguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[1002], b[] = new int[1002];
        for(int i = 0; i<n; i++) a[sc.nextInt()] = 1;
        for(int i = 0; i<m; i++) b[sc.nextInt()] = 1;
        for (int i = 0; i <= 1000; i++) {
            if (a[i] == b[i] && a[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i <= 1000; i++) {
            if (b[i] == 0 && a[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i <= 1000; i++) {
            if (b[i] == 1 && a[i] == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        
    }

}
