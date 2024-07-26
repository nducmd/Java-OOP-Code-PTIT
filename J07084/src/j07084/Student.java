package j07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nducmd
 */
public class Student implements Comparable<Student>{

    private String name;
    private long stay;

    public Student(String name, String start, String end) throws ParseException {
        this.name = name;
        Date s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(start);
        Date e = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(end);
        this.stay = TimeUnit.MILLISECONDS.toMinutes(e.getTime()-s.getTime());
    }
    @Override
    public String toString() {
        return name + " " + stay;
    }

    @Override
    public int compareTo(Student o) {
        if (this.stay == o.stay) {
            return this.name.compareTo(o.name);
        }
        return (int) (-this.stay + o.stay);
    }
}
