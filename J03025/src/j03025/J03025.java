/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03025;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03025 {

    /**
     * @param args the command line arguments
     */
    public static boolean check(String s)
    {
        int cnt = 0;
        for (int i = 0; i < s.length() /2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i -1))
            {
                cnt++;
            }
        }
        if (s.length() % 2 == 0 && cnt == 1)
        {
            return true;
        }
        if (s.length() % 2 == 1 && cnt <= 1)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
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
