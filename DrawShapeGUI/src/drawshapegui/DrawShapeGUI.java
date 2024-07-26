

package drawshapegui;

import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class DrawShapeGUI {
    public static void main(String[] args) {
        ShapeFrame f = new ShapeFrame("Vẽ các hình cơ bản");
        f.setSize(1100,700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
