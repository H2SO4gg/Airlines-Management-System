package manager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SecondPage {
    private Manager manager;
    private JFrame secondFrame;
    private JTextField airplaneNameField, departureTimeField, fromField, toField, dateField, maxPassengerField;
    private JTable table;
    private DefaultTableModel model;

    public SecondPage(Manager manager) {
        this.manager = manager;
        initialize();
    }

    private void initialize() {
        secondFrame = new JFrame("Skyline Airlines");
        secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secondFrame.setSize(800, 600);
        secondFrame.setLocationRelativeTo(null);
        secondFrame.getContentPane().setBackground(Color.orange);
        secondFrame.setLayout(null);

        JLabel titleLabel = new JLabel(" Airlines Manager ", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 36));
        titleLabel.setBounds(0, 10, 800, 50);
        secondFrame.add(titleLabel);

        String[] columns = {"Airplane Name", "Departure Time", "From", "To", "Date", "Max Passengers"};
        model = new DefaultTableModel(null, columns);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 320, 600, 300);
        secondFrame.add(scrollPane);

        addFormFields();
        addButtons();
    }

    private void addFormFields() {
        String[] labels = {"Airplane Name:", "Departure Time:", "From:", "To:", "Date:", "Max Passengers:"};
        JTextField[] fields = {airplaneNameField, departureTimeField, fromField, toField, dateField, maxPassengerField};

        int x1 = 50, x2 = 450, y = 120;
        for (int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel(labels[i]);
            label.setBounds((i % 2 == 0) ? x1 : x2, y, 120, 30);
            secondFrame.add(label);

            fields[i] = new JTextField();
            fields[i].setBounds((i % 2 == 0) ? x1 + 120 : x2 + 120, y, 200, 30);
            secondFrame.add(fields[i]);

            if (i % 2 == 1) y += 50;
        }

        airplaneNameField = fields[0];
        departureTimeField = fields[1];
        fromField = fields[2];
        toField = fields[3];
        dateField = fields[4];
        maxPassengerField = fields[5];
    }

    private void addButtons() {
        JButton addButton = createButton("Add", 700, 320, e -> addFlight());
        JButton deleteButton = createButton("Delete", 700, 370, e -> deleteFlight());
        JButton updateButton = createButton("Update", 700, 420, e -> updateFlight());

        JButton airhostessButton = createButton("Airhostess Info", 660, 500, e -> {
            manager.showThirdPage();
            secondFrame.dispose();
        });
        airhostessButton.setBackground(new Color(135, 206, 235));
        secondFrame.add(airhostessButton);

        JButton managerDataButton = createButton("Manager Data", 660, 540, e -> openManagerData());
        managerDataButton.setBackground(new Color(100, 149, 237));
        secondFrame.add(managerDataButton);
    }

    private JButton createButton(String text, int x, int y, ActionListener action) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 150, 30);
        button.addActionListener(action);
        secondFrame.add(button);
        return button;
    }

    public void addFlight() {
        String[] flightData = {
                airplaneNameField.getText(),
                departureTimeField.getText(),
                fromField.getText(),
                toField.getText(),
                dateField.getText(),
                maxPassengerField.getText()
        };

        if (isValidInput(flightData)) {
            model.addRow(flightData);
            saveToFile("manager/flights.txt", formatFlightData(flightData));

            clearFields();
        } else {
            JOptionPane.showMessageDialog(secondFrame, "Please fill in all fields.");
        }
    }

    public void deleteFlight() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(secondFrame, "Please select a flight to delete.");
        }
    }

    public void updateFlight() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            String[] updatedData = {
                    airplaneNameField.getText(),
                    departureTimeField.getText(),
                    fromField.getText(),
                    toField.getText(),
                    dateField.getText(),
                    maxPassengerField.getText()
            };

            if (isValidInput(updatedData)) {
                for (int i = 0; i < updatedData.length; i++) {
                    model.setValueAt(updatedData[i], selectedRow, i);
                }
                clearFields();
            } else {
                JOptionPane.showMessageDialog(secondFrame, "Please fill in all fields.");
            }
        } else {
            JOptionPane.showMessageDialog(secondFrame, "Please select a flight to update.");
        }
    }

    private boolean isValidInput(String[] data) {
        for (String field : data) {
            if (field.trim().isEmpty()) return false;
        }
        return true;
    }

    private String formatFlightData(String[] data) {
        return "Airplane Name: " + data[0] + "\n" +
                "Departure Time: " + data[1] + "\n" +
                "From: " + data[2] + "\n" +
                "To: " + data[3] + "\n" +
                "Date: " + data[4] + "\n" +
                "Max Passengers: " + data[5] + "\n";
    }

    private void saveToFile(String filename, String data) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)))) {
            pw.println(data);
            pw.println("----------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        airplaneNameField.setText("");
        departureTimeField.setText("");
        fromField.setText("");
        toField.setText("");
        dateField.setText("");
        maxPassengerField.setText("");
    }

    private void openManagerData() {
        JFrame managerFrame = new JFrame("Manager Data");
        managerFrame.setSize(400, 400);
        managerFrame.setLocationRelativeTo(secondFrame);
        managerFrame.setLayout(null);

        JLabel[] labels = {new JLabel("Name:"), new JLabel("Passport Number:"), new JLabel("Email:"),
                new JLabel("Address:"), new JLabel("Phone:")};

        JTextField[] fields = {new JTextField(), new JTextField(), new JTextField(), new JTextField(), new JTextField()};

        int y = 30;
        for (int i = 0; i < labels.length; i++) {
            labels[i].setBounds(30, y, 120, 30);
            fields[i].setBounds(160, y, 200, 30);
            managerFrame.add(labels[i]);
            managerFrame.add(fields[i]);
            y += 50;
        }

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(150, 300, 100, 30);
        saveButton.addActionListener(e -> {
            String[] data = {fields[0].getText(), fields[1].getText(), fields[2].getText(), fields[3].getText(), fields[4].getText()};
            if (isValidInput(data)) {
                saveToFile("manager/manager_data.txt", String.join("\n", data) + "\n");
                JOptionPane.showMessageDialog(managerFrame, "Data saved successfully.");
                managerFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(managerFrame, "Please fill in all fields.");
            }
        });

        managerFrame.add(saveButton);
        managerFrame.setVisible(true);
    }

    public void setVisible(boolean visible) {
        if (secondFrame != null) secondFrame.setVisible(visible);
    }
}
