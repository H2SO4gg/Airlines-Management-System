package airhostess;
import admin.*;
import airhostess.*;
import manager.*;
import passenger.*;
import welcome.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirHostessInterface extends JFrame{

    private Container c;
    private JButton btn1, btn2, btn4, btn5, btn6;
    private JLabel lbl1, lbl2,imgLabel;
    private Font f1, f2;
    private ImageIcon icon,logo;
    

    public AirHostessInterface(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Air Hostess Interface");
        this.setLocationRelativeTo(null);
        this.setLayout(null); 

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));


        icon = new ImageIcon("airhostess/images/air login.jpg");
        this.setIconImage(icon.getImage());

       
        logo = new ImageIcon("airhostess/images/Icon.png");
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(400, -30, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        
        lbl1 = new JLabel("Welcome, Air Hostess!");
        lbl1.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
        lbl1.setBounds(5, 20, 500, 40);
        c.add(lbl1);

        lbl2 = new JLabel("Choose an option:");
        lbl2.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
        lbl2.setBounds(5, 100, 200, 50);
        c.add(lbl2);

        btn1 = new JButton("Passenger List");
        btn1.setBounds(80, 160, 150, 50);
        c.add(btn1);


        btn2 = new JButton("Flight Information");
        btn2.setBounds(80, 230, 150, 50); 
        c.add(btn2);


        btn4 = new JButton("In-flight Services");
        btn4.setBounds(80, 300, 150, 50); 
        c.add(btn4);


        btn5 = new JButton("Edit your data");
        btn5.setBounds(80, 370, 150, 50); 
        c.add(btn5);

        btn6 = new JButton("Log Out");
        btn6.setBounds(80, 440, 150,50); 
        c.add(btn6);
        

    
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                PassengerListFrame passengerListFrame = new PassengerListFrame();
                passengerListFrame.setVisible(true);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                FlightInformationFrame flightinfo = new FlightInformationFrame ();
                flightinfo.setVisible(true);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                InFlightServicesFrame flightservice = new InFlightServicesFrame();
                flightservice.setVisible(true);
            }
        });

        btn5.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                EditDataFrame edit = new EditDataFrame();
                edit.setVisible(true);
            }
        });

          
          btn6.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {

              setVisible(false);    
             AirHostessLogin loginPage = new AirHostessLogin(); 
            loginPage.setVisible(true); 

            
        }});

       

        this.setVisible(true);
    }

    

    

    public static void main(String[] args){
        new AirHostessInterface();
    }
}