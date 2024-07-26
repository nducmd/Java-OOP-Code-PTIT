/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03009;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author nducmd
 */
public class J03009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String[] a = sc.nextLine().trim().split("\\s+");
            String[] b = sc.nextLine().trim().split("\\s+");
            Set<String> setB = new HashSet<String>();
            for (int i = 0; i < b.length; i++)
            {
                setB.add(b[i]);
            }
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++)
            {
                if (!setB.contains(a[i]))
                {
                    System.out.print(a[i] + " ");
                    setB.add(a[i]);
                }
            }
            System.out.println("");
        }
    }
    
}
