/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J07004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] a = new int[100002];
        while (sc.hasNextInt())
        {
            int n = sc.nextInt();
            a[n]++;
        }
        for (int i = 0; i <= 1002; i++)
        {
            if (a[i] > 0)
            {
                System.out.println(i + " " + a[i]);
            }
        }
    }
    
}
