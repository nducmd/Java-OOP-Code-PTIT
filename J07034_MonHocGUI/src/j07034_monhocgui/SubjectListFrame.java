package j07034_monhocgui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.*;

/**
 *
 * @author nducmd
 */
public class SubjectListFrame extends JFrame implements ActionListener {

    private String file = "";
    private JButton importButton = new JButton("Nhập");
    private JButton sortButton = new JButton("Sắp xếp");
    private DefaultTableModel model;
    private JTable table;
    private ArrayList<Subject> subjectList = new ArrayList<>();

    public SubjectListFrame(String string) throws HeadlessException {
        super(string);
        setLayout(new BorderLayout());
        JPanel leftPanel = new JPanel(new GridLayout(12, 1));

        leftPanel.add(new JLabel("Thông tin môn học", JLabel.CENTER));
        leftPanel.add(new JPanel());

        JPanel leftBottomPanel = new JPanel();
        leftBottomPanel.add(importButton);
        leftBottomPanel.add(sortButton);
        leftPanel.add(leftBottomPanel);

        

        add(leftPanel, BorderLayout.WEST);

        String[] headers = {"Mã môn", "Tên môn", "Số tín chỉ"};

        model = new DefaultTableModel(headers, 0);


        table = new JTable(model);


        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        importButton.addActionListener(this);
        sortButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(importButton)) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("File input", "in"));

            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File f = fileChooser.getSelectedFile();
                if (f.getName().toLowerCase().endsWith("in")) {
                    try {
                        file = f.getAbsolutePath();
                        Scanner sc = new Scanner(new File(f.getAbsolutePath()));
                        subjectList.clear();
                        while (sc.hasNextLine()) {
                            String line = sc.nextLine();
                            String[] row = line.split(",");
                            subjectList.add(new Subject(row[0], row[1], row[2]));
                        }
                        refreshTable();
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, "File không tồn tại");
                    }
                }
            }
        } else if (e.getSource().equals(sortButton)) {
            Collections.sort(subjectList);
            refreshTable();
        }
    }

    private void refreshTable() {
        model.setRowCount(0);
        for (Subject subject : subjectList) {
            model.addRow(subject.toObject());
        }
    }


}
