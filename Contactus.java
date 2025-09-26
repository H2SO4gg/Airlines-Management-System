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

public class Contactus extends JFrame {
    private ImageIcon icon;

    public Contactus() {
        super("Contact Us");
        this.setSize(600, 400); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);
        icon = new ImageIcon("admin\\images\\Icon.png");
        this.setIconImage(icon.getImage());



        JTextArea contactInfo = new JTextArea();
        contactInfo.setText("Contact Us\n\n" +
                "Skyline Airlines\n\n" +
                "We are here to assist you! If you have any questions, concerns, or need further assistance, " +
                "please don't hesitate to reach out to us through any of the following channels:\n\n" +
                "Customer Support:\n" +
                "Email: support@skylineairlines.com\n" +
                "Phone: 1-800-123-4567\n" +
                "Hours: Monday - Friday, 9:00 AM - 6:00 PM\n\n" +
                "Office Address:\n" +
                "123 Aviation Way, Suite 100\n" +
                "New York, NY 10001\n\n" +
                "Social Media:\n" +
                "Follow us on Facebook, Twitter, and Instagram for the latest updates and promotions.\n" +
                "Facebook: facebook.com/skylineairlines\n" +
                "Twitter: twitter.com/skylineairlines\n" +
                "Instagram: instagram.com/skylineairlines\n\n" +
                "Corporate Office:\n" +
                "Phone: 1-800-234-5678\n" +
                "Email: corporate@skylineairlines.com\n\n" +
                "Partnership Inquiries:\n" +
                "Phone: 1-800-345-6789\n" +
                "Email: partners@skylineairlines.com\n\n" +
                "Thank you for choosing Skyline Airlines. We look forward to serving you!\n\n" +
                "© 2024 Skyline Airlines. All rights reserved.\n\n");
        contactInfo.setEditable(false);
        contactInfo.setLineWrap(true);
        contactInfo.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(contactInfo);
        panel.add(scrollPane, BorderLayout.CENTER);
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
          
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
            Contactus contactUsFrame = new Contactus();
            contactUsFrame.setVisible(true);
        };
    }
}
