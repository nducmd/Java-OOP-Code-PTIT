

package bai100;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class Bai100 {
    public static class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int ac, sub;

    public SinhVien(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }
    @Override
    public String toString() {
        return name + " " + ac + " " + sub;
    }
    @Override
    public int compareTo(SinhVien o) {
        if (this.ac == o.ac) {
            if (this.sub == o.sub) {
                return this.name.compareTo(o.name);
            }
            return this.sub - o.sub;
        }
        return -this.ac + o.ac;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            a.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        for (SinhVien sv : a) {
            System.out.println(sv);
        }
    }

}
