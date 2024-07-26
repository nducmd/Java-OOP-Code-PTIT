/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellofile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class HELLOFILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
    
}
