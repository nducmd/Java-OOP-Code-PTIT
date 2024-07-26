/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J07021 {

    /**
     * @param args the command line arguments
     */
    public static void normalize(String s)
    {
        s = s.trim().toLowerCase();
        String[] part = s.split("\\s+");
        for (int  i = 0; i < part.length; i++)
        {
            String x = String.valueOf(part[i].charAt(0)).toUpperCase() + part[i].substring(1);
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            if (s.equals("END"))
            {
                break;
            }
            normalize(s);
        }
    }
    
}
