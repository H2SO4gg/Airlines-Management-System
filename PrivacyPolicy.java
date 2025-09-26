package welcome;
import admin.*;
import airhostess.*;
import manager.*;
import passenger.*;
import welcome.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrivacyPolicy extends JFrame {
    private ImageIcon icon;

    public PrivacyPolicy() {
        super("Privacy Policy");
        this.setSize(800, 400); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);
        icon = new ImageIcon("admin\\images\\Icon.png");
        this.setIconImage(icon.getImage());


        JTextArea privacyPolicyInfo = new JTextArea();
        privacyPolicyInfo.setText("Privacy Policy\n\n" +
                "Your privacy is important to us. This Privacy Policy describes how Skyline Airlines " +
                "collects, uses, and protects your personal information"+"\n"+" when you use our Airline Reservation System.\n\n" +
                "Information We Collect:\n" +
                "- Personal details such as name, email, and phone number.\n" +
                "- Booking details including flight preferences and travel history.\n\n" +
                "How We Use Your Information:\n" +
                "- To process your flight bookings and manage your reservations.\n" +
                "- To provide customer support and assistance.\n" +
                "- To personalize your experience and offer relevant promotions.\n\n" +
                "We are committed to protecting your privacy and ensuring the security of your information.\n\n" +
                "© 2024 Skyline Airlines. All rights reserved.\n\n");
                panel.add(privacyPolicyInfo);
    
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                WelcomePage wcp = new WelcomePage();
                wcp.setVisible(true);
            }
        });
        panel.add(backButton, BorderLayout.SOUTH);

        this.add(panel);
    }

    public static void main(String[] args) {
         {
            PrivacyPolicy privacyPolicyFrame = new PrivacyPolicy();
            privacyPolicyFrame.setVisible(true);
        };
    }
}

