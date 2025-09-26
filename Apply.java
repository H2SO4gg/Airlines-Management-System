package airhostess;
import admin.*;
import airhostess.*;
import manager.*;
import passenger.*;
import welcome.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class Apply extends JFrame{


    Container c;
    JPanel panel;
    JLabel userLabel,label1,label2, passLabel, imgLabel,u1,u2,u3,dob,add;
    JTextField userField, p2,tf1,tf2,tf3,tf4,tf5;
    JTextArea tadd;
    JCheckBox term;
	JComboBox date,month,year;
    JButton regButton, backButton,b1,b2;
	JRadioButton Box1, Box2 ;
    ImageIcon img,logo;
     ButtonGroup bg;
    Color myColor2;
	JPasswordField pal;
    private ImageIcon icon;

     String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
     String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
     String years[]
        = { "1991","1992","1993","1994","1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
    
	

  public Apply() 
  {
    super("AirHostess Information");
    this.setSize(900, 550);
	setLocationRelativeTo(null);
	 this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 c=this.getContentPane();


    panel = new JPanel(null);
    panel.setBackground(Color.decode("#C3E0EA"));
	c.add(panel);
	
	
	    label1 = new JLabel("Air Hostess Infomation");
        label1.setBounds(280, 0, 300, 60);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		   panel.add(label1);
		
        logo = new ImageIcon("airhostess\\images\\flightattendant.png");
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        icon = new ImageIcon("airhostess\\images\\Icon.png");
        this.setIconImage(icon.getImage());
	
    userLabel = new JLabel("Full Name:");
	userLabel.setFont(new Font("Segoe UI Black",Font.BOLD,16));
    userLabel.setBounds(570, 50, 200, 20);
    userLabel.setForeground(Color.BLACK);
    panel.add(userLabel);

    tf1 = new JTextField();
	tf1.setFont(new Font("Serif",Font.PLAIN,18));
	tf1.setForeground(Color.BLACK);
    tf1.setBounds(570, 77, 220, 30);
    panel.add(tf1);
	
	u1 = new JLabel("Mobile number: ");
	u1.setFont(new Font("Segoe UI Black",Font.BOLD,16));
    u1.setBounds(570, 110, 200, 20);
    u1.setForeground(Color.BLACK);
    panel.add(u1);
	
	tf2= new JTextField();
	tf2.setFont(new Font("Serif",Font.PLAIN,18));
    tf2.setBounds(570, 140, 220, 30);
    panel.add(tf2);
	
	u2 = new JLabel("Passport Num: ");
	u2.setFont(new Font("Segoe UI Black",Font.BOLD,16));
    u2.setBounds(570, 170, 200, 20);
	u2.setForeground(Color.BLACK);
    panel.add(u2);
	
	
	
	tf3 = new JTextField();
	tf3.setFont(new Font("Serif",Font.PLAIN,18));
    tf3.setBounds(570, 200, 220, 30);
    panel.add(tf3);
	

    dob = new JLabel("DOB");
    dob.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
    dob.setSize(100, 20);
    dob.setLocation(570, 250);
    c.add(dob);

    date = new JComboBox(dates);
    date.setFont(new Font("Serif", Font.PLAIN, 15));
    date.setSize(50, 20);
    date.setLocation(631, 250);
    c.add(date);

    month = new JComboBox(months);
    month.setFont(new Font("Serif", Font.PLAIN, 15));
    month.setSize(60, 20);
    month.setLocation(680, 250);
    c.add(month);

    year = new JComboBox(years);
    year.setFont(new Font("Serif", Font.PLAIN, 15));
    year.setSize(60, 20);
    year.setLocation(737, 250);
    c.add(year);

	
        u3 = new JLabel("User Name:");
        u3.setBounds(570, 290, 200, 20);
        u3.setForeground(Color.black);
        u3.setFont(new Font("Segoe UI Black",Font.BOLD,16 ));
        panel.add(u3);
		
		
        tf4 = new JTextField();
        tf4.setBounds(570, 320, 220, 30);
        tf4.setForeground(Color.black);
        tf4.setFont(new Font("Serif", Font.PLAIN, 19));
        tf4.setCaretColor(Color.white);
        panel.add(tf4);



    passLabel = new JLabel("Password:");
	passLabel.setFont(new Font("Segoe UI Black",Font.BOLD,16));
    passLabel.setBounds(570, 350, 200, 20);
    passLabel.setForeground(Color.	BLACK);
    panel.add(passLabel);

    pal = new JPasswordField();
	pal.setFont(new Font("Serif",Font.PLAIN,18));
    pal.setBounds(570, 380, 220, 30);
    pal.setEchoChar('*');
    panel.add(pal);
	
	
    term = new JCheckBox("Accept Terms And Conditions.");
    term.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
    term.setSize(250, 20);
    term.setLocation(552, 430);
    c.add(term);

    regButton = new JButton("Submit");
    regButton.setBounds(610, 470, 150, 35); 
    panel.add(regButton);





        backButton = new JButton();
        backButton.setIcon(new ImageIcon("airhostess\\images\\backbutton.png"));
        backButton.setBounds(10, 5, 40, 40);
        backButton.setForeground(Color.white);
        backButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.add(backButton);
     

   

    this.add(panel);
	 

        b1 = new JButton();
        b1.setBounds(653, 350, 25, 20);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setFocusPainted(false);
        b1.setContentAreaFilled(false);
        panel.add(b1);
		
		

        b2 = new JButton();
        b2.setBounds(653, 350, 25, 20);
        b2.setForeground(Color.black);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b2.setFocusPainted(false);
		b2.setContentAreaFilled(false);
        panel.add(b2);



            backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                AirHostessLogin r = new AirHostessLogin();
                r.setVisible(true);
            }
		
			});
		
		
			 b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    if (pal.getEchoChar() != '\u0000') {
                        pal.setEchoChar('\u0000');
                        b1.setVisible(false);
                        b2.setVisible(true);
                    }
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b2) {
                    pal.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    pal.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    b2.setVisible(false);
                    b1.setVisible(true);
                } else {
                }
            }
        });
		
        regButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String username = tf4.getText().toLowerCase();
                String email = tf3.getText(); 
                String password = pal.getText(); 
                String fullName = tf1.getText();
                String mobileNumber = tf2.getText();
                String selectedDate = (String)date.getSelectedItem();
                String selectedMonth = (String)month.getSelectedItem();
                String selectedYear = (String)year.getSelectedItem();
                String dob = selectedDate + "/" + selectedMonth + "/" + selectedYear;
                        
                if (fullName.isEmpty() || mobileNumber.isEmpty() || email.isEmpty() || password.isEmpty() || username.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        File file = new File("airhostess\\Data\\userdata.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);
        
                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
        
                        String timeAndDate = myDateObj.format(myFormatObj);
        
                        pw.println("Full Name: " + fullName);
                        pw.println("Mobile Number: " + mobileNumber);
                        pw.println("Date of Birth: " + dob);
                        pw.println("User Name : " + username);
                        pw.println("Password : " + password);
                        pw.println("Email : " + email);
                        pw.println("Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();
        
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
        
                    JOptionPane.showMessageDialog(null, "Application Submitted.", "Application complete", JOptionPane.INFORMATION_MESSAGE);
                  
                    setVisible(false);
                    AirHostessLogin r = new AirHostessLogin();
                    r.setVisible(true);
                }
            }
        });
    }        
public static void main(String [] args)
	{
		Apply r = new Apply();
		  r.setVisible(true);
	}

}

