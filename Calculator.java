import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    String msg = " ";
    int p, q, result;
    JTextField t1;
    JButton[] b = new JButton[10];
    JButton add, sub, mul, div, clear, mod, EQ;
    char OP;

    public Calculator()  {
        t1 = new JTextField(10);
        t1.setEditable(false);
        setLayout(new GridLayout(4, 5));

        // Initialize number buttons (0-9)
        for (int i = 0; i < 10; i++) {
            b[i] = new JButton("" + i);
            b[i].addActionListener(this);
            add(b[i]);
        }

        // Initialize operation buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");
        clear = new JButton("Clear");
        EQ = new JButton("=");

        // Add buttons to the frame
        add(t1);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(EQ);

        // Set action listeners for operation buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        clear.addActionListener(this);
        EQ.addActionListener(this);

        // Frame settings
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        char ch = str.charAt(0);

        // Number input
        if (Character.isDigit(ch)) {
            t1.setText(t1.getText() + str);
        } else if (str.equals("+")) {
            p = Integer.parseInt(t1.getText());
            OP = '+';
            t1.setText("");
        } else if (str.equals("-")) {
            p = Integer.parseInt(t1.getText());
            OP = '-';
            t1.setText("");
        } else if (str.equals("*")) {
            p = Integer.parseInt(t1.getText());
            OP = '*';
            t1.setText("");
        } else if (str.equals("/")) {
            p = Integer.parseInt(t1.getText());
            OP = '/';
            t1.setText("");
        } else if (str.equals("%")) {
            p = Integer.parseInt(t1.getText());
            OP = '%';
            t1.setText("");
        } else if (str.equals("=")) {
            q = Integer.parseInt(t1.getText());
            switch (OP) {
                case '+':
                    result = p + q;
                    break;
                case '-':
                    result = p - q;
                    break;
                case '*':
                    result = p * q;
                    break;
                case '/':
                    try {
                        result = p / q;
                    } catch (ArithmeticException e) {
                        t1.setText("Error");
                        System.out.println("Division by zero not possible");
                        return;
                    }
                    break;
                case '%':
                    result = p % q;
                    break;
            }
            t1.setText("" + result);
        } else if (str.equals("Clear")) {
            t1.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
