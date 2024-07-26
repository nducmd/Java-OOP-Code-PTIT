

package th1_bai7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH1_bai7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext())
        {
            String s = sc.next();
            try {
                long tmp = Long.parseLong(s);
                try {
                    int x = Integer.parseInt(s);
                } catch (Exception e) {
                    sum += tmp;
                }
                
            } catch (Exception e) {
                
            }
        }
        System.out.println(sum);
    }

}
