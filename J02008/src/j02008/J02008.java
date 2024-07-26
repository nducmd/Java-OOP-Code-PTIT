/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02008;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02008 {

    /**
     * @param args the command line arguments
     */
    public static long gcd(long a, long b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
    public static long cal(int n)
    {
        long res = 1;
        for (long i = 2; i <= n ; i++)
        {
            res = i * res / gcd(i, res);
        }
        return res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            System.out.println(cal(n));
        }
    }
    
}
