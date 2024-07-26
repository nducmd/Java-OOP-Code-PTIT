

package j07040;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Test test1");
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("NHIPHAN.in"));
        oos1.writeObject(a1);
*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            String[] path = a.get(i).split("\\s+");
            for (int j = 0 ; j < path.length; j++) {
                b.add(path[j].toLowerCase());
            }
            
        }
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String tmp = sc.next().toLowerCase();
            if (b.contains(tmp) && !c.contains(tmp)) {
                System.out.println(tmp);
                c.add(tmp);
            }
        }
    }

}
