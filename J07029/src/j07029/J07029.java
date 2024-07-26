

package j07029;

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

public class J07029 {
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
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
        oos.writeObject(songuyen);
        
        */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        int[] f = new int[1000005];
        for (int i : a) {
            if (isPrime(i)) {
                f[i]++;
            }
        }
        int cnt = 0;
        for (int i = 1000000; i >= 2; i--) {
            if (f[i] > 0) {
                System.out.println(i + " " + f[i]);
                cnt++;
                if (cnt == 10) {
                    break;
                }
            }
        }
    }

}
