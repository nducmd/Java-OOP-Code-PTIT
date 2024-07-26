

package j07048;

/**
 *
 * @author nducmd
 */

public class Product implements Comparable<Product>{
    private String productId;
    private String name;
    private int sell;
    private int cover;
    public Product(String productId, String name, int sell, int cover) {
        this.productId = productId;
        this.name = name;
        this.sell = sell;
        this.cover = cover;
        
    }

    @Override
    public int compareTo(Product o) {
        if (this.sell == o.sell) {
            return this.productId.compareTo(o.productId);
        }
        return -this.sell + o.sell;
    }
    @Override
    public String toString() {
        return productId + " " + name + " " + sell + " " + cover;
    }
}
