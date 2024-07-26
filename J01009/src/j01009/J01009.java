/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01009;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] f = new long[22];
        f[1] = 1;
        long sum = 0;
        for(int i = 2; i <= n; i++)
        {
            f[i] = f[i-1] * i;
        }
        for (int i = 1; i <= n; i++)
        {
            sum += f[i];
        }
        System.out.println(sum);
    }
    
}
