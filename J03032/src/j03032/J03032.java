/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03032;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String[] s = sc.nextLine().split("\\s+");
            for (int i = 0; i < s.length; i++)
            {
                StringBuilder tmp = new StringBuilder(s[i]);
                System.out.print(tmp.reverse().toString() + " ");
                
            }
            System.out.println("");
        }
    }
    
}
