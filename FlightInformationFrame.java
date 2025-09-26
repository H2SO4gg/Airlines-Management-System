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

public class FlightInformationFrame extends JFrame {

    private ImageIcon icon;

    public FlightInformationFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Flight Information");
        this.setLocationRelativeTo(null);
        this.setLayout(null); 

        icon = new ImageIcon("airhostess\\images\\Icon.png");
        this.setIconImage(icon.getImage());

       
        JLabel lbl1 = new JLabel("Flight Information:");
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setBounds(50, 20, 200, 30); 

        String[] columnNames = {"Destination", "Flight Number", "Flight Time", "Departure", "Arrival"};
        Object[][] data = {
                {"New York", "AA123", "2h", "12:00 PM", "2:00 PM"},
                {"Los Angeles", "BB456" ,"3h", "3:00 PM", "6:00 PM"},
                {"London","BA577","7h 45m","8:00 PM","9:45 AM"},
                {"Sydney","QF34","14h 40m","6:00 PM","7:30 AM"},
                {"Dubai","A7756","16h 50m","3:20PM","7:30PM"},
                {"Tokyo","JL123","11h 30m","10:00 AM","9:30 PM"},
                {"Paris","AF456","8h 30m","12:00 PM","8:30 PM"},
                {"Rome","AZ789","9h 30m","1:00 PM","10:30 PM"},
                {"Beijing","CA123","10h 30m","2:00 PM","12:30 AM"},
                {"Shanghai","MU456","11h 30m","3:00 PM","2:30 AM"},
                {"Hong Kong","CX789","9h 30m","4:00 PM","1:30 AM"},
                {"Singapore","SQ123","7h 30m","5:00 PM","12:30 AM"},
                {"Kuala Lumpur","MH456","6h 30m","6:00 PM","12:30 AM"},
                {"Bangkok","TG789","5h 30m","7:00 PM","12:30 AM"},
                {"Seoul","KE123","6h 30m","8:00 PM","2:30 AM"},
                {"Mumbai","AI456","7h 30m","9:00 PM","4:30 AM"},
                {"Delhi","AI789","6h 30m","10:00 PM","4:30 AM"},
            
            
       };   

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 70, 400, 300); 

        JButton backButton = new JButton("Back");
        
        backButton.setBounds(25, 390, 60, 25); 
        backButton.setForeground(Color.black);
        backButton.setFont(new Font("Segoe UI", Font.BOLD, 10));
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                AirHostessInterface airHostessInterface = new AirHostessInterface(); 
                airHostessInterface.setVisible(true); 
            }
        });
        
        
        this.getContentPane().add(backButton);
        this.getContentPane().add(lbl1);
        this.getContentPane().add(scrollPane);
        this.setVisible(true);
    }
}