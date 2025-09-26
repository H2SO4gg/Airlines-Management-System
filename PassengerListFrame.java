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

public class PassengerListFrame extends JFrame {


    JLabel lbl1;
    JTable table;
    JScrollPane scrollPane;
    JButton backButton;
     ImageIcon icon;

     public PassengerListFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350, 350);
        this.setTitle("Passenger List");
        this.setLocationRelativeTo(null);
        this.setLayout(null); 

        icon = new ImageIcon("airhostess\\images\\Icon.png");
        this.setIconImage(icon.getImage());

        
        lbl1 = new JLabel("Passenger List:");
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setBounds(50, 20, 200, 30); 

        String[] columnNames = {"Name", "Seat"};
        Object[][] data = {{"John Doe", "1A"}, {"Jane Doe", "2B"}, {"Mike Johnson", "3C"}, {"Emily Smith", "4D"},{"Jasim","5D"},{"Smaely","6B"},{"Marco","2A"},{"Driss","2C"},{"Dion","3C"},{"Sophia","5C"},{"Anders","7A"}};
        table = new JTable(data, columnNames);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 70, 200, 200); 

        backButton = new JButton("Back");
        
        backButton.setBounds(10, 275, 60, 25); 
        backButton.setForeground(Color.black);
        backButton.setFont(new Font("Segoe UI", Font.BOLD, 10));
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(new ActionListener() {
            
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