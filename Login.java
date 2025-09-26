package passenger;
import javax.swing.*;
import welcome.WelcomePage;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class Login extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JButton login;
    private JButton reset;
    private JButton reg;
    private JTextArea res;
    private JButton back; 

    public Login() {

        ImageIcon image = new ImageIcon("passenger\\icon1.png");
        setIconImage(image.getImage());

        getContentPane().setBackground(new Color(255, 229, 204));

        setTitle("Passenger Login");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        ImageIcon image2 = new ImageIcon("passenger\\pic01.png");
        JLabel imageLabel = new JLabel(image2);
        imageLabel.setSize(450, 600);
        imageLabel.setLocation(435, 0);
        c.add(imageLabel);

        title = new JLabel("Feel Free To Book Ticket");
        title.setFont(new Font("Broadway", Font.BOLD, 28));
        title.setSize(900, 40);
        title.setLocation(30, 80);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 160);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 160);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 210);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(200, 210);
        c.add(tmno);

        login = new JButton("Search!");
        login.setFont(new Font("Arial", Font.BOLD, 15));
        login.setSize(100, 20);
        login.setLocation(150, 260);
        login.addActionListener(this);
        login.setBackground(Color.GREEN);
        c.add(login);

        reset = new JButton("Cancel");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(280, 260);
        reset.addActionListener(this);
        reset.setBackground(Color.RED);
        c.add(reset);

        reg = new JButton("BOOK TICKET");
        reg.setFont(new Font("Cooper Black", Font.BOLD, 25));
        reg.setSize(250, 30);
        reg.setLocation(150, 330);
        reg.addActionListener(this);
        reg.setBackground(Color.PINK);
        c.add(reg);

        back = new JButton("Back"); 
        back.setFont(new Font("Arial", Font.PLAIN, 15));
        back.setSize(100, 20);
        back.setLocation(150, 440);
        back.addActionListener(this);
        back.setBackground(Color.YELLOW);
        c.add(back); 

        res = new JTextArea();
        res.setFont(new Font("Arial", Font.BOLD, 15));
        res.setSize(250, 30);
        res.setLocation(150, 410);
        res.setLineWrap(true);
        res.setEditable(false);
        res.setBackground(new Color(255, 229, 204));
        c.add(res);

        res = new JTextArea();
        res.setFont(new Font("Arial", Font.ITALIC, 14));
        res.setSize(250, 30);
        res.setLocation(150, 410);
        res.setLineWrap(true);
        res.setEditable(false);
        c.add(res);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
    
            String username = tname.getText();
            String password = tmno.getText();
            boolean validCredentials = false;
    
            try {
                File file = new File("passenger\\registration.txt");
                Scanner scanner = new Scanner(file);
    
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.startsWith("Name: ")) {
                        String fileUsername = line.substring(6).trim(); 
                        String filePassword = null;
                        
                  
                        while (scanner.hasNextLine()) {
                            line = scanner.nextLine();
                            if (line.startsWith("Mobile: ")) {
                                filePassword = line.substring(8).trim(); 
                                break;
                            }
                        }
    
                        
                        if (fileUsername.equals(username) && filePassword != null && filePassword.equals(password)) {
                            validCredentials = true;
                            break;
                        }
                    }
                }
                scanner.close();
    
            } catch (FileNotFoundException ex) {
                System.out.println("File not found: " + ex.getMessage());
            }
    
            if (validCredentials) {
                res.setText("Yes, YOU BOOK A Flight Air ticket!");
            } else {
                res.setText("Invalid username or password!");
            }
        } else if (e.getSource() == reset) {
            tname.setText("");
            tmno.setText("");
            res.setText("");
    
        } else if (e.getSource() == reg) {
            new Registration();
            this.setVisible(false);
        } else if (e.getSource() == back) { 
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true); 
            this.setVisible(false);
        }
    }
    

    public static void main(String[] args) {
        new Login();
    }
}
