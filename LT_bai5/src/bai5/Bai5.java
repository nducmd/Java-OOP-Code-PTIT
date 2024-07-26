package bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class Bai5 {

    public static class ThiSinh implements Comparable<ThiSinh> {

        private String id, name, teamCode, truong;
        public static int no1 = 1;

        public ThiSinh(String name, String teamCode) {
            this.id = String.format("C%03d", no1++);
            this.name = name;
            this.teamCode = teamCode;
        }

        public String getTeamCode() {
            return teamCode;
        }

        @Override
        public String toString() {
            return id + " " + name;
        }

        @Override
        public int compareTo(ThiSinh o) {
            return this.name.compareTo(o.name);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static class Truong {

        private String id, team, name;
        public static int no2 = 1;

        public Truong(String team, String name) {
            this.id = String.format("Team%02d", no2++);
            this.team = team;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return team + " " + name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Truong> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Truong tg = new Truong(sc.nextLine(), sc.nextLine());
            mp.put(tg.getId(), tg);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (ThiSinh ts : a) {
            System.out.print(ts + " ");
            System.out.println(mp.get(ts.getTeamCode()));
        }
    }

}
