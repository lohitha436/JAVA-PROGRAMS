import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
public Registration() {
setTitle("Registration Form");
setSize(500, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);

// Create a main panel with a layout
JPanel mainPanel = new JPanel();
mainPanel.setLayout(new GridBagLayout());

// Form panel for input fields
JPanel formPanel = new JPanel();
formPanel.setLayout(new GridLayout(0, 2, 10, 10));

// Add input fields and labels to the form
formPanel.add(new JLabel("Name:"));
formPanel.add(new JTextField(20));

formPanel.add(new JLabel("Email:"));
formPanel.add(new JTextField(20));

formPanel.add(new JLabel("Password:"));
formPanel.add(new JPasswordField(20));

formPanel.add(new JLabel("Gender:"));
JPanel genderPanel = new JPanel();
JRadioButton male = new JRadioButton("Male");
JRadioButton female = new JRadioButton("Female");
ButtonGroup genderGroup = new ButtonGroup();
genderGroup.add(male);
genderGroup.add(female);
genderPanel.add(male);
genderPanel.add(female);
formPanel.add(genderPanel);

formPanel.add(new JLabel("Country:"));
JComboBox<String> countryBox = new JComboBox<>(new String[]{"USA", "Canada", "India", "UK", "Australia"});
formPanel.add(countryBox);

formPanel.add(new JLabel("Terms & Conditions:"));
JCheckBox termsCheckBox = new JCheckBox("I accept the terms and conditions");
formPanel.add(termsCheckBox);

// Submit button
JButton submitButton = new JButton("Submit");
submitButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(Registration.this, "Registration Successful!");
}
});
formPanel.add(submitButton);

// Add form panel to the main panel
GridBagConstraints gbc = new GridBagConstraints();
gbc.gridx = 0;
gbc.gridy = 0;
mainPanel.add(formPanel, gbc);

// Add main panel to the frame
add(mainPanel);
}
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
new Registration().setVisible(true);
});
}
}
