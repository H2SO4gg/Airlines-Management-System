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

public class InFlightServicesFrame extends JFrame {

    private ImageIcon icon;

    public InFlightServicesFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750, 300);
        this.setTitle("In-Flight Services");
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout()); 

        icon = new ImageIcon("airhostess\\images\\Icon.png");
        this.setIconImage(icon.getImage());

        
        JLabel lbl1 = new JLabel("In-Flight Services:");
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setBounds(50, 20, 200, 30); 

        String[] columnNames = {"Service Name", "Description", "Price"};
        Object[][] data = {
                {"Meal", "A full meal with a drink and dessert", "$15"},
                {"Movie", "Watch a movie on your personal screen", "$8"},
                {"Wi-Fi", "Stay connected with high-speed internet", "$10"},
                {"Power Outlet", "Charge your devices on the go", "$5"},
                {"Priority Check-in", "Check-in and board first", "$20"},
                {"Extra Legroom", "Enjoy more legroom for a comfortable flight", "$30"},
                {"Priority Baggage", "Get your baggage first", "$15"},
                {"Travel Insurance", "Protect yourself against unforeseen circumstances", "$25"},
                {"Airport Lounge Access", "Relax in style before your flight", "$40"}
                
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(200, 200)); 
        
        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 210, 60, 25); 
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


        
        this.add(lbl1, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);

        this.setVisible(true);
    }
}