/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01006;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01006 {

    /**
     * @param args the command line arguments
     */
    public static void createFibo(long[] f)
    {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        long[] fibo = new long[100];
        createFibo(fibo);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }
    
}
