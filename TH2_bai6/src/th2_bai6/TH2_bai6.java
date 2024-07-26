

package th2_bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class TH2_bai6 {
    public static class User {
        private String user, pass;
        private int cnt;

        public User(String user, String pass, int cnt) {
            this.user = user;
            this.pass = pass;
            this.cnt = cnt;
        }

        public String getUser() {
            return user;
        }

        public String getPass() {
            return pass;
        }

        public int getCnt() {
            return cnt;
        }

        public void incCnt() {
            this.cnt++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<User> a = new ArrayList<>();
        Map<String, User> mp = new HashMap<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] path = s.split("\\s+");
            User us = new User(path[0], path[1], 0);
            a.add(us);
        }
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] path = s.split("\\s+");
            for (User us : a){
                if (us.getUser().equals(path[0])) {
                    if (us.getPass().equals(path[1])) {
                        us.incCnt();
                        break;
                    }
                }
            }
        }
        for (User us : a) {
            System.out.print(us.getCnt() + " ");
        }
    }

}
/*
4
tendangnhap matkhau
username password
nguoidung m4tkh4un4yr4tb40m4t
user2 password
6
tendangnhap matkhau
username matkhau
bfc34 contest
username password
tendangnhap matkhau
user2 password
*/