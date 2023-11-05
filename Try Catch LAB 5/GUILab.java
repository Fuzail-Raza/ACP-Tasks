import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILab {

    static void tests(){
        JFrame j=new JFrame();

        JButton b=new JButton("Click");
        b.setBounds(130,100,100,40);
        JTextField t=new JTextField();
        JTextField t1=new JTextField();
        t.setSize(230,100);
        j.add(t);
        j.add(t1);
        j.add(b);
        JLabel l=new JLabel();
        l.setVisible(true);
        j.add(l);
        l.setSize(200,50);
        j.setSize(400,500);

        j.setLayout(new GridLayout(4,2));
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int val1=Integer.parseInt(t.getText());
                int val2=Integer.parseInt(t1.getText());
                l.setText(Integer.toString(val1+val2));
                String message = t.getText() + " + " + t1.getText() + " = " + Integer.toString(val1 + val2);
                JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        j.setVisible(true);

    }

    public static void main(String[] args) {
            tests();
    }
}
