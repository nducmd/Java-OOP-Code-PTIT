

package th2_bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nducmd
 */

public class TH2_bai2 {
    public static boolean check(int n) {
        if (n  < 10) {
            return false;
        }
        int m = n % 10;
        n = n / 10;
        while (n > 0) {
            if ((n % 10) > m) {
                return false;
            }
            m = n % 10;
            n = n / 10;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
//        ArrayList<Integer> songuyen = new ArrayList<>();
//        songuyen.add(59); songuyen.add(59); songuyen.add(2);songuyen.add(2);
//        songuyen.add(1228); songuyen.add(66);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
//        oos.writeObject(songuyen);
//        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
//        oos1.writeObject(songuyen);
        
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        int[] f1 = new int[100002];
        int[] f2 = new int[100002];
        for (int i : a) {
            if (check(i)) {
                f1[i]++;
            }
        }
        for (int i : b) {
            if (check(i)) {
                f2[i]++;
            }
        }
        Collections.sort(a);
        for (int i : a) {
            if (f1[i] > 0 && f2[i] > 0) {
                System.out.println(i + " " + f1[i] + " " + f2[i]);
                f1[i] = 0;
                f2[i] = 0;
            }
        }
    }

}
