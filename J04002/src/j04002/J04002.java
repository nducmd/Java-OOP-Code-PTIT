

package j04002;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04002 {
    public static String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String[] path = s.split("\\s+");
        String res = "";
        for (String path1 : path) {
            String x = String.valueOf(path1.charAt(0)).toUpperCase() + path1.substring(1);
            res = res + " " + x;
        }
        return res.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange a = new Rectange(sc.nextDouble(), sc.nextDouble(), chuanhoa(sc.next()));
        if (a.getWidth() > 0 && a.getHeight() > 0) {
            System.out.printf("%.0f %.0f %s", a.findPerimeter(), a.findArea(), Rectange.getColor());
        } else {
            System.out.println("INVALID");
        }
    }

}
