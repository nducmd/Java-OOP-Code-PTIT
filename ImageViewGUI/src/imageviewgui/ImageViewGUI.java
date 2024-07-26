

package imageviewgui;

import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class ImageViewGUI {
    public static void main(String[] args) {
        ImageFrame f = new ImageFrame("Xem ảnh");
        f.setSize(990, 990);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
