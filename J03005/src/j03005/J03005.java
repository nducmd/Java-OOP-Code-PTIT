/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03005;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03005 {

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
            s = s + ",";
            String[] tmp = s.split(" ");
            tmp[0] = String.valueOf(tmp[0].charAt(0)).toUpperCase() + tmp[0].substring(1);
            tmp[0] = tmp[0].toUpperCase();
            for (int i = 1; i < tmp.length; i++)
            {
                tmp[i] = String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                System.out.print(tmp[i] + " ");
            }
            System.out.print(tmp[0] + '\n');
        }
    }
    
}
