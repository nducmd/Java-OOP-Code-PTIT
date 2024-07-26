

package j07015;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author nducmd
 */

public class J07015 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
        ArrayList<Integer> songuyen = new ArrayList<>();
        songuyen.add(2); songuyen.add(2); songuyen.add(2);songuyen.add(2);
        songuyen.add(11); songuyen.add(11);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SONGUYEN.in"));
        oos.writeObject(songuyen);
        */
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        int[] f = new int[10005];
        for (int i : a) {
            if (isPrime(i)) {
                f[i]++;
            }
        }
        for (int i = 2; i <= 10000; i++) {
            if (f[i] > 0) {
                System.out.println(i + " " + f[i]);
            }
        }
    }

}
