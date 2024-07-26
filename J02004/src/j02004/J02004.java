/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02004;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            int i = 0;
            int j = n-1;
            int flag = 1;
            while (i < j)
            {
                if (a[i] != a[j])
                {
                    flag = 0;
                    break;
                }
                i++;
                j--;
            }
            if (flag == 1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
    
}
