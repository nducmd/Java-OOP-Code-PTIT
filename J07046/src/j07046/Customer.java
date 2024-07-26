

package j07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nducmd
 */

public class Customer implements Comparable<Customer>{
    public static int no = 1;
    private String customerId;
    private String name;
    private String roomId;
    private long stay;
    public Customer(String name, String roomId, String in, String out) throws ParseException {
        this.customerId = String.format("KH%02d", no++);
        this.name = name;
        this.roomId = roomId;
        Date i = new SimpleDateFormat("dd/MM/yyyy").parse(in);
        Date o = new SimpleDateFormat("dd/MM/yyyy").parse(out);
        this.stay = TimeUnit.MILLISECONDS.toDays(o.getTime()-i.getTime());
    }

    @Override
    public int compareTo(Customer o) {
        return (int) (-this.stay + o.stay);
    }
    @Override
    public String toString() {
        return customerId + " " + name + " " + roomId + " " + stay;
    }
}
