/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03013;

import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0)
        {
            BigInteger  diff;
            String input1 = sc.next();
            String input2 = sc.next();
            BigInteger  a = new BigInteger (input1);
            BigInteger  b = new BigInteger (input2);
            diff = a.subtract(b).abs();
            String s = String.valueOf(diff);
            while (s.length() < Math.max(input1.length(), input2.length()))
            {
                s = "0" + s;
            }
            System.out.println(s);
        }
        
    }
    
}
