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

public class EditDataFrame extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, nBtn;
    private JPasswordField tf2;
    private Cursor cursor;

    public EditDataFrame() {
       
        this.setTitle("Change name & password");
        this.setSize(520, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        
        icon = new ImageIcon("airhostess\\images\\Icon.png");
        this.setIconImage(icon.getImage());

        
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 30);
        f4 = new Font("Segoe UI", Font.PLAIN, 30);
        f5 = new Font("Segoe UI", Font.PLAIN, 22);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

       
        label1 = new JLabel();
        label1.setText("Update Name & Password");
        label1.setBounds(60, 5, 500, 90);
        label1.setFont(f3);
        c.add(label1);


        label1 = new JLabel();
        label1.setText("Name");
        label1.setBounds(50, 100, 500, 50);
        label1.setFont(f4);
        c.add(label1);


        tf1 = new JTextField();
        tf1.setBounds(210, 108, 250, 35);
        tf1.setFont(f5);
        c.add(tf1);

  
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(50, 180, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JPasswordField();
        tf2.setBounds(210, 188, 250, 35);
        tf2.setFont(f2);
        tf2.setEchoChar('*');
        c.add(tf2);

        
        cursor = new Cursor(Cursor.HAND_CURSOR);

       
        btn1 = new JButton("Back");
        btn1.setBounds(31, 280, 208, 43);
        btn1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btn1.setCursor(cursor);
        btn1.setForeground(Color.black);
        c.add(btn1);

        btn2 = new JButton("Update");
        btn2.setBounds(265, 280, 208, 43);
        btn2.setFont(new Font("Segoe UI", Font.BOLD, 25));
        btn2.setCursor(cursor);
        btn2.setForeground(Color.black);
        c.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false); 
                AirHostessInterface airHostessInterface = new AirHostessInterface(); 
                airHostessInterface.setVisible(true); 
            }
        });
        
        
        this.getContentPane().add(btn1);

       
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase();
                String textField2 = tf2.getText(); 

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    String airhost = "airhostess\\Data\\airhostess_data.txt";
                    File oldFile = new File(airhost);
                    oldFile.delete();
                    File dump = new File(airhost);

                    try {

                        FileWriter fw = new FileWriter(airhost, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        
                        pw.println("=== ###  Air Hostess Data  ### ===");
                        pw.println("Name : " + textField1);
                        pw.println("Password : " + textField2);
                        pw.println("==================================");

                        pw.flush();
                        pw.close();
                        bw.close();
                        fw.close();

                        JOptionPane.showMessageDialog(null, "Air Hostess Name and Password has been changed.",
                                "Air Hostess Password", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                }

            }
        });
    }

    public static void main(String[] args) {

        EditDataFrame frame = new EditDataFrame();
        frame.setVisible(true);
    }
}
