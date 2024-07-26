/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03007;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03007 {

    /**
     * @param args the command line arguments
     */
    public static boolean check(String s)
    {
        if (s.charAt(0) != '8' ||s.charAt(s.length()-1) != '8')
        {
            return false;
        }
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        String x = rev.toString();
        if (!s.equals(x))
        {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        if (sum % 10 != 0)
        {
            return false;
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
