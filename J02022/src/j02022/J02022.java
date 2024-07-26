/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02022;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02022 {

    /**
     * @param args the command line arguments
     */
    public static boolean check(String s, int n)
    {
        for (int i = 1; i < n; ++i)
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) == 1)
                return false;
        return true;
    }
    public static void Try(String s, int n, int[] f)
    {
        if (s.length() == n)
        {
            if (check(s, n))
            {
                System.out.println(s);
            }
            return;
        }
        for (int i = 1; i <= n; i++)
        {
            if (f[i] == 0)
            {
                f[i] = 1;
                if (s.length() < n)
                {
                    Try(s + Integer.toString(i), n, f);
                }
                f[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //System.out.println(check(2413, 4));
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] f = new int[11];
            Try("", n, f);
            System.out.println("");
            
        }
    }
    
}
