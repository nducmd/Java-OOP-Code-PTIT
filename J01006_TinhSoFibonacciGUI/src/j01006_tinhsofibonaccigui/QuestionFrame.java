

package j01006_tinhsofibonaccigui;

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
        topicTextArea.setText(" Dãy số Fibonacci được định nghĩa theo công thức như sau:\n");
        topicTextArea.append("      F1 = 1 \n");
        topicTextArea.append("      F2 = 1 \n");
        topicTextArea.append("      Fn = Fn-1 + Fn-2 với n>2 \n");
        topicTextArea.append(" Viết chương trình tính số Fibonacci thứ n (với n không quá 92)");
        topicTextArea.append(" Dữ liệu vào: \n");
        topicTextArea.append("   *Dòng đầu ghi số bộ test. Mỗi bộ test là một số nguyên n.\n");
        
        topicTextArea.append(" Kết quả: \n");
        topicTextArea.append("   *Với mỗi bộ test, ghi ra số Fibonacci thứ n trên một dòng.\n");
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
    public void createFiboArray(long[] f)
    {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
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
            long[] fibo = new long[100];
            createFiboArray(fibo);
            for (i = 1; i <= t; i++) {
                int n = Integer.parseInt(lines[i]);
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                if (n > 92) {
                    throw new InputException("Dòng " + (i + 1) + "N không quá 92");
                }
                resultTextArea.append(fibo[n] + "\n");
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
