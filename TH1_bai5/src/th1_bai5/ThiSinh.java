package th1_bai5;

/**
 *
 * @author nducmd
 */
public class ThiSinh implements Comparable<ThiSinh>{

    private String id, name, teamCode, truong;
    public static int no = 1;

    public ThiSinh(String name, String teamCode) {
        this.id = String.format("C%03d", no++);
        this.name = name;
        this.teamCode = teamCode;
    }

    public String getTeamCode() {
        return teamCode;
    }

    
    
    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return this.name.compareTo(o.name);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
