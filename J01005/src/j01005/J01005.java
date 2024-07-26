/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01005;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01005 {

    /**
     * @param args the command line arguments
     */
    public static void cal(double n, double h)
    {
        double s = h * 1 / 2;
        double tanA = 0.5 / h;
        for (int i = 1; i < n; i++)
        {
            double tmp = s / n * i;
            tmp = tmp / tanA;
            tmp = Math.sqrt(tmp);
            System.out.printf("%.6f ", tmp);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            double n = sc.nextInt();
            double h = sc.nextInt();
            cal(n, h);
            System.out.println("");
        }
    }
    
}
