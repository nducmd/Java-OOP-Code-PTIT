

package j07030;

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

public class J07030 {
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
        ArrayList<Integer> a = new ArrayList<>();
        a.add(227);
        a.add(999773);
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        oos1.writeObject(a);
        oos2.writeObject(a);
        */
        ObjectInputStream ois1 = new ObjectInputStream( new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream( new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        for (int i = 2; i < 1000000/2; i++) {
            if (isPrime(i) && isPrime(1000000 - i)) {
                if (a1.contains(i) && a2.contains(1000000-i)) {
                    System.out.println(i + " " + (1000000 - i));
                }
            }
        }
    }

}
