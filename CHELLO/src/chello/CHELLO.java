/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chello;

/**
 *
 * @author nducmd
 */
public class CHELLO {

    /**
     * @param args the command line arguments
     */
    public static String reverse(String s) {
        String x = "";
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i) + x;
        }
        return x;
    }
    public static void main(String[] args) {
        String s = "hello";
        s = s + "aaa";
        System.out.println(reverse(s));
        System.out.println("Hello PTIT.");
    }
    
}
