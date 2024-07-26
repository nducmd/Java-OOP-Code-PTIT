/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorgui;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DucNV
 */
public class BasicCalculator extends JFrame implements ActionListener {

    private Double firstDigit = 0.0, secondDigit = 0.0, result = 0.0, preDigit = 0.0, answer = 0.0;
    private String op = "";
    private String preOP = "";
    boolean clickEqual = false;

    private JTextField inText;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    private JButton buttonDelete;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonDivide;
    private JButton buttonMultiply;
    private JButton buttonClear;
    private JButton buttonSqrt;
    private JButton buttonEqual;
    private JButton buttonPow;

    public BasicCalculator(String string) throws HeadlessException {
        super(string);

        Font customFont = new Font("Arial", Font.BOLD, 20);

        inText = new JTextField();
        inText.setEditable(false);
        inText.setPreferredSize(new Dimension(250, 80));
        inText.setFont(customFont);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonClear = new JButton("C");
        buttonSqrt = new JButton("√");
        buttonEqual = new JButton("=");
        buttonPow = new JButton("Pow");
        buttonDelete = new JButton("<-");

        Dimension buttonSize = new Dimension(65, 65);
        button0.setPreferredSize(new Dimension(130, 65));
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(buttonSize);
        button6.setPreferredSize(buttonSize);
        button7.setPreferredSize(buttonSize);
        button8.setPreferredSize(buttonSize);
        button9.setPreferredSize(buttonSize);
        buttonDelete.setPreferredSize(buttonSize);
        buttonPlus.setPreferredSize(buttonSize);
        buttonMinus.setPreferredSize(buttonSize);
        buttonDivide.setPreferredSize(buttonSize);
        buttonMultiply.setPreferredSize(buttonSize);
        buttonClear.setPreferredSize(buttonSize);
        buttonSqrt.setPreferredSize(buttonSize);
        buttonEqual.setPreferredSize(buttonSize);
        buttonPow.setPreferredSize(buttonSize);

        button0.setFont(customFont);
        button1.setFont(customFont);
        button2.setFont(customFont);
        button3.setFont(customFont);
        button4.setFont(customFont);
        button5.setFont(customFont);
        button6.setFont(customFont);
        button7.setFont(customFont);
        button8.setFont(customFont);
        button9.setFont(customFont);
        buttonDelete.setFont(customFont);
        buttonPlus.setFont(customFont);
        buttonMinus.setFont(customFont);
        buttonDivide.setFont(customFont);
        buttonMultiply.setFont(customFont);
        buttonClear.setFont(customFont);
        buttonSqrt.setFont(customFont);
        buttonEqual.setFont(customFont);
        buttonPow.setFont(new Font("Arial", Font.BOLD, 15));

        JPanel panel = new JPanel();
        JPanel row1 = new JPanel(new FlowLayout());
        JPanel row2 = new JPanel(new FlowLayout());
        JPanel row3 = new JPanel(new FlowLayout());
        JPanel row4 = new JPanel(new FlowLayout());
        JPanel row5 = new JPanel(new FlowLayout());
        JPanel row6 = new JPanel(new FlowLayout());

        panel.setLayout(new GridLayout(7, 1, 10, 10));

        row1.add(inText);

        row2.add(buttonDelete);
        row2.add(buttonClear);
        row2.add(buttonPow);
        row2.add(buttonSqrt);

        row3.add(button7);
        row3.add(button8);
        row3.add(button9);
        row3.add(buttonDivide);

        row4.add(button4);
        row4.add(button5);
        row4.add(button6);
        row4.add(buttonPlus);

        row5.add(button1);
        row5.add(button2);
        row5.add(button3);
        row5.add(buttonMinus);

        row6.add(button0);
        row6.add(buttonEqual);
        row6.add(buttonMultiply);

        panel.add(row1);
        panel.add(row2);
        panel.add(row3);
        panel.add(row4);
        panel.add(row5);
        panel.add(row6);

        add(panel);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonPow.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonClear) {
            inText.setText("");
            preDigit = 0.0;
            preOP = "";
            clickEqual = false;
        } else if (e.getSource() == buttonDelete) {
            if (clickEqual) {
                inText.setText("0");
                clickEqual = false;
            } else if (inText.getText().toString().length() > 0) {
                String s = inText.getText().toString();
                inText.setText(s.substring(0, s.length() - 1));
            }
        } else if (e.getSource() == buttonSqrt) {
            try {
                String s = inText.getText().toString();
                firstDigit = Double.parseDouble(s);
                answer = Math.sqrt(firstDigit);
                firstDigit = answer;
                preDigit = answer;
                inText.setText(Double.toString(answer));
                clickEqual = true;
                preOP = "";
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Yêu cầu nhập số trước");
            }

        } else if (e.getSource() == buttonDivide
                || e.getSource() == buttonMinus
                || e.getSource() == buttonMultiply
                || e.getSource() == buttonPow
                || e.getSource() == buttonPlus) {

            op = e.getActionCommand();
            String s = inText.getText().toString();
            if (s.length() > 0) {
                firstDigit = Double.parseDouble(s);
                inText.setText("");
                if (preOP.equals("")) {
                    preDigit = firstDigit;
                } else if (preOP.equals("+")) {
                    answer = firstDigit + preDigit;
                    firstDigit = answer;
                    preDigit = answer;
                } else if (preOP.equals("-")) {
                    answer = preDigit - firstDigit;
                    firstDigit = answer;
                    preDigit = answer;
                } else if (preOP.equals("*")) {
                    answer = preDigit * firstDigit;
                    firstDigit = answer;
                    preDigit = answer;
                } else if (preOP.equals("/")) {
                    if (firstDigit == 0) {
                        JOptionPane.showMessageDialog(this, "Lỗi chia 0");
                    } else {
                        answer = preDigit / firstDigit;
                        firstDigit = answer;
                        preDigit = answer;
                    }
                } else if (preOP.equals("Pow")) {
                    answer = Math.pow(preDigit, firstDigit);
                    firstDigit = answer;
                    preDigit = answer;
                }
                preOP = op;
            }
        } else if (e.getSource() == buttonEqual) {
            String s = inText.getText().toString();
            secondDigit = Double.parseDouble(s);
            if (op.equals("+")) {
                result = firstDigit + secondDigit;
                answer = result;
                inText.setText(Double.toString(result));
            } else if (op.equals("-")) {
                result = firstDigit - secondDigit;
                answer = result;
                inText.setText(Double.toString(result));
            } else if (op.equals("*")) {
                result = firstDigit * secondDigit;
                answer = result;
                inText.setText(Double.toString(result));
            } else if (op.equals("/")) {
                if (secondDigit == 0) {
                    JOptionPane.showMessageDialog(this, "Lỗi chia 0");
                } else {
                    result = firstDigit / secondDigit;
                    answer = result;
                    inText.setText(Double.toString(result));
                }
            } else if (preOP.equals("Pow")) {
                result = Math.pow(firstDigit, secondDigit);
                answer = result;
                inText.setText(Double.toString(result));
            }
            op = "";
            preDigit = 0.0;
            preOP = "";
            clickEqual = true;
        } else {
            if (clickEqual) {
                clickEqual = false;
                inText.setText(e.getActionCommand());
            } else if (inText.getText().toString().equals("0")) {
                inText.setText(e.getActionCommand());
            } else {
                inText.setText(inText.getText() + e.getActionCommand());
            }

        }
    }

}
