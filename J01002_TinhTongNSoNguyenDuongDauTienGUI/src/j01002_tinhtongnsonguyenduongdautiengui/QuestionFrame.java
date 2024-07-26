

package j01002_tinhtongnsonguyenduongdautiengui;

/**
 *
 * @author nducmd
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author nducmd
 */
public class QuestionFrame extends JFrame implements ActionListener {

    private JButton submitButton;
    private JTextArea inputTextArea, resultTextArea;

    public QuestionFrame(String string) throws HeadlessException {
        super(string);
        setLayout(new GridLayout(3, 1));

        // Đề bài
        JTextArea topicTextArea = new JTextArea();
        Font textFont = new Font("SansSerif", Font.PLAIN, 16);
        topicTextArea.setFont(textFont);
        topicTextArea.setEditable(false);
        topicTextArea.setText(" Cho số nguyên dương N.\n");
        topicTextArea.append(" Hãy tính S = 1 + 2 + ... + N\n");
        topicTextArea.append(" Dữ liệu vào: \n");
        topicTextArea.append("   *Dòng đầu ghi số bộ test, không quá 10\n");
        topicTextArea.append("   *Mỗi dòng ghi một số nguyên dương N, không quá 10^9\n");
        topicTextArea.append(" Kết quả: \n");
        topicTextArea.append("   *Với mỗi test, ghi kết quả trên một dòng.\n");
        add(topicTextArea);

        // Nhập và in kết quả
        JPanel inputOutputAreaPanel = new JPanel();
        inputOutputAreaPanel.setLayout(new GridLayout(1, 2));
        inputTextArea = new JTextArea();
        inputTextArea.setFont(textFont);
        JScrollPane inputScrollPane = new JScrollPane(inputTextArea);
        inputOutputAreaPanel.add(inputScrollPane);
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        resultTextArea.setFont(textFont);
        JScrollPane resultScrollPane = new JScrollPane(resultTextArea);
        inputOutputAreaPanel.add(resultScrollPane);
        add(inputOutputAreaPanel);

        // Nút submit
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = inputTextArea.getText();
        String[] lines = text.split("\n");
        resultTextArea.setText("");
        int t;
        int i = 0;
        try {
            t = Integer.parseInt(lines[0]);
            if (lines.length < t+1 || t > 10) {
                throw new InputException("Yêu cầu nhập đúng số dòng.");
            }
            for (i = 1; i <= t; i++) {
                int n = Integer.parseInt(lines[i]);
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                resultTextArea.append(Long.toString((long)n*(n+1)/2) + "\n");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Dòng " + (i + 1) + ": Yêu cầu nhập số nguyên dương.");
            return;
        } catch (InputException iex) {
            JOptionPane.showMessageDialog(this, iex.getMessage());
            return;
        }
    }

}
