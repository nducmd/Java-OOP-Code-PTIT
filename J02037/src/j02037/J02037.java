

package j02037;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J02037 {
    public static boolean isOdd(String s) {
        Scanner in = new Scanner(s);
        int cntOdd = 0;
        int cntEven = 0;
        while (in.hasNextInt()) {
            int tmp = in.nextInt();
            if (tmp % 2 == 0) {
                cntEven++;
            } else {
                cntOdd++;
            }
        }
        if (cntOdd > cntEven && (cntOdd + cntEven) % 2 == 1) {
            return true;
        }
        return false;
    }
    public static boolean isEven(String s) {
        Scanner in = new Scanner(s);
        int cntOdd = 0;
        int cntEven = 0;
        while (in.hasNextInt()) {
            int tmp = in.nextInt();
            if (tmp % 2 == 0) {
                cntEven++;
            } else {
                cntOdd++;
            }
        }
        if (cntOdd < cntEven && (cntOdd + cntEven) % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (isEven(s) || isOdd(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
