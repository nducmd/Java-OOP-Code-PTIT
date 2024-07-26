/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01011;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01011 {

    /**
     * @param args the command line arguments
     */
    public static long gcd(long a, long b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0)
        {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long ucln = gcd(a, b);
            long bcnn = a * b / ucln;
            System.out.println(bcnn + " " + ucln );
        }
    }
}
