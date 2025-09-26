package manager;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThirdPage {
    private JFrame thirdFrame;
    private JTextArea app;
    private String filePath = "airhostess\\Data\\userdata.txt";

    public ThirdPage() {
        initialize();
    }

    private void initialize() {
        thirdFrame = new JFrame("Job Applicant");
        thirdFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        thirdFrame.setSize(800, 700);

        Container c = thirdFrame.getContentPane();
        c.setBackground(new Color(135, 206, 235));
        c.setLayout(null);

        JLabel titleLabel = new JLabel("Job Applicant", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 36));
        titleLabel.setBounds(0, 10, 800, 50);
        c.add(titleLabel);

        app = new JTextArea();
        app.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
        app.setLineWrap(true);
        app.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(app);
        scrollPane.setBounds(50, 100, 700, 500);
        c.add(scrollPane);

        JButton saveButton = new JButton("Save");
        saveButton.setFont(new Font("Serif", Font.BOLD, 20));
        saveButton.setBounds(350, 620, 100, 30);
        saveButton.addActionListener(e -> saveToFile());
        c.add(saveButton);

        String fileContent = readFile(filePath);

        if (fileContent.isEmpty()) {
            app.setText("No data found or unable to read file.");
        } else {
            app.setText(fileContent);
        }

        thirdFrame.setLayout(null);
    }

    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(app.getText());
            JOptionPane.showMessageDialog(thirdFrame, "File saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(thirdFrame, "Error saving file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setVisible(boolean visible) {
        if (thirdFrame != null) {
            thirdFrame.setVisible(visible);
        }
    }
}
