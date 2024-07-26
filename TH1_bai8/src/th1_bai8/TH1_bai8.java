

package th1_bai8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author nducmd
 */

public class TH1_bai8 {
    public static boolean check(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        int[] f1 = new int[10005];
        int[] f2 = new int[10005];
        for (int i : a1) {
            if (check(i)) {
                f1[i]++;
            }
            
        }
        for (int i : a2) {
            if (check(i)) {
                f2[i]++;
            }
            
        }
        for (int i = 10; i <= 10000; i++) {
            if(f1[i] > 0 && f2[i] > 0){
                System.out.println(i + " " + f1[i] + " " + f2[i]);
            }
        } 
    }

}
