package bai13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nducmd
 */
public class Bai13 {

    public static class Subject implements Comparable<Subject> {

        private String id, name, form;

        public Subject(String id, String name, String form) {
            this.id = id;
            this.name = name;
            this.form = form;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + form;
        }

        @Override
        public int compareTo(Subject o) {
            return this.id.compareTo(o.id);
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Set<String> set1 = new HashSet<>();
        ArrayList<Subject> a = new ArrayList<>();
        while (sc.hasNext()) {
            Subject s = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if (!set1.contains(s.getId())) {
                a.add(s);
                set1.add(s.getId());
            }
        }
        Collections.sort(a);
        for (Subject s : a) {
            System.out.println(s);
        }
    }

}
