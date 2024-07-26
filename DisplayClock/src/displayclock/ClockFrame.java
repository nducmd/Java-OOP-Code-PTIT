

package displayclock;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class ClockFrame extends JFrame {
    
    public ClockFrame(String string) throws HeadlessException {
        super(string);
        ClockPanel clock = new ClockPanel();
        add(clock);
    }

}
