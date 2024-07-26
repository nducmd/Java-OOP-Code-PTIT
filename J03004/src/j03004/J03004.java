/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03004;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s =sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] tmp = s.split(" ");
            for (String x : tmp)
            {
                x = String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1);
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
    
}
