package j07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nducmd
 */
public class J07005 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> f = new TreeMap<>();
        while (dis.available() > 0) {
            int tmp = dis.readInt();
            f.put(tmp, f.getOrDefault(tmp, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : f.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}


/*
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] f = new int[1005];
        while (dis.available() > 0) {
            int tmp = dis.readInt();
            f[tmp]++;
        }
        for (int i = 0; i <= 1000; i++) {
            if (f[i] > 0) {
                System.out.println(i + " " + f[i]);
            }
        }
*/
