package th1_baif5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nducmd
 */
public class TH1_baif5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> ms = new TreeSet<>();
        while (sc.hasNext()) {
            String s = sc.next();
//            if (s.equals("-1")) {
//                break;
//            }
            if (s.length() >= 8 && s.contains(":")) {
                String[] path = s.split("[\\s,:\\.]");
                if (path.length >= 3) {
                    String tmp = "";
                    String x = path[1];
                    String a1 = path[0];
                    String a2 = path[2];
                    if (a1.length() == 2 && a2.length() == 2) {
                        try {
                            tmp = a1 + ":" + x + ":" + a2;
                            Date d = new SimpleDateFormat("hh:mm:ss").parse(tmp);
                            ms.add(tmp);

                        } catch (Exception ex) {

                        }
                    }
                }

            }
        }

        for (String x : ms) {
            System.out.println(x);
        }

    }
}
/*
[BeginLog]
[Boot Session: 2023/01/31 10:22:00.500]
09:50:44.356  WINWORD (0x43A4)
Section 2023/01/31 10:22:16, 538new
{FILE_QUEUE_COMMIT} 10:22:16.569
Start: 14:17:50.111over
End: 14:17:50.899over 14:17:abcs
 */
