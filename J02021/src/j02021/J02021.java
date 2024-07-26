/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02021;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02021 {

    /**
     * @param args the command line arguments
     */
    public static boolean nextTH(int[] a, int n, int k)
    {
        int i = k;
        while (i > 0 && a[i] >= n - k +i)
        {
            i--;
        }
        if (i == 0)
        {
            return false;
        }
        a[i]++;
        for (int j = i+1; j<=k; j++)
        {
            a[j] = a[i] + j - i;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= k; i++)
        {
            a[i] = i;
        }
        int cnt = 0;
        do
        {
            cnt++;
            for (int i = 1; i <= k; i++)
            {
                System.out.print(a[i]);
            }
            System.out.print(" ");
            
        } while (nextTH(a, n, k));
        System.out.println("\nTong cong co " + cnt + " to hop");
    }
    
}
