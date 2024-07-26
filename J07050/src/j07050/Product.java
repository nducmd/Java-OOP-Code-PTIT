

package j07050;

/**
 *
 * @author nducmd
 */

public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private String group;
    private double buy, sell, profit;
    private static int no = 1;
    public Product(String name, String group, double buy, double sell) {
        this.id = String.format("MH%02d", no++);
        this.name = name;
        this.group = group;
        this.profit = sell - buy;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", profit);
    }
    @Override
    public int compareTo(Product o) {
        return (int)(-this.profit + o.profit);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
