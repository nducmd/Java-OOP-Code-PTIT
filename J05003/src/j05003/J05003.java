

package j05003;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05003 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
            System.out.println(s);
        }
        
    }

}
/*
2
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/