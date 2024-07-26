

package th1_bai12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class TH1_bai12 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        /*ArrayList<String> b = new ArrayList<>();
        b.add("AAAAA");b.add("BBBBB");
        ArrayList<Integer> cc = new ArrayList<>();
        cc.add(111); cc.add(222);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA1.in"))) {
            oos.writeObject(b);
            System.out.println("Binary file cr eated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA2.in"))) {
            oos.writeObject(cc);
            System.out.println("Binary file cr eated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> a1 = (ArrayList<String>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        Set<String> set1 =  new TreeSet<>();
        Set<Integer> set2 =  new TreeSet<>();
        Set<String> set3 =  new TreeSet<>();
        for (String x : a1) {
            set1.add(x);
        }
        for (int x : a2) {
            set2.add(x);
        }
        for (String x : set1) {
            for (Integer y: set2) {
                set3.add(x + Integer.toString(y));
            }
        }
        for (String x : set3) {
            System.out.println(x);
        }
    }

}
