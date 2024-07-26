/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nducmd
 */
public class J03021 {

    /**
     * @param args the command line arguments
     */
    public static String getNumber(Character c)
    {
        if (c < 'a')
            return "";
        if (c <= 'c')
            return "2";
        else if (c <= 'f')
            return "3";
        else if (c <= 'i')
            return "4";
        else if (c <= 'l')
            return "5";
        else if (c <= 'o')
            return "6";
        else if (c <= 's')
            return "7";
        else if (c <= 'v')
            return "8";
        else if (c <= 'z')
            return "9";
        return "";
    }
    public static boolean check(String s)
    {
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        return s.equals(rev.toString());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine().toLowerCase();
            String x = "";
            for (int i = 0; i < s.length(); i++)
            {
                x += getNumber(s.charAt(i));
            }
            if (check(x))
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
