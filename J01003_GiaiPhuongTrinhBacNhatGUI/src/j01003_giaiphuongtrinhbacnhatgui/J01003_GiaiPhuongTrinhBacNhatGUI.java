

package j01003_giaiphuongtrinhbacnhatgui;

import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class J01003_GiaiPhuongTrinhBacNhatGUI extends JFrame {
    public static void main(String[] args) {
        QuestionFrame f =  new QuestionFrame("J01003 GIẢI PHƯƠNG TRÌNH BẬC NHẤT");
        f.setVisible(true);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
