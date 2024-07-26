

package j07034_monhocgui;

import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class J07034_MonHocGUI {
    public static void main(String[] args) {
        SubjectListFrame f =  new SubjectListFrame("J07034 DANH SÁCH MÔN HỌC");
        f.setVisible(true);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
