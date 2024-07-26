

package j07072;

/**
 *
 * @author nducmd
 */

public class Name implements Comparable<Name>{
    private String fullName, ten, ho, dem;
    public Name(String fullName)  {
        this.fullName = standardName(fullName);
        String[] path = this.fullName.split("\\s+");
        ten = path[path.length - 1];
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
        return fullName;
    }
    @Override
    public int compareTo(Name o) {
        if (this.ten.equals(o.ten)) {
            return this.fullName.compareTo(o.fullName);
        } 
        return this.ten.compareTo(o.ten);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
