

package testframe;

/**
 *
 * @author nducmd
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener, ItemListener{
    private JPanel p = new JPanel();
    private JComboBox<String> chon  = new JComboBox<>();
    private JButton ok = new JButton("OK");
    
    public MyFrame(String string) throws HeadlessException {
        super(string);
//        setLayout(new GridLayout(1, 2));
//        add(new JButton("Food to be placed here"));
//        
//        JPanel p1 = new JPanel();
//        p1.setLayout(new BorderLayout());
//        p1.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
//        
//        JPanel p2 =  new JPanel();
//        p2.setLayout(new GridLayout(4, 3));
//        for (int i = 1; i <= 9; i++) {
//            p2.add(new JButton("" + i));
//        }
//        p2.add(new JButton("0"));
//        p2.add(new JButton("Start"));
//        p2.add(new JButton("Stop"));
//        p1.add(p2, BorderLayout.CENTER);
//        add(p1);

        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        
        JPanel ps = new JPanel();
        ps.add(chon);
        ps.add(ok);
        chon.addItem(("Xanh"));
        chon.addItem(("Do"));
        chon.addItem(("Tim"));
        chon.addItem(("Vang"));
        add(ps, BorderLayout.SOUTH);
        ok.addActionListener(this);
        chon.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = chon.getSelectedItem().toString();
        if (s.equals("Xanh")) {
            p.setBackground(Color.blue);
        } else if (s.equals("Do")) {
            p.setBackground(Color.red);
        } else if (s.equals("Tim")) {
            p.setBackground(Color.MAGENTA);
        } else if (s.equals("Vang")) {
            p.setBackground(Color.YELLOW);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = chon.getSelectedItem().toString();
        if (s.equals("Xanh")) {
            p.setBackground(Color.blue);
        } else if (s.equals("Do")) {
            p.setBackground(Color.red);
        } else if (s.equals("Tim")) {
            p.setBackground(Color.MAGENTA);
        } else if (s.equals("Vang")) {
            p.setBackground(Color.YELLOW);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
