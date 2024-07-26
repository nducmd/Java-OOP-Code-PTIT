/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03027;

import java.util.*;


/**
 *
 * @author nducmd
 */
public class J03027 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack();
        for (int i = 0; i < s.length(); i++)
        {
            if (st.empty() || st.peek() != s.charAt(i))
            {
                st.push(s.charAt(i));
            }
            else
            {
                st.pop();
            }
        }
        if (st.size() == 0)
        {
            System.out.println("Empty String");
        }
        else
        {
            String tmp = "";
            while (st.size() != 0)
            {
                tmp = st.peek() + tmp;
                st.pop();
            }
            System.out.println(tmp);
        }
    }
    
}
