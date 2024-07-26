/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01012;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01012 {

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
            int cnt = 0;
            if (n % 2 == 0) cnt++;
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    if (i % 2 == 0) cnt++;
                    int tmp = n / i;
                    if (tmp != i && tmp % 2 == 0) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
    
}
