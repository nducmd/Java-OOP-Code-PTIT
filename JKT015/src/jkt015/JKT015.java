package jkt015;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nducmd
 */
public class JKT015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Stack<Character> truoc = new Stack<>(), sau = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '-') {
                if (!truoc.isEmpty()) {
                    truoc.pop();
                }
            } else if (x == '<') {
                if (!truoc.isEmpty()) {
                    sau.push(truoc.pop());
                }
            } else if (x == '>') {
                if (!sau.isEmpty()) {
                    truoc.push(sau.pop());
                }
            } else {
                truoc.push(x);
            }

        }
        while (!truoc.isEmpty()) {
            sau.push(truoc.pop());
        }
        while (!sau.isEmpty()) {
            System.out.print(sau.pop());
        }
    }

}
