/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01013;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        int[] f = new int[2000005];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= 2002; i++)
        {
            if (f[i] == 0)
            {
                for (int j = i * i; j <= 2000002; j+=i)
                {
                    if (f[j] == 0)
                    {
                        f[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= 2000002; i++)
        {
            if (f[i] == 0)
            {
                f[i] = i;
            }

        }
        while (t-- > 0)
        {
            int n = sc.nextInt();
            while (n > 1)
            {
                sum += f[n];
                n = n / f[n];
            }
        }
        System.out.println(sum);
    }
    
}
