

package j07032;

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

public class J07032 {
    public static boolean isReversible(int n) {
        String m = Integer.toString(n);
        StringBuilder sb = new StringBuilder(m);
        sb.reverse();
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) % 2 == 0) {
                return false;
            }
        }
        return Integer.parseInt(sb.toString()) == n && (m.length() >1) && (m.length() % 2 == 1);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
        ArrayList<Integer> a = new ArrayList<>();
        a.add(939);
        a.add(939);
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        oos1.writeObject(a);
        oos2.writeObject(a);
        */
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        int[] f = new int[1000005];
        for (int i : a1) {
            f[i]++;
        }
        for (int i : a2) {
            f[i]++;
        }
        int cnt = 0;
        for (int i = 2; i < 1000000; i++) {
            if (isReversible(i)) {
                if (a1.contains(i) && a2.contains(i)) {
                    System.out.println(i + " " + f[i]);
                    cnt++;
                    if (cnt == 10) {
                        break;
                    }
                }
            }
        }
    }

}
