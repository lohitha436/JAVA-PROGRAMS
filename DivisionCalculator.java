import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DivisionCalculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;
    public DivisionCalculator() {
        setTitle("Integer Division");
        setSize(300, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(new JLabel("Num1:"));
        add(num1Field);
        add(new JLabel("Num2:"));
        add(num2Field);
        add(divideButton);
        add(new JLabel("Result:"));
        add(resultField);

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        try {

            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 / num2;
            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Division by zero is not allowed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            DivisionCalculator frame = new DivisionCalculator();

            frame.setVisible(true);

        });

    }

}
