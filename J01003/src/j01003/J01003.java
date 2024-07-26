/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01003;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0 && b != 0)
        {
            System.out.println("VN");
        }
        else if (a == 0 && b == 0)
        {
            System.out.println("VSN");
        }
        else
        {
            System.out.printf("%.2f", -b/a);
        }
    }
    
}
