/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01024;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01024 {

    /**
     * @param args the command line arguments
     */
    public static String check(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2')
            {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String n = sc.next();
            System.out.println(check(n));
        }
    }
    
}
