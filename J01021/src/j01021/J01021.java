/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01021;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01021 {

    /**
     * @param args the command line arguments
     */
    final static int MOD = (int)1e9 + 7;
    public static long pow(long a, long b)
    {
        if (b == 0) return 1;
        if (b == 1)
        {
            return a;
        }
        long k = pow(a, b / 2);
        if (b % 2 == 0)
        {
            return (k * k) % MOD;
        }
        else
        {
            return (((k * k)%MOD)*a) % MOD ;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        while (a != 0 || b != 0)
        {
            System.out.println(pow(a,b));
            a = sc.nextLong();
            b = sc.nextLong();
        }
        
    }
    
}
