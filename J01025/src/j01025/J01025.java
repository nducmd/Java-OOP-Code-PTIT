/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01025;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class J01025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int tx1 = sc.nextInt();
        int ty1 = sc.nextInt();
        int px1 = sc.nextInt();
        int py1 = sc.nextInt();
        int tx2 = sc.nextInt();
        int ty2 = sc.nextInt();
        int px2 = sc.nextInt();
        int py2 = sc.nextInt();
        int x1 = Math.min(tx1, tx2);
        int y1 = Math.min(ty1, ty2);
        int x2 = Math.max(px1, px2);
        int y2 = Math.max(py1, py2);
        int c = Math.max((x2 - x1), (y2 - y1));
        System.out.println(c*c);
    }
    
}
