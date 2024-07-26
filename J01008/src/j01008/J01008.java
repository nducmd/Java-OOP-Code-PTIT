/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01008;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01008 {

    /**
     * @param args the command line arguments
     */
    public static void factoringPrime(int n)
    {
        int cnt = 0;
        while (n % 2 == 0)
        {
            cnt++;
            n = n / 2;
        }
        if (cnt > 0)
        {
            System.out.print("2(" + cnt + ") ");
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2)
        {
            cnt = 0;
            while (n % i == 0)
            {
                cnt++;
                n = n / i;
            }
            if (cnt > 0)
            {
                System.out.print( i + "(" + cnt + ") ");
            }
        }
        if (n > 1)
        {
            System.out.print(n + "(1)");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            factoringPrime(n);
        }
    }
    
}
