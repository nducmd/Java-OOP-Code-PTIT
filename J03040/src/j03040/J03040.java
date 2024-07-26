/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03040;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03040 {

    /**
     * @param args the command line arguments
     */
    //12345
    //01234
    public static boolean check (String s)
    {
        if (s.charAt(0) < s.charAt(1)&&
            s.charAt(1) < s.charAt(2)&&
            s.charAt(2) < s.charAt(3)&&
            s.charAt(3) < s.charAt(4))
        {
            return true;
        }
        if (s.charAt(0) == s.charAt(1)&& 
            s.charAt(1) == s.charAt(2)&&
            s.charAt(2) == s.charAt(3)&&
            s.charAt(3) == s.charAt(4))
        {
            return true;
        }    
        if (s.charAt(0) == s.charAt(1)&& 
            s.charAt(1) == s.charAt(2)&&
            s.charAt(3) == s.charAt(4))
        {
            return true;
        }
        if ((s.charAt(0) == '6' || s.charAt(0) == '8')&& 
            (s.charAt(1) == '6' || s.charAt(1) == '8')&&
            (s.charAt(2) == '6' || s.charAt(2) == '8')&&
            (s.charAt(3) == '6' || s.charAt(3) == '8')&&
            (s.charAt(4) == '6' || s.charAt(4) == '8'))
        {
            return true;
        }    
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++)
        {
            String s = sc.nextLine().substring(5);
            s = s.substring(0,3) + s.substring(4);
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
