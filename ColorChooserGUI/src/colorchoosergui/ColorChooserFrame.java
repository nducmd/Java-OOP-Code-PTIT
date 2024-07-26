/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoosergui;

/**
 *
 * @author nducmd
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserFrame extends JFrame implements ActionListener {

    private JPanel colorPanel;

    public ColorChooserFrame(String string) throws HeadlessException {
        super(string);
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        JButton colorButton = new JButton("Choose color");
        colorButton.addActionListener(this);
        add(colorButton, BorderLayout.SOUTH);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Color selectedColor = JColorChooser.showDialog(ColorChooserFrame.this, "Choose color", colorPanel.getBackground());
        if (selectedColor != null) {
            colorPanel.setBackground(selectedColor);
        }
    }

}
