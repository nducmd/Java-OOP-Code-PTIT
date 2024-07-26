

package j07059;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nducmd
 */

public class Subject implements Comparable<Subject>{
    private String id, date, hour, room;
    private static int no = 1;
    private Date d;
    public Subject(String date, String hour, String room) throws ParseException {
        this.id=  String.format("C%03d", no++);
        this.date = date;
        this.hour = hour;
        this.room = room;
        d = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(date + " " + hour);
    }
    @Override
    public String toString() {
        return id + " " + date + " " + hour + " " + room;
    }
    @Override
    public int compareTo(Subject o) {
        if (this.d.getTime() == o.d.getTime()) {
            return this.id.compareTo(o.id);
        }
        return (int) (this.d.getTime() - o.d.getTime());
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}