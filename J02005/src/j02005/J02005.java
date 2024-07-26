/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02005;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J02005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] fa = new int[1002];
        int[] fb = new int[1002];
        for (int i = 0; i < a; i++)
        {
            int tmp = sc.nextInt();
            fa[tmp] = 1;
        }
        for (int i = 0; i < b; i++)
        {
            int tmp = sc.nextInt();
            fb[tmp] = 1;
        }
        for (int i = 0; i <= 1000; i++)
        {
            if (fa[i] == 1 && fb[i] == 1){
                System.out.print(i + " ");
            }
        }
    }
    
}
