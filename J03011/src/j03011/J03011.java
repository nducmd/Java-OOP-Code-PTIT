/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03011;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            System.out.println(b1.gcd(b2));
        }
    }
    
}
