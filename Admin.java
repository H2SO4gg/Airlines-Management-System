package admin;

import airhostess.*;
import manager.*;
import passenger.*;
import welcome.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private JButton btn1, btn2, btn3, btn4, btn5; // Added btn5 for Admin Data
    private Cursor cursor;

    public Admin() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin Panel");
        this.setSize(860, 420);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        icon = new ImageIcon("admin\\images\\Icon.png");
        this.setIconImage(icon.getImage());

        logo = new ImageIcon("admin\\images\\Admin.png");
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-98, -33, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        f1 = new Font("Tahoma", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 20);

        label1 = new JLabel();
        label1.setText("Admin Panel");
        label1.setBounds(310, 45, 433, 50);
        label1.setFont(f1);
        c.add(label1);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Manage Data");
        btn1.setBounds(300, 210, 207, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

        btn2 = new JButton("Logout");
        btn2.setBounds(540, 305, 270, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#32cd32"));
        c.add(btn2);

        btn3 = new JButton("Exit");
        btn3.setBounds(300, 305, 207, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
        c.add(btn3);

        btn4 = new JButton("Change Password");
        btn4.setBounds(540, 210, 270, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        c.add(btn4);
        
        // New button for Admin Data
        btn5 = new JButton("Admin Data");
        btn5.setBounds(300, 150, 207, 50);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#2E75B6"));
        c.add(btn5);

        // Action listeners for buttons
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                ManageData frame = new ManageData();
                frame.setVisible(true);
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminPassword frame = new AdminPassword();
                frame.setVisible(true);
            }
        });

        // Action listener for Admin Data button
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AdminData frame = new AdminData();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Admin frame = new Admin();
                frame.setVisible(true);
            }
        });
    }
}