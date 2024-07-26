

package j05081;

/**
 *
 * @author nducmd
 */

public class Product implements Comparable<Product> {

    private String id;
    private String name;
    private String unit;
    private int buy;
    private int sell;
    private int profit;
    public static int cnt = 1;
    public Product(String name, String unit, int buy, int sell) {
        this.id = String.format("MH%03d", cnt++);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell - buy;
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + unit + " " + buy + " " + sell + " " + profit;
    }
    @Override
    public int compareTo(Product o) {
        if (this.profit == o.profit) {
            return this.id.compareTo(o.id);
        }
        return o.profit - this.profit; 
    }

}
