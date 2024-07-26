

package j07056;

/**
 *
 * @author nducmd
 */

public class Customer implements Comparable<Customer>{
    private static int no = 1;
    private String id, name;
    private int in, out, total, vat;
    public Customer(String name, String type, int prev, int curr) {
        this.id = String.format("KH%02d", no++);
        this.name = standardName(name);
        int q = getQ(type);
        if (curr - prev < q) {
            in = (curr - prev) * 450;
            out = 0;
            total = in;
        } else {
            in = q * 450;
            out = ((curr - prev) - q) * 1000;
            vat = out/20;
            total = in + out + vat;
        }
    }
    
    private int getQ(String c) {
        if (c.equals("A")) {
            return 100;
        } else if (c.equals("B")) {
            return 500;
        }
        return 200;
    }
    public String standardName(String name) {
        name = name.trim().toLowerCase();
        String[] path = name.split("\\s+");
        String res = "";
        for (int i = 0; i < path.length; i++) {
            res += path[i].substring(0, 1).toUpperCase() + path[i].substring(1) + " ";
        }
        return res.trim();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + in + " " + out + " " + vat + " "  + total;
    }
    @Override
    public int compareTo(Customer o) {
        return -this.total + o.total;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
