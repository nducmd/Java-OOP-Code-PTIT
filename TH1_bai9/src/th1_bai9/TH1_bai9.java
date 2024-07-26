

package th1_bai9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH1_bai9 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), I = sc.nextInt()-1;
            int[][] a = new int[105][105];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (a[i][I] > a[j][I]) {
                        int tmp = a[i][I];
                        a[i][I] = a[j][I];
                        a[j][I] = tmp;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
