/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03015;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BigInteger  diff;
        String input1 = sc.next();
        String input2 = sc.next();
        BigInteger  a = new BigInteger (input1);
        BigInteger  b = new BigInteger (input2);
        diff = a.subtract(b);
        System.out.println(diff);
    }
    
}
