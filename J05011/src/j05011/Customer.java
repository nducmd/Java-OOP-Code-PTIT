

package j05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nducmd
 */

public class Customer implements Comparable<Customer>{
    private String name, id;
    long hour, minute, duration;
    public Customer(String id, String name, String in, String out) throws ParseException {
        this.id = id;
        this.name = name;
        Date i = new SimpleDateFormat("hh:mm").parse(in);
        Date o = new SimpleDateFormat("hh:mm").parse(out);
        hour = TimeUnit.MILLISECONDS.toHours(o.getTime() - i.getTime());
        minute = TimeUnit.MILLISECONDS.toMinutes(o.getTime() - i.getTime()) - hour * 60;
        duration = o.getTime() - i.getTime();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + hour + " gio " + minute + " phut";
    }

    @Override
    public int compareTo(Customer o) {
        if (this.duration < o.duration) {
            return 1;
        }
        return -1;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
