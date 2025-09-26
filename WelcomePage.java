package welcome;
import admin.*;
import airhostess.*;
import manager.*;
import passenger.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WelcomePage extends JFrame {
    ImageIcon img;
    JLabel airlines, skyline, letsfly, imgLabel,bottomText;
    JButton Aboutbtn, passbtn, adminbtn, airhostbtn, managerbtn,privacybtn,contactbtn;
    JPanel panel;
    Color myColor;
    Font myFont;
    private ImageIcon logo;
    private ImageIcon icon;

    public WelcomePage() {
        super("Airline Reservation System");
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        myColor = new Color(0,163,203);
        myFont = new Font("Horizon", Font.BOLD, 40);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(myColor);
        Font times = new Font("Times New Roman", Font.BOLD, 20);
        Font opensans = new Font("Open Sans", Font.ITALIC, 20);

        icon = new ImageIcon("admin/images/Icon.png");
        this.setIconImage(icon.getImage());


        skyline = new JLabel("SKYLINE");
        skyline.setBounds(500, 10, 200, 50);
        skyline.setFont(myFont);
        skyline.setForeground(Color.WHITE);
        skyline.setBackground(myColor);
        panel.add(skyline);

        airlines = new JLabel("AIRLINES");
        airlines.setBounds(520, 60, 200, 50);
        airlines.setFont(myFont);
        airlines.setForeground(Color.WHITE);
        airlines.setBackground(myColor);
        panel.add(airlines);

        letsfly = new JLabel("Let's Fly Higher");
        letsfly.setBounds(500, 110, 200, 50);
        letsfly.setFont(opensans);
        letsfly.setForeground(Color.WHITE);
        letsfly.setBackground(myColor);
        panel.add(letsfly);

        JSeparator separator = new JSeparator();
        separator.setBounds(500, 115, 200, 10);
        separator.setOrientation(SwingConstants.HORIZONTAL);
        separator.setForeground(Color.WHITE);
        panel.add(separator);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(0, 200, 1200, 10);
        separator2.setOrientation(SwingConstants.HORIZONTAL);
        separator2.setForeground(Color.WHITE);
        panel.add(separator2);

        img = new ImageIcon("welcome/Air.png");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 270, img.getIconWidth(), img.getIconHeight());
        panel.add(imgLabel);

        
        Aboutbtn = new JButton("About");
        Aboutbtn.setBounds(200, 210, 150, 50);
        Aboutbtn.setFont(times);
        Aboutbtn.setBackground(myColor);
        Aboutbtn.setForeground(Color.WHITE);
        Aboutbtn.setBorder(null);
        panel.add(Aboutbtn);
        Aboutbtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                AboutFrame aboutFrame = new AboutFrame();
                aboutFrame.setVisible(true);
            }
        });

        JLabel separatorLabel1 = new JLabel("|");
        separatorLabel1.setBounds(350, 210, 10, 50);
        separatorLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        separatorLabel1.setForeground(Color.WHITE);
        panel.add(separatorLabel1);

        passbtn = new JButton("Passenger");
        passbtn.setBounds(360, 210, 150, 50);
        passbtn.setFont(times);
        passbtn.setBackground(myColor);
        passbtn.setForeground(Color.WHITE);
        passbtn.setBorder(null);
        panel.add(passbtn);
        passbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                Login lg = new Login();
                lg.setVisible(true); 
               
            }
        });
        
        JLabel separatorLabel2 = new JLabel("|");
        separatorLabel2.setBounds(510, 210, 10, 50);
        separatorLabel2.setFont(new Font("Arial", Font.BOLD, 20));
        separatorLabel2.setForeground(Color.WHITE);
        panel.add(separatorLabel2);

        adminbtn = new JButton("Admin");
        adminbtn.setBounds(520, 210, 150, 50);
        adminbtn.setFont(times);
        adminbtn.setBackground(myColor);
        adminbtn.setForeground(Color.WHITE);
        adminbtn.setBorder(null);
        panel.add(adminbtn);
        adminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLogin frame = new AdminLogin();
                frame.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(frame, "By default, name and password is admin.", "Information", JOptionPane.INFORMATION_MESSAGE);
               
            }
        });
        JLabel separatorLabel3 = new JLabel("|");
        separatorLabel3.setBounds(670, 210, 10, 50);
        separatorLabel3.setFont(new Font("Arial", Font.BOLD, 20));
        separatorLabel3.setForeground(Color.WHITE);
        panel.add(separatorLabel3);

        airhostbtn = new JButton("Air Hostess");
        airhostbtn.setBounds(680, 210, 150, 50);
        airhostbtn.setFont(times);
        airhostbtn.setBackground(myColor);
        airhostbtn.setForeground(Color.WHITE);
        airhostbtn.setBorder(null);
        panel.add(airhostbtn);
        airhostbtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                AirHostessLogin frame = new AirHostessLogin();
                frame.setVisible(true);
                dispose();     
            }
        });

        JLabel separatorLabel4 = new JLabel("|");
        separatorLabel4.setBounds(830, 210, 10, 50);
        separatorLabel4.setFont(new Font("Arial", Font.BOLD, 20));
        separatorLabel4.setForeground(Color.WHITE);
        panel.add(separatorLabel4);

        managerbtn = new JButton("Manager");
        managerbtn.setBounds(840, 210, 150, 50);
        managerbtn.setFont(times);
        managerbtn.setBackground(myColor);
        managerbtn.setForeground(Color.WHITE);
        managerbtn.setBorder(null);
        panel.add(managerbtn);
        managerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Manager manager = new Manager();
               
                dispose();
                
            }
        });
        privacybtn = new JButton("Privacy Policy");
        privacybtn.setBounds(10, 800, 150, 50);
        privacybtn.setFont(new Font("Times New Roman", Font.BOLD, 13)); 
        privacybtn.setBackground(myColor);
        privacybtn.setForeground(Color.WHITE);
        privacybtn.setBorder(null);  
        panel.add(privacybtn);
        privacybtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                PrivacyPolicy aboutFrame = new PrivacyPolicy();
                aboutFrame.setVisible(true);
            }
        });

        JLabel separatorLabel5 = new JLabel("|");
        separatorLabel5.setBounds(170, 800, 10, 50);   
        separatorLabel5.setFont(new Font("Arial", Font.BOLD, 20));
        separatorLabel5.setForeground(Color.WHITE);
        panel.add(separatorLabel5);

        contactbtn = new JButton("Contact Us");
        contactbtn.setBounds(180, 800, 150, 50);
        contactbtn.setFont(new Font("Times New Roman", Font.BOLD, 13)); 
        contactbtn.setBackground(myColor);
        contactbtn.setForeground(Color.WHITE);
        contactbtn.setBorder(null);
        panel.add(contactbtn);
        contactbtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Contactus aboutFrame = new Contactus();
                aboutFrame.setVisible(true);
            }
        });

        JLabel separatorLabel6 = new JLabel("|");
        separatorLabel6.setBounds(330, 800, 10, 50);
        separatorLabel6.setFont(new Font("Arial", Font.BOLD, 20));
        separatorLabel6.setForeground(Color.WHITE);
        panel.add(separatorLabel6);

        bottomText = new JLabel("© 2024 Skyline Airlines. All rights reserved.");
        bottomText.setBounds(850, 800, 350, 50);
        bottomText.setFont(new Font("Arial", Font.PLAIN, 12));
        bottomText.setForeground(Color.WHITE);
        panel.add(bottomText);
        this.add(panel);
    }

    public static void main(String[] args) {
        WelcomePage wp = new WelcomePage();
        wp.setVisible(true);
    }
}
