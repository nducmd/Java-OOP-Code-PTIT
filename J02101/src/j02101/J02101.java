/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02101;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++)
            {
                if (i % 2 == 0)
                {
                    for (int j = 0; j < n; j++)
                    {
                        System.out.print(a[i][j] + " ");
                    }
                }
                else
                {
                    for(int j = n-1; j >= 0; j--)
                    {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
