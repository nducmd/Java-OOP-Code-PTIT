

package j04012;

import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(e);
    }

}

/*
Bui Thi Trang
45000
23
PGD
*/