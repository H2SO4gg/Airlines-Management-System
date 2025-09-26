package passenger;
import admin.*;
import airhostess.*;
import manager.*;
import passenger.*;
import welcome.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Registration extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel passport;
    private JTextField tpassport;
    private JLabel nationality;
    private JTextField tnationality;
    private JLabel Ticket_type;
    private JRadioButton Economy;
    private JRadioButton Business;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox Adults;
    private JComboBox Children;
    private JComboBox Infant;
    private JLabel dobb;
    private JComboBox datee;
    private JComboBox monthh;
    private JComboBox yearr;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JButton login;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String Adult[]
        = { "1 seat(2k)", "2 seat(4k)", "3 seat(6k)", "4 seat(8k)", "5 seat(10k)" };
    private String Childrens[]
        = { "(9AM-10AM)", "(11AM-12AM)", "(3PM-5PM)", "(7PM-9PM)" };
    private String Infants[]
        = { "(Dhaka to Chittagong)", "(Chittagong to Dhaka)", "(Dhaka to Singapore)", "(Singapore to Dhaka)" };

    private String datess[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String monthss[]
        = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String yearss[]
        = {  "2023", "2024", "2025" };

    public Registration() {
        getContentPane().setBackground(new Color(255, 229, 204));
        ImageIcon image = new ImageIcon("passenger\\icon1.png");
        setIconImage(image.getImage());

        setTitle("Ticket Choose");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("BOOK a ticket");
        title.setFont(new Font("Arial Black", Font.BOLD, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        title.setBackground(Color.WHITE);
        c.add(title);

        name = new JLabel("Name:");
        name.setFont(new Font("Arial Black", Font.BOLD, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        name.setBackground(Color.WHITE);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        tname.setBackground(Color.WHITE);
        c.add(tname);

        mno = new JLabel("Mobile:");
        mno.setFont(new Font("Arial Black", Font.BOLD, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 130);
        mno.setBackground(Color.WHITE);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(200, 130);
        tmno.setBackground(Color.WHITE);
        c.add(tmno);

        passport = new JLabel("Passport:");
        passport.setFont(new Font("Arial Black", Font.BOLD, 20));
        passport.setSize(120, 20);
        passport.setLocation(100, 160);
        passport.setBackground(Color.WHITE);
        c.add(passport);

        tpassport = new JTextField();
        tpassport.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassport.setSize(190, 20);
        tpassport.setLocation(200, 160);
        tpassport.setBackground(Color.WHITE);
        c.add(tpassport);

        nationality = new JLabel("Nationality:");
        nationality.setFont(new Font("Arial Black", Font.BOLD, 20));
        nationality.setSize(130, 20);
        nationality.setLocation(100, 190);
        nationality.setBackground(Color.WHITE);
        c.add(nationality);

        tnationality = new JTextField();
        tnationality.setFont(new Font("Arial", Font.PLAIN, 15));
        tnationality.setSize(190, 20);
        tnationality.setLocation(200, 190);
        tnationality.setBackground(Color.WHITE);
        c.add(tnationality);

        Ticket_type = new JLabel("Choose:");
        Ticket_type.setFont(new Font("Arial Black", Font.BOLD, 18));
        Ticket_type.setSize(100, 20);
        Ticket_type.setLocation(100, 230);
        Ticket_type.setBackground(Color.WHITE);
        c.add(Ticket_type);

        Economy = new JRadioButton("Economy");
        Economy.setFont(new Font("Arial", Font.BOLD, 10));
        Economy.setSelected(true);
        Economy.setSize(75, 20);
        Economy.setLocation(200, 230);
        Economy.setBackground(Color.PINK);
        c.add(Economy);

        Business = new JRadioButton("Business");
        Business.setFont(new Font("Arial", Font.BOLD, 10));
        Business.setSelected(false);
        Business.setSize(80, 20);
        Business.setLocation(300, 230);
        Business.setBackground(Color.PINK);
        c.add(Business);

        gengp = new ButtonGroup();
        gengp.add(Economy);
        gengp.add(Business);

        dobb = new JLabel("D/M/YYY");
        dobb.setFont(new Font("Arial Black", Font.BOLD, 20));
        dobb.setSize(100, 20);
        dobb.setLocation(100, 260);
        c.add(dobb);

        datee = new JComboBox(datess);
        datee.setFont(new Font("Arial", Font.PLAIN, 15));
        datee.setSize(50, 20);
        datee.setLocation(200, 260);
        c.add(datee);

        monthh = new JComboBox(monthss);
        monthh.setFont(new Font("Arial", Font.PLAIN, 15));
        monthh.setSize(60, 20);
        monthh.setLocation(250, 260);
        monthh.setBackground(Color.WHITE);
        c.add(monthh);

        yearr = new JComboBox(yearss);
        yearr.setFont(new Font("Arial", Font.PLAIN, 15));
        yearr.setSize(60, 20);
        yearr.setLocation(320, 260);
        c.add(yearr);

        dob = new JLabel("Select:");
        dob.setFont(new Font("Arial Black", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 310);
        c.add(dob);

        Adults = new JComboBox(Adult);
        Adults.setFont(new Font("Arial", Font.PLAIN, 15));
        Adults.setSize(90, 20);
        Adults.setLocation(200, 310);
        Adults.setBackground(Color.pink);
        c.add(Adults);

        Children = new JComboBox(Childrens);
        Children.setFont(new Font("Arial", Font.PLAIN, 15));
        Children.setSize(110, 20);
        Children.setLocation(250, 310);
        Children.setBackground(Color.pink);
        c.add(Children);

        Infant = new JComboBox(Infants);
        Infant.setFont(new Font("Arial", Font.PLAIN, 15));
        Infant.setSize(150, 20);
        Infant.setLocation(350, 310);
        Infant.setBackground(Color.pink);
        c.add(Infant);

        add = new JLabel("Current Home Address:-");
        add.setFont(new Font("Arial", Font.ITALIC, 13));
        add.setSize(200, 20);
        add.setLocation(50, 360);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 360);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Agency FB", Font.BOLD, 15));
        term.setSize(250, 20);
        term.setLocation(150, 450);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 500);
        sub.addActionListener(this);
        sub.setBackground(Color.GREEN);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 500);
        reset.addActionListener(this);
        reset.setBackground(Color.red);
        c.add(reset);

        login = new JButton("Back");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setSize(100, 20);
        login.setLocation(200, 550);
        login.addActionListener(this);
        c.add(login);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 580);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 150);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            StringBuilder data = new StringBuilder();
            data.append("-------- Passenger Information --------\n");
            data.append("Name: ").append(tname.getText()).append("\n");
            data.append("Mobile: ").append(tmno.getText()).append("\n");
            data.append("Passport: ").append(tpassport.getText()).append("\n");
            data.append("Nationality: ").append(tnationality.getText()).append("\n");

            String type = Economy.isSelected() ? "Economy" : "Business";
            data.append("Type: ").append(type).append("\n");

            data.append("Seat: ").append(Adults.getSelectedItem()).append("\n");
            data.append("Time: ").append(Children.getSelectedItem()).append("\n");
            data.append("Plane route: ").append(Infant.getSelectedItem()).append("\n");

            data.append("D/M/YYYY: ")
                .append(datee.getSelectedItem()).append("/")
                .append(monthh.getSelectedItem()).append("/")
                .append(yearr.getSelectedItem()).append("\n");

            data.append("Current Home address: ").append(tadd.getText()).append("\n");
            data.append("-----------------------------------\n");

            tout.setText(data.toString());
            tout.setEditable(false);
            res.setText("!!!!!Ticket Book Complete!!!!!!!");

            try (FileWriter fw = new FileWriter("passenger\\registration.txt", true)) {
                fw.write(data.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tmno.setText(def);
            tpassport.setText(def);
            tnationality.setText(def);
            tadd.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);

            Adults.setSelectedIndex(0);
            Children.setSelectedIndex(0);
            Infant.setSelectedIndex(0);

            datee.setSelectedIndex(0);
            monthh.setSelectedIndex(0);
            yearr.setSelectedIndex(0);

            resadd.setText(def);
        } else if (e.getSource() == login) {
            new Login();
            this.setVisible(false);
        }
    }
}
