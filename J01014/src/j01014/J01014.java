/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01014;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long n = sc.nextLong();
            long m = 0;
            while (n % 2 == 0)
            {
                n = n / 2;
                m = 2;
            }
            for (long i = 3; i <= Math.sqrt(n); i+=2)
            {
                while (n % i == 0)
                {
                    n = n / i;
                    m = i;
                }
            }
            if (n > 1)
            {
                m = Math.max(m,n);
            }
            System.out.println(m);
        }
    }
    
}
