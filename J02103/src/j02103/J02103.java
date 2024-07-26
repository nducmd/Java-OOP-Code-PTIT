/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02103;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    b[j][i] = a[i][j];
                }
            }
     
            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    int tmp = 0;
                    for (int k = 0; k < m; k++)
                    {
                        tmp += a[i][k] * b[k][j];
                    }
                    System.out.print(tmp + " ");
                }
                System.out.println("");
            }
        }
    }
    
}
