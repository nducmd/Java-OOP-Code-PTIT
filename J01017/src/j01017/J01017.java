/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01017;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01017 {

    /**
     * @param args the command line arguments
     */
    public static String check(String n)
    {
        for (int i = 1; i < n.length(); i++)
        {
            int prev = n.charAt(i-1);
            int curr = n.charAt(i);
            if (Math.abs(prev - curr) != 1)
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
