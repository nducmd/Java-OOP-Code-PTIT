package testframe;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author nducmd
 */
public class TestFrame extends JFrame {

    public  TestFrame() {
        // Create an analog clock for the current time
        StillClock clock = new StillClock();

        // Display hour, minute, and hour in the message panel
//        MessagePanel messagePanel = new MessagePanel(clock.getHour()
//                + ":" + clock.getMinute() + ":" + clock.getSecond());
//        messagePanel.setCentered(true);
//        messagePanel.setForeground(Color.blue);
//        messagePanel.setFont(new Font("Courie", Font.BOLD, 16));

        // Add the clock and message panel to the frame
        add(clock);
        //add(messagePanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
//        MyFrame f =  new MyFrame("Test test");
//        f.setVisible(true);
//        f.setSize(300, 200);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TestFrame frame = new TestFrame();
        frame.setTitle("DisplayClock");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        frame.setVisible(true);
    }

}
