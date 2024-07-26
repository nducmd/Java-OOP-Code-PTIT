package displayclock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Timer;

/**
 *
 * @author nducmd
 */
public class ClockPanel extends JPanel implements ActionListener {

    private int hour;
    private int minute;
    private int second;
    private Timer timer;

    public ClockPanel() {
        setCurrentTime();
        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Khởi tạo
        ((Graphics2D) g).setStroke(new BasicStroke(2));
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        
        // Vẽ mặt đồng hồ
        g.setColor(Color.WHITE);
        g.fillOval(xCenter - radius, yCenter - radius, 2 * radius, 2 * radius);
        g.setColor(Color.BLACK);
        g.drawOval(xCenter - radius, yCenter - radius, 2 * radius, 2 * radius);
        Font font = new Font("SansSerif", Font.BOLD, 18);
        g.setFont(font);
        g.drawString("3", xCenter + radius - 15, yCenter + 5);
        g.drawString("6", xCenter - 5, yCenter + radius - 10);
        g.drawString("9", xCenter - radius + 5, yCenter + 5);
        g.drawString("12", xCenter - 10, yCenter - radius + 20);
        
        // Vẽ kim giây
        int sLength = (int) (radius * 0.8);
        int xSecond = (int) (xCenter + sLength
                * Math.sin(second * (2 * Math.PI / 60)));
        int ySecond = (int) (yCenter - sLength
                * Math.cos(second * (2 * Math.PI / 60)));
        g.setColor(Color.red);
        g.drawLine(xCenter, yCenter, xSecond, ySecond);

        // Vẽ kim phút
        int mLength = (int) (radius * 0.65);
        int xMinute = (int) (xCenter + mLength
                * Math.sin(minute * (2 * Math.PI / 60)));
        int yMinute = (int) (yCenter - mLength
                * Math.cos(minute * (2 * Math.PI / 60)));
        
        g.setColor(Color.blue);
        g.drawLine(xCenter, yCenter, xMinute, yMinute);

        // Vẽ kim giờ
        int hLength = (int) (radius * 0.5);
        int xHour = (int) (xCenter + hLength
                * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        int yHour = (int) (yCenter - hLength
                * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        g.setColor(Color.BLACK);
        g.drawLine(xCenter, yCenter, xHour, yHour);
        
        int rectWidth = 100;
        int rectHeight = 30;
        int rectX = xCenter - rectWidth / 2;
        int rectY = yCenter + radius + 10;
        g.setColor(Color.WHITE);
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
        g.setColor(Color.BLACK);
        g.drawRect(rectX, rectY, rectWidth, rectHeight);

        // Thời gian
        g.setFont(new Font("SansSerif", Font.BOLD, 16));
        g.setColor(Color.BLACK);
        String time  = String.format("%02d : ", hour) + 
                String.format("%02d : ", minute) +
                String.format("%02d", second);
        g.drawString(time, xCenter - 40, rectY + rectHeight - 8);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Cập nhật và vẽ lại
        setCurrentTime();
        repaint();
    }

    public void setCurrentTime() {
        // Đặt thời gian hiện tại
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }


}
