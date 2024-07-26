

package th1_bai5;

/**
 *
 * @author nducmd
 */

public class Truong {
    private String id, team, name;
    public static int no = 1;
    public Truong(String team, String name) {
        this.id = String.format("Team%02d", no++);
        this.team = team;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return team + " " + name; 
    }
}
