package airhostess;

import javax.swing.*;

import welcome.WelcomePage;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class AirHostessLogin extends JFrame {

    private Container c;
    private ImageIcon icon, logo, img;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, nBtn, btn4;
    private JPasswordField pf2;
    private Cursor cursor;

    public AirHostessLogin() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Air Hostess");
        this.setSize(1000, 576);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        icon = new ImageIcon("");
        this.setIconImage(icon.getImage());

        logo = new ImageIcon("");
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        f1 = new Font("Segoe UI Black", Font.BOLD, 53);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 30);
        f5 = new Font("Segoe UI", Font.PLAIN, 22);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        label1 = new JLabel("Air Hostess Login");
        label1.setBounds(475, 10, 1000, 80);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel("Name");
        label1.setBounds(500, 145, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(670, 155, 210, 35);
        tf1.setFont(f5);
        c.add(tf1);

        label1 = new JLabel("ID");
        label1.setBounds(500, 205, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        pf2 = new JPasswordField();
        pf2.setBounds(670, 215, 210, 35);
        pf2.setFont(f2);
        pf2.setEchoChar('*');
        c.add(pf2);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Exit");
        btn1.setBounds(480, 410, 215, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(480, 325, 215, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Login");
        btn3.setBounds(730, 325, 215, 50);
        btn3.setFont(f2);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        btn4 = new JButton("Airhostess Info");
        btn4.setBounds(730, 410, 215, 50);
        btn4.setFont(f2);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2eb66f"));
        c.add(btn4);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                WelcomePage wp = new WelcomePage();
                wp.setVisible(true);
                dispose();
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String textField1 = tf1.getText().toLowerCase();
                String textField2 = new String(pf2.getPassword()); 

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        String userNameS = "Name : " + textField1;
                        String passwordS = "ID : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader("airhostess/Data/airhostess_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        boolean loginSuccessful = false;
                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("airhostess/Data/airhostess_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get("airhostess/Data/airhostess_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Air Hostess Login Successful.", "Airlines Reservation System",
                                            JOptionPane.INFORMATION_MESSAGE);

                                    setVisible(false);
                                    AirHostessInterface frame = new AirHostessInterface();
                                    frame.setVisible(true);
                                    loginSuccessful = true;
                                    break;
                                }
                            }
                        }

                        if (!loginSuccessful) {
                            JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace(); 
                        JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error!",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Apply applyFrame = new Apply();
                applyFrame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new AirHostessLogin().setVisible(true);
    }
}
