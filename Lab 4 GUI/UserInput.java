import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInput extends  JFrame {
    private JTextField textField1;
    private JButton clickHereButton;
    private JLabel displayInput;
    private JPanel InputForm;




    public UserInput() {
        clickHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField1.getText();
                displayInput.setText("You entered: " + inputText);
                displayInput.setVisible(true);
//                JOptionPane.showMessageDialog(clickHereButton,inputText);

            }

        });
    }

    public static void main(String[] args) {
        UserInput us=new UserInput();
        us.setContentPane(us.InputForm);
        us.setTitle("Input Form");
        us.setSize(200,300);
        us.setVisible(true);
        us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}















