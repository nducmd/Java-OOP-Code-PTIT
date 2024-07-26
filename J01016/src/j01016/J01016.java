/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01016;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int cnt = 0;
        for (int i = 0; i < n.length(); i++)
        {
            if (n.charAt(i) == '4' || n.charAt(i) == '7')
            {
                cnt++;
            }
        }
        if (cnt == 4 || cnt == 7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
