package admin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AdminData extends JFrame {
    private JTextField nameField, nationalityField, phoneField, emailField, passportField;
    private JButton saveButton;

    public AdminData() {
        // Set up the frame
        this.setTitle("Admin Data");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(6, 2));

        // Create labels and text fields
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Nationality:"));
        nationalityField = new JTextField();
        add(nationalityField);

        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Passport Number:"));
        passportField = new JTextField();
        add(passportField);

        // Create save button
        saveButton = new JButton("Save");
        add(saveButton);

        // Add action listener to save button
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                saveData();
            }
        });
    }

    private void saveData() {
        String name = nameField.getText().trim();
        String nationality = nationalityField.getText().trim();
        String phone = phoneField.getText().trim();
        String email = emailField.getText().trim();
        String passport = passportField.getText().trim();

        if (name.isEmpty() || nationality.isEmpty() || phone.isEmpty() || email.isEmpty() || passport.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.");
            return;
        }

        try {
            // Save the data to a text file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("admin/Data/admin_data.txt", true))) {
                writer.write("Name: " + name);
                writer.newLine();
                writer.write("Nationality: " + nationality);
                writer.newLine();
                writer.write(" Phone: " + phone);
                writer.newLine();
                writer.write("Email: " + email);
                writer.newLine();
                writer.write("Passport Number: " + passport);
                writer.newLine();
                writer.write("---------------------------");
                writer.newLine();
                JOptionPane.showMessageDialog(this, "Data saved successfully!");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving data: " + ex.getMessage());
            ex.printStackTrace(); // Print the stack trace for debugging
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    public static void main(String[] args) {
        // Create and display the AdminData frame
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AdminData frame = new AdminData();
                frame.setVisible(true);
            }
        });
    }
}