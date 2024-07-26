

package th1_bai11;

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

public class TH1_bai11 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        /*ArrayList<String> b = new ArrayList<>();
        b.add("5678321010286421");b.add("9999999000000000000000000");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"))) {
            oos.writeObject(b);
            System.out.println("Binary file cr eated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        for (String s : a) {
            String x = "";
            for (char c : s.toCharArray()) {
                if (c == '0' || c == '1') {
                    x += c;
                }
            }
            long digit = 0;
            for (int i = 0; i < x.length(); i++) {
                digit += (x.charAt(i) - '0') * Math.pow(2, x.length() -1 -i);
            }
            System.out.println(x + " " + digit);
        }
    }

}
