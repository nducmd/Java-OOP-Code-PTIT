

package j01008_phantichthuasonguyentogui;

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
        topicTextArea.setText(" Hãy phân tích một số nguyên dương thành tích các thừa số nguyên tố.\n");
        topicTextArea.append(" Dữ liệu vào: \n");
        topicTextArea.append("   *Dòng đầu tiên ghi số bộ test. Mỗi bộ test viết trên một dòng số nguyên dương n không quá 9 chữ số. \n");
        
        topicTextArea.append(" Kết quả: \n");
        topicTextArea.append("   *Mỗi bộ test viết ra thứ tự bộ test\n");
        topicTextArea.append("   *Sau đó lần lượt là các số nguyên tố khác nhau có trong tích, với mỗi số viết thêm số lượng số đó.\n");
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
    public String factorPrime(int n)
    {
        String res = "";
        int cnt = 0;
        while (n % 2 == 0){
            cnt++;
            n = n / 2;
        }
        if (cnt > 0){
            res = res + "2(" + cnt + ") ";
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2){
            cnt = 0;
            while (n % i == 0){
                cnt++;
                n = n / i;
            }
            if (cnt > 0){
                res = res + i + "(" + cnt + ") ";
            }
        }
        if (n > 1){
            res = res + n + "(1)";
        }
        return res;
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
                resultTextArea.append("Test " + i + ": " + factorPrime(n) + "\n");
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
