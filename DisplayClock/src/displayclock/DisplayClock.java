

package displayclock;

import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class DisplayClock {
    
    public static void main(String[] args) {
        ClockFrame f =  new ClockFrame("Đồng hồ");
        f.setVisible(true);
        f.setLocationRelativeTo(null); 
        f.setSize(300, 380);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
