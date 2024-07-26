package j07051;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;



/**
 *
 * @author nducmd
 */

public class Customer implements Comparable<Customer>{
    private static int no = 1;
    private String id;
    private String name;
    private String room;
    private long stay;
    private int total;
    public int price(String room) {
        if (room.startsWith("1")) {
            return 25;
        } else if (room.startsWith("2")) {
            return 34;
        } else if (room.startsWith("3")) {
            return 50;
        }
        return 80;
    }
    public String standardName(String name) {
        name = name.trim().toLowerCase();
        String[] path = name.split("\\s+");
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += path[i].substring(0,1).toUpperCase() + path[i].substring(1) + " ";
        }
        return res.trim();
    }
    public Customer(String name, String room, String in, String out, int service) throws ParseException {
        this.id = String.format("KH%02d", no++);
        this.name = standardName(name);
        this.room = room.trim();
        Date i = new SimpleDateFormat("dd/MM/yyyy").parse(in);
        Date o = new SimpleDateFormat("dd/MM/yyyy").parse(out);
        this.stay = TimeUnit.MILLISECONDS.toDays(o.getTime()-i.getTime()) + 1;
        this.total = (int) (price(room) * stay + service);
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + stay + " " + total;
    }
    @Override
    public int compareTo(Customer o) {
        return o.total - this.total;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
