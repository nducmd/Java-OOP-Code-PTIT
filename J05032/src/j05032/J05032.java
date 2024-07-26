

package j05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */

public class J05032 {
    public static class People implements Comparable<People>{
        private String ten, dob;
        private Date d;
        public People(String ten, String dob) throws ParseException {
            this.ten = ten;
            this.dob = dob;
            this.d = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        }

        public String getTen() {
            return ten;
        }

        @Override
        public int compareTo(People o) {
            return this.d.compareTo(o.d);
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    public static void main(String[] args) throws ParseException {
        ArrayList<People> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            a.add(new People(sc.next(), sc.next()));
        }
        Collections.sort(a);
        System.out.println(a.get(a.size()-1).getTen());
        System.out.println(a.get(0).getTen());
    }

}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/