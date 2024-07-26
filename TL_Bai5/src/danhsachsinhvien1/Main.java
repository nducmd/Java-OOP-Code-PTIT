package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nducmd
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, ClassNotFoundException {
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SV.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        a.add(new SinhVien(1, "Nguyen Van A", "D20", "1/1/2003", (float) 3.19));
        oos.writeObject(a);*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> b = (ArrayList<SinhVien>) ois.readObject();
        for (SinhVien i : b) {
            System.out.println(i);
        }
    }
}
