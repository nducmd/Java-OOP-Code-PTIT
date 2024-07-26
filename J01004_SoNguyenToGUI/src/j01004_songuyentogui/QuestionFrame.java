

package j01004_songuyentogui;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
        topicTextArea.setText(" Viết chương trình kiểm tra một số nguyên dương có phải số nguyên tố hay không.\n");
        topicTextArea.append(" Dữ liệu vào: \n");
        topicTextArea.append("   *Dòng đầu của dữ liệu vào ghi số bộ test.\n");
        topicTextArea.append("   *Mỗi dòng tiếp theo có một nguyên dương không quá 9 chữ số.\n");
        topicTextArea.append(" Kết quả: \n");
        topicTextArea.append("   *Với mỗi test, in ra YES nếu đó là số nguyên tố, in ra NO nếu ngược lại.\n");
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
    public String isPrime(int n) {
        if (n < 2){
            return "NO";
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return "NO";
            }
        }
        return "YES";
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
            if (lines.length != t+1) {
                throw new InputException("Yêu cầu nhập đúng số dòng.");
            }
            for (i = 1; i <= t; i++) {
                int n = Integer.parseInt(lines[i]);
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                resultTextArea.append(isPrime(n) + "\n");
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
