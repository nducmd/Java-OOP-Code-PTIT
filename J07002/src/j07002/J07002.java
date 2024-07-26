/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07002;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J07002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext())
        {
            String s = sc.next();
            
            try {
                
                sum += Integer.parseInt(s);
            } catch (Exception e) {
            }
            
        }
        System.out.println(sum);
    }
    
}
