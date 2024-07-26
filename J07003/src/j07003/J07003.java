/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07003;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J07003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while (s.length() > 1)
        {
            int n = s.length();
            String a = s.substring(0, n/2);
            String b = s.substring(n/2);
            BigInteger c = new BigInteger(a);
            BigInteger d = new BigInteger(b);
            BigInteger sum = c.add(d);
            s = sum.toString();
            System.out.println(s);
        }
    }

}
