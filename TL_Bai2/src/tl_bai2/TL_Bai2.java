

package tl_bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */

public class TL_Bai2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectOutputStream oooo1 = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
//        ObjectOutputStream oooo2 = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
//        ArrayList<String> aa = new ArrayList<>();
//        aa.add("AAAAA");
//        aa.add("BBBBB");
//        ArrayList<Integer> bb = new ArrayList<>();
//        bb.add(123);
//        bb.add(234);
//        oooo1.writeObject(aa);
//        oooo2.writeObject(bb);
        ObjectInputStream oos1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream oos2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> a = (ArrayList<String>) oos1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) oos2.readObject();
        Set<String> s1 = new TreeSet<>();
   
        for (String s : a) {
            for (Integer i : b) {
                String tmp = s + Integer.toString(i);
                s1.add(tmp);
            }
        }
        for (String s : s1) {
            System.out.println(s);
        }
    }

}
