package drawshapegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeFrame extends JFrame implements ActionListener {

    private int selectedShape = 0;
    private boolean fillShape = false;
    private Color shapeColor = Color.BLACK;

    private JPanel p = new JPanel();
    JLabel shapeLabel = new JLabel("Chọn hình: ");
    JComboBox<String> shapeComboBox = new JComboBox<>();

    JCheckBox fillCheckBox = new JCheckBox("Đặc");
    JButton colorButton = new JButton("Chọn màu");

    public ShapeFrame(String title) throws HeadlessException {
        super(title);

        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());

        ps.add(shapeLabel);
        ps.add(shapeComboBox);
        ps.add(fillCheckBox);
        ps.add(colorButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(p, BorderLayout.CENTER);
        mainPanel.add(ps, BorderLayout.SOUTH);
        add(mainPanel);

        shapeComboBox.addItem("Hình vuông");
        shapeComboBox.addItem("Hình chữ nhật");
        shapeComboBox.addItem("Hình tròn");
        shapeComboBox.addItem("Hình thoi");
        shapeComboBox.addItem("Hình ngũ giác");

        shapeComboBox.setActionCommand("shapeComboBox");
        shapeComboBox.addActionListener(this);
        fillCheckBox.setActionCommand("fillCheckBox");
        fillCheckBox.addActionListener(this);
        colorButton.setActionCommand("colorButton");
        colorButton.addActionListener(this);

        p.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                Graphics g = getGraphics();
                g.setColor(shapeColor);
                drawShape(g, x, y);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if ("shapeComboBox".equals(actionCommand)) {
            selectedShape = shapeComboBox.getSelectedIndex();

        } else if ("fillCheckBox".equals(actionCommand)) {
            fillShape = fillCheckBox.isSelected();
        } else if ("colorButton".equals(actionCommand)) {
            shapeColor = JColorChooser.showDialog(this, "Chọn màu", shapeColor);
        }
    }

    private void drawShape(Graphics g, int x, int y) {
        if (selectedShape == 0) {
            if (fillShape) {
                g.fillRect(x, y, 50, 50); // Vẽ hình vuông đặc
            } else {
                g.drawRect(x, y, 50, 50); // Vẽ hình vuông rỗng
            }
        } else if (selectedShape == 1) {
            if (fillShape) {
                g.fillRect(x, y, 80, 50); // Vẽ hình chữ nhật đặc
            } else {
                g.drawRect(x, y, 80, 50); // Vẽ hình chữ nhật rỗng
            }
        } else if (selectedShape == 2) {
            if (fillShape) {
                g.fillOval(x, y, 50, 50); // Vẽ hình tròn đặc
            } else {
                g.drawOval(x, y, 50, 50); // Vẽ hình tròn rỗng
            }
        } else if (selectedShape == 3) { // Hình thoi
            int[] xPoints = {x, x + 20, x + 40, x + 20};
            int[] yPoints = {y + 20, y, y + 20, y + 40};

            if (fillShape) {
                g.fillPolygon(xPoints, yPoints, xPoints.length);
            } else {
                g.drawPolygon(xPoints, yPoints, xPoints.length);
            }
        } else if (selectedShape == 4) { // Hình ngũ giác
            int radius = 40;
            int xCenter = x + radius;
            int yCenter = y + radius;

            int[] xPoints = new int[5];
            int[] yPoints = new int[5];

            for (int i = 0; i < 5; i++) {
                double angle = 2 * Math.PI * i / 5;
                xPoints[i] = (int) (xCenter + radius * Math.cos(angle));
                yPoints[i] = (int) (yCenter + radius * Math.sin(angle));
            }

            if (fillShape) {
                g.fillPolygon(xPoints, yPoints, 5); // Vẽ hình ngũ giác đặc
            } else {
                g.drawPolygon(xPoints, yPoints, 5); // Vẽ hình ngũ giác rỗng
            }
        }
    }
}
