

package calculatorgui;

import javax.swing.JFrame;

/**
 *
 * @author nducmd
 */

public class CalculatorGUI {
    public static void main(String[] args) {
        BasicCalculator f =  new BasicCalculator("Máy tính");
        f.setVisible(true);
        f.setSize(600, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
