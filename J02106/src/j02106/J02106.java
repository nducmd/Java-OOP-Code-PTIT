/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02106;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++)
        {
            int cnt = 0;
            for (int j = 0; j < 3; j++)
            {
                if (a[i][j] == 1)
                {
                    cnt++;
                }
            }
            if (cnt >= 2)
            {
                res++;
            }
       
        }
        System.out.println(res);
    }
    
}
