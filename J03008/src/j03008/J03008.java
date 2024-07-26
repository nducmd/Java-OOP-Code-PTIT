/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03008;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03008 {

    /**
     * @param args the command line arguments
     */
    public static boolean check(String s)
    {
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        String x = rev.toString();
        if (!s.equals(x))
        {
            return false;
        }
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine();
            if (check(s))
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
