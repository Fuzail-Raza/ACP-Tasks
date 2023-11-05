import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


 class GUI {
    JFrame calc;
    JPanel pButtons;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bMinus,bMul,bDivide,bPoint,bEqual,bClear;
    JTextField input;

    double num1, num2;
    String operator, inputText;

    public GUI(){
        initGUI();
    }
    void initGUI()
    {
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bClear = new JButton("Clear");
        bMinus = new JButton("-");
        bPlus = new JButton("+");
        bMul = new JButton("*");
        bDivide = new JButton("/");
        bPoint = new JButton(".");
        bEqual = new JButton("=");

        pButtons=new JPanel(new GridLayout(4,4));

        pButtons.add(b1);
        pButtons.add(b2);
        pButtons.add(b3);
        pButtons.add(bClear);

        pButtons.add(b4);
        pButtons.add(b5);
        pButtons.add(b6);
        pButtons.add(bMul);

        pButtons.add(b7);
        pButtons.add(b8);
        pButtons.add(b9);
        pButtons.add(bMinus);

        pButtons.add(bDivide);
        pButtons.add(bPoint);
        pButtons.add(bPlus);
        pButtons.add(bEqual);

        input =new JTextField();
        Insets ma=new Insets(15,12,16,12);
        input.setMargin(ma);

        inputText = "";
        num1 = 0;
        num2 = 0;
        operator = "";

        calc=new JFrame();
        calc.setSize(600,1500);
        calc.setVisible(true);
        Container c=calc.getContentPane();
        c.setLayout(new BorderLayout());

        c.add(input,BorderLayout.NORTH);
        c.add(pButtons,BorderLayout.CENTER);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addActionListeners();

    }


    void addActionListeners() {
        ActionListener buttonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

                if (command.equals("Clear")) {
                    inputText = "";
                    num1 = 0;
                    num2 = 0;
                    operator = "";
                } else if (command.matches("[0-9 .]")) {
                    inputText += command;
                } else if (command.matches("[-+*/]")) {
                    num1 = Double.parseDouble(inputText);
                    operator = command;
                    inputText = "";
                } else if (command.equals("=")) {
                    num2 = Double.parseDouble(inputText);
                    switch (operator) {
                        case "+" -> inputText = String.valueOf(num1 + num2);
                        case "-" -> inputText = String.valueOf(num1 - num2);
                        case "*" -> inputText = String.valueOf(num1 * num2);
                        case "/" -> {
                            if (num2 != 0) {
                                inputText = String.valueOf(num1 / num2);
                            } else {
                                inputText = "Error";
                            }
                        }
                    }
                    num1 = 0;
                    num2 = 0;
                    operator = "";
                }
                input.setText(inputText);
            }
        };


        b1.addActionListener(buttonListener);
        b2.addActionListener(buttonListener);
        b3.addActionListener(buttonListener);
        b4.addActionListener(buttonListener);
        b5.addActionListener(buttonListener);
        b6.addActionListener(buttonListener);
        b7.addActionListener(buttonListener);
        b8.addActionListener(buttonListener);
        b9.addActionListener(buttonListener);
        bClear.addActionListener(buttonListener);
        bMinus.addActionListener(buttonListener);
        bPlus.addActionListener(buttonListener);
        bMul.addActionListener(buttonListener);
        bDivide.addActionListener(buttonListener);
        bPoint.addActionListener(buttonListener);
        bEqual.addActionListener(buttonListener);
    }

}

public class GUICalculator {


    public static void main(String[] args) {

       new GUI();
        

    }
}
