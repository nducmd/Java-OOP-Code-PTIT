/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02034;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02034 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[202];
        int m = 0;
        for (int i = 0; i < n; i++)
        {
            int tmp = sc.nextInt();
            f[tmp]++;
            m = Math.max(m, tmp);
        }
        int cnt = 0;
        for (int i = 1; i <= m; i++)
        {
            if (f[i] == 0)
            {
                System.out.println(i);
                cnt++;
            }
        }
        if (cnt == 0)
        {
            System.out.println("Excellent!");
        }
    }
    
}
