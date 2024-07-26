

package th3_bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH3_bai4 {
    public static class Team implements Comparable<Team>{
        private String ten, truong;

        public Team(String ten, String truong) {
            this.ten = ten;
            this.truong = truong;
        }

        @Override
        public String toString() {
            return ten + " " + truong;
            //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

        @Override
        public int compareTo(Team o) {
            if (this.truong.equals(o.truong)) {
                return this.ten.compareTo(o.ten);
            }
            return this.truong.compareTo(o.truong);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        Map<String, String> mp = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] path = s.split("\\s+");
            mp.put(path[0], s.substring(path[0].length() + 1));
        }
//        for (Map.Entry<String, String> entry : mp.entrySet()) {
//            System.out.println(entry.getKey() + "\n" + entry.getValue());
//        }
        sc = new Scanner(new File("REGISTER.in"));
        t = Integer.parseInt(sc.nextLine());
        ArrayList<Team> a = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] path = s.split("\\s+");
            int tt = Integer.parseInt(path[1]);
            while (tt-- > 0) {
                a.add(new Team(sc.nextLine(), mp.get(path[0])));
            }
        }
        Collections.sort(a);
        int no = 1;
        for (Team team : a) {
            System.out.print(String.format("team%02d ", no++));
            System.out.println(team);
        }
    }

}
