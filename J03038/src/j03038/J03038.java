/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03038;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nducmd
 */
public class J03038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++)
        {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
    
}
