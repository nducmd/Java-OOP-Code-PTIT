/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03010;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nducmd
 */
public class J03010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Set<String> mark = new HashSet<String>();
        while (t-- > 0)
        {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            String email  = s[s.length -1];
            for (int i = 0; i < s.length - 1; i++)
            {
                email = email + s[i].charAt(0);
            }
            if (!mark.contains(email))
            {
                System.out.println(email + "@ptit.edu.vn");
                mark.add(email);
            }
            else
            {
                int i = 2;
                while (mark.contains(email + Integer.toString(i)))
                {
                    i++;
                }
                email = email + Integer.toString(i);
                mark.add(email);
                System.out.println(email + "@ptit.edu.vn");
            }
        }
    }
    
}
