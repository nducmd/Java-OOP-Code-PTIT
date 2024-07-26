

package colorchoosergui;

import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class ColorChooserGUI {
    public static void main(String[] args) {
        ColorChooserFrame f =  new ColorChooserFrame("Chọn màu");
        f.setVisible(true);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

}
