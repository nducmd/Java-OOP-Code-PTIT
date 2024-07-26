package j01003_giaiphuongtrinhbacnhatgui;

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
        topicTextArea.setText(" Phương trình bậc nhất là phương trình dạng ax + b = 0.\n");
        topicTextArea.append(" Viết chương trình nhập vào hệ số a,b là các số thực và thực hiện giải phương trình bậc nhất.\n");
        topicTextArea.append("   *Nếu phương trình vô nghiệm thì in ra VN\n");
        topicTextArea.append("   *Nếu phương trình có vô số nghiệm thì in ra VSN\n");
        topicTextArea.append("   *Nếu phương trình có nghiệm duy nhất thì in ra với định dạng luôn 2 chữ số thập phân\n");
        topicTextArea.append("\n");
        topicTextArea.append(" Input(ô bên trái): chỉ có 2 số thực a và b \n");
        topicTextArea.append(" Output(ô bên phải): Ghi ra kết quả theo yêu cầu. \n");
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
        inputTextArea.setText(lines[0]);// nhập nhiều hơn 1 dòng thì xoá dòng thừa
        String[] input = lines[0].split("\\s+");
        double a,b;
        try {
            if (input.length < 2){
                throw new ArrayIndexException();
            }
            a = Double.parseDouble(input[0]);
            b = Double.parseDouble(input[1]);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi không phải số thực.");
            return;
        } catch (ArrayIndexException aiex) {
            JOptionPane.showMessageDialog(this, aiex.getMessage());
            return;
        }

        resultTextArea.setText("");
        if (a == 0 && b != 0) {
            resultTextArea.append("VN");
        } else if (a == 0 && b == 0) {
            resultTextArea.append("VSN");
        } else {
            resultTextArea.append(String.format("%.2f", -b / a));
        }
    }

}
