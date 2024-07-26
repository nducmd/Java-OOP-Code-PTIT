/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02014;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02014 {

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
            int[] f = new int[n+1];
            int res = -1;
            f[0] = 0;
            for (int i = 1; i <= n; i++)
            {
                f[i] = f[i-1] + sc.nextInt();
            }
            for (int i = 1; i <= n; i++)
            {
                if (f[i-1] == f[n] - f[i])
                {
                    res = i;
                    break;
                }
            }
            System.out.println(res);
        }
    }
    
}