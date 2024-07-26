package j07085;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author nducmd
 */
public class J07085 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*ArrayList<String> a = new ArrayList<>();
        a.add("Jhsf00dklT12uhf780LPPZH");
        a.add("AAAAddd0000000000000000001T");
a.add("AAAA");
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("DATA.in"));
        oos1.writeObject(a);
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        for (String s : a) {
            int sum = 0;
            String x = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    x += s.charAt(i);
                    sum += s.charAt(i) - '0';
                }
            }
            if (!x.equals("")) {
                while (x.charAt(0) == '0') {
                    x = x.substring(1);
                }
                System.out.println(x+ " " + sum);
            }
        }
    }

}
