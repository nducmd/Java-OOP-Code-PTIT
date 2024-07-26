

package j07006;

import java.io.File;
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

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(21);
        arrayList.add(1);
        arrayList.add(25);
        arrayList.add(4);

        String fileName = "DATA.in";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(arrayList);
            System.out.println("Binary file cr eated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        int[] f = new int[1005];
        for (int i : a) {
            f[i]++;
        }
        for (int i = 0; i <= 1000; i++) {
            if(f[i] > 0){
                System.out.println(i + " " + f[i]);
            }
        } 
    }

}
