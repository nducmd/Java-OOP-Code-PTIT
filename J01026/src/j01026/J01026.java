/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01026;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01026 {

    /**
     * @param args the command line arguments
     */
    public static boolean check(int n)
    {
        int m = (int) Math.sqrt(n);
        return m * m == n;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            if (check(n))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
    
}
