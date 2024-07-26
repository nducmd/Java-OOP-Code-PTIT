/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02007;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[100002];
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                f[a[i]]++;
            }
            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++)
            {
                if (f[a[i]] > 0)
                {
                    System.out.println(a[i] + " xuat hien " + f[a[i]] + " lan");
                    f[a[i]] = 0;
                }
                
            }
        }
        
    }
    
}
