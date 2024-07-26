/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imageviewgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageFrame extends JFrame implements ActionListener, ItemListener {

    private ArrayList<ImageIcon> imageList = new ArrayList<>();
    private int index = -1;
    private JPanel imagePanel = new JPanel();
    private Map<String, Integer> imageSizeOptions;
    private JComboBox<String> sizeComboBox;
    private JButton addImageButton;
    private JButton prevImageButton;
    private JButton nextImageButton;
    private JLabel indexLabel;
    private JLabel imageLabel = new JLabel();

    public ImageFrame(String string) throws HeadlessException {
        super(string);
        setLayout(new BorderLayout());

        sizeComboBox = new JComboBox<>();
        sizeComboBox.addItem("400x400");
        sizeComboBox.addItem("600x600");
        sizeComboBox.addItem("800x800");
        sizeComboBox.addItem("900x900");
        sizeComboBox.setSelectedIndex(2);
        sizeComboBox.addActionListener(this);
        JPanel bottomPanel = new JPanel(new GridLayout(1, 12, 10, 10));
        indexLabel = new JLabel("Không có ảnh");
        prevImageButton = new JButton("Trước");
        nextImageButton = new JButton("Sau");
        addImageButton = new JButton("Thêm ảnh");
        prevImageButton.addActionListener(this);
        nextImageButton.addActionListener(this);
        addImageButton.addActionListener(this);

        bottomPanel.add(new JLabel(""));
        bottomPanel.add(new JLabel(""));
        bottomPanel.add(indexLabel);
        bottomPanel.add(addImageButton);
        bottomPanel.add(sizeComboBox);
        bottomPanel.add(prevImageButton);
        bottomPanel.add(nextImageButton);
        bottomPanel.add(new JLabel(""));
        bottomPanel.add(new JLabel(""));
        add(bottomPanel, BorderLayout.SOUTH);
        add(imageLabel, BorderLayout.CENTER);
        sizeComboBox.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(prevImageButton)) {
            if (imageList.size() == 0) {
                JOptionPane.showMessageDialog(this, "Không có ảnh");
                return;
            }
            index--;
            if (index == -1) {
                index = imageList.size() - 1;
            }
            displayImage();
        } else if (e.getSource().equals(nextImageButton)) {
            if (imageList.size() == 0) {
                JOptionPane.showMessageDialog(this, "Không có ảnh");
                return;
            }
            index++;
            if (index >= imageList.size()) {
                index = 0;
            }
            displayImage();
        } else if (e.getSource().equals(addImageButton)) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image", "jpg","png"));

            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File f = fileChooser.getSelectedFile();
                if (f.getName().toLowerCase().endsWith("jpg")) {
                    try {
                        String file = f.getAbsolutePath();
                        File imageFile = new File(file);
                        Image image = ImageIO.read(imageFile);
                        ImageIcon inputImage = new ImageIcon(image);
                        imageList.add(inputImage);
                        index = imageList.size() - 1;
                        displayImage();
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, "File không tồn tại");
                        return;
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Lỗi đọc file");
                        return;
                    }
                }

            }

        }
    }

    public void displayImage() {
        String s = sizeComboBox.getSelectedItem().toString();
        String[] path = s.split("x");
        indexLabel.setText("" + (index + 1) + "/" + imageList.size());
        ImageIcon resizedImageIcon = new ImageIcon(imageList.get(index).getImage().getScaledInstance(Integer.parseInt(path[0]), Integer.parseInt(path[1]), Image.SCALE_SMOOTH));
        imageLabel.setIcon(resizedImageIcon);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (index != -1) {
            displayImage();
        }

    }

}
