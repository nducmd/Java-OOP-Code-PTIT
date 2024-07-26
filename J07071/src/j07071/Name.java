

package j07071;

/**
 *
 * @author nducmd
 */

public class Name implements Comparable<Name>{
    private String name, firstName, shortName = "";
    public Name(String name) {
        this.name = name.trim();
        String[] path = name.split("\\s+");
        this.firstName = path[path.length-1];
        for (int i = 0; i < path.length; i++) {
            shortName += path[i].substring(0,1) + ".";
        }
        shortName =  shortName.substring(0,shortName.length()-1);
    }
    
    public boolean cmp(String s) {
        if (s.length() != shortName.length()) {
            return false;
        }
        int cnt = 0;
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) != shortName.charAt(i)) {
                cnt++;
            }
        }
        return cnt == 1;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name o) {
        if (this.firstName.equals(o.firstName)) {
            return this.name.compareTo(o.name);
        }
        return this.firstName.compareTo(o.firstName);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
