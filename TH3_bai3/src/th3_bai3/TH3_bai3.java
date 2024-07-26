

package th3_bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH3_bai3 {
    public static class Matrix {
        private int n, m;
        private int[][] a = new int[102][102];

        public Matrix(int n, int m, String input) {
            this.n = n;
            this.m = m;
            String[] path = input.split("\\s+");
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(path[tmp++]);
                }
            }
        }
        
        public void sortColumn(int c) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (a[i][c] > a[j][c]) {
                        int tmp = a[i][c];
                        a[i][c] = a[j][c];
                        a[j][c] = tmp;
                    }
                }
            }
        }
        
        public void print() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String line1 = sc.nextLine();
            String[] path1 = line1.split("\\s+");
            Matrix mat = new Matrix(Integer.parseInt(path1[0]), Integer.parseInt(path1[1]), sc.nextLine());
            mat.sortColumn(Integer.parseInt(path1[2])-1);
            mat.print();
        }
    }

}
