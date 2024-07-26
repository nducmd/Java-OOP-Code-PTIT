/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03026;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J03026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            if (a.equals(b)) {
                System.out.println("-1");
            } else {
                if (a.length() > b.length()) {
                    System.out.println(a.length());
                } else {
                    System.out.println(b.length());
                }
            }
        }
    }
    
}
