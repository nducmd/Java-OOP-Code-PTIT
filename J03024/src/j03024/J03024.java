/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03024;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03024 {

    /**
     * @param args the command line arguments
     */
    public static String check(String s)
    {
        if (s.charAt(0) == '0')
        {
            return "INVALID";
        }
        int tong = 0;
        int chan = 0;
        int le = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                if (s.charAt(i) % 2 == 0)
                {
                    chan++;
                }
                else le++;
            }
            else
            {
                return "INVALID";
            }
        }
        tong = chan + le;
        if (tong % 2 == 0 && chan > le)
        {
            return "YES";
        }
        if (tong % 2 == 1 && chan < le)
        {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
    
}
