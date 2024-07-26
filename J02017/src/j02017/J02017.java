/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02017;

import java.util.*;

/**
 *
 * @author nducmd
 */
public class J02017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++)
        {
            int tmp = sc.nextInt();
            if (!st.empty() && (tmp + st.peek()) % 2 == 0)
            {
                st.pop();
            }
            else
            {
                st.push(tmp);
            }
        }
        System.out.println(st.size());
    }
    
}
