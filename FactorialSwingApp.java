import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialSwingApp extends JFrame implements ActionListener {
    // Declare components
    JTextField t1, t2;
    JLabel l1, l2, l3;
    JButton b1;
    int fact = 1, n, i;

    // Constructor to set up the GUI
    public FactorialSwingApp() {
        // Set the title of the window
        setTitle("Factorial Calculator");

        // Set layout manager
        setLayout(new FlowLayout());

        // Initialize components
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEditable(false); // Result field is non-editable

        l1 = new JLabel("Factorial of a number");
        l2 = new JLabel("Enter number:");
        l3 = new JLabel("Result:");

        b1 = new JButton("Compute");

        // Add components to the frame
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);

        // Register the button action listener
        b1.addActionListener(this);

        // Set up the JFrame
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
    }

    // Action performed when the button is clicked
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            // Get the input number from text field
            String str = t1.getText();
            n = Integer.parseInt(str);

            // Compute the factorial
            fact = 1;
            for (i = n; i > 1; i--) {
                fact = fact * i;
            }

            // Display the result in the second text field
            String msg = "" + fact;
            t2.setText(msg);
        } catch (NumberFormatException e) {
            // Handle invalid input
            t2.setText("Invalid input");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create and display the Swing application directly without invokeLater
        FactorialSwingApp app = new FactorialSwingApp();
        app.setVisible(true);
    }
}
