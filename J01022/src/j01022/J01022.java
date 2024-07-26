/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01022;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[] f = new long[94];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= 92; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            while (n > 2)
            {
                if (k <= f[n-2])
                {
                    n -= 2;
                }
                else
                {
                    k -= f[n-2];
                    n--;
                }
            }
            System.out.println(n-1);
        }
    } 
    
}
