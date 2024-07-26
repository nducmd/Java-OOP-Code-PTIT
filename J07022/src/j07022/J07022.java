/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J07022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext())
        {
            String s = sc.next();
            
            try {
                
                int t = Integer.parseInt(s);
            } catch (Exception e) {
                a.add(s);
                
            }
            
        }
        Collections.sort(a);
        for (int i = 0 ; i < a.size(); i++)
        {
            System.out.print(a.get(i) + " ");
        }
    }
    
}
