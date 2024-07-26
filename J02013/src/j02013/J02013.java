/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02013;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02013 {

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
        for (int i = 0; i < n; i++)
        {
            int flag = 0;
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = 1;
                }
            if (flag == 0)
            {
                break;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }
    
}
