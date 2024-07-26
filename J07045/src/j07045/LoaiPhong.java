package j07045;

/**
 *
 * @author nducmd
 */
public class LoaiPhong implements Comparable<LoaiPhong>{

    private String id;
    private String name;
    private int price;
    private double charge;

    public LoaiPhong(String s) {
        String[] path = s.split("\\s+");
        this.id = path[0];
        this.name = path[1];
        this.price = Integer.parseInt(path[2]);
        this.charge = Double.parseDouble(path[3]);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + charge;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}
