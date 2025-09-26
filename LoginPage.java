package manager;
import javax.swing.*;

import welcome.WelcomePage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    private Manager manager;
    private JFrame loginFrame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPage(Manager manager) {
        this.manager = manager;
        initialize();
    }

    private void initialize() {
        loginFrame = new JFrame("Skyline Airlines - Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(800, 600);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.getContentPane().setBackground(Color.orange);
        loginFrame.setLayout(null);

        JLabel titleLabel = new JLabel("Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setBounds(0, 30, 400, 30);
        loginFrame.getContentPane().add(titleLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 100, 80, 30);
        loginFrame.getContentPane().add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 100, 200, 30);
        loginFrame.getContentPane().add(usernameField);

        JLabel passwordLabel = new JLabel("ID:");
        passwordLabel.setBounds(50, 150, 80, 30);
        loginFrame.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 150, 200, 30);
        loginFrame.getContentPane().add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 200, 100, 30);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
        loginFrame.getContentPane().add(loginButton);
        JButton backButton = new JButton("Back");
        backButton.setBounds(50, 200, 100, 30);
       backButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        loginFrame.dispose(); 
       
        WelcomePage wp = new WelcomePage();
        wp.setVisible(true);
    }
});

        loginFrame.getContentPane().add(backButton);

        loginFrame.setVisible(true);
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("SAFIUL") && password.equals("Manager01")) {
            JOptionPane.showMessageDialog(loginFrame, "Login successful!");
            loginFrame.dispose();
            manager.showSecondPage();
        } else {
            JOptionPane.showMessageDialog(loginFrame, "Invalid username or id.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
