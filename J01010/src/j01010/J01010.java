/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01010;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01010 {

    /**
     * @param args the command line arguments
     */
    public static String cutHalf(String s)
    {
        int[] f = new int[100];
        f[48] = 0;
        f[49] = 1;
        f[55] = 0;
        f[56] = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9')
            {
                return "INVALID";
            }
            else
            {
                res = res + Integer.toString(f[s.charAt(i)]);
            }
        }
        while (res.length() > 0 && res.charAt(0) == '0')
        {
            res = res.substring(1, res.length());
       
        }
        if (res.equals(""))
        {
            return "INVALID";
        }
        else
        {
            return res;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s = sc.next();
            System.out.println(cutHalf(s));
        }
    }
    
}
