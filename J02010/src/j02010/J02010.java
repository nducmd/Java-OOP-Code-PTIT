/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02010;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = i + 1; j < n; j++)
                if (a[i] > a[j])
                {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }
    
}
