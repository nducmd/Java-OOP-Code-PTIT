

package th2_bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH2_bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BigInteger> a = new ArrayList<>();
        String s = sc.nextLine();
        BigInteger minN = new BigInteger(s);
        BigInteger maxN = new BigInteger(s);
        BigInteger sumN = new BigInteger(s);
        t--;
        while (t-- > 0) {
            s = sc.nextLine();
            BigInteger curr = new BigInteger(s);
            if (curr.compareTo(minN) < 0) {
                minN = curr;
            }
            if (curr.compareTo(maxN) > 0) {
                maxN = curr;
            } 
            sumN = sumN.add(curr);
        }
        System.out.println(minN);
        System.out.println(maxN);
        System.out.println(sumN);
    }

}
