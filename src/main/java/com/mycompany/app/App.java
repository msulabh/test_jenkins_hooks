import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class FeedbackTable {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Employee Feedback on Salary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        // Create column names
        String[] columnNames = {"Employee ID", "Employee Name", "Feedback", "Salary"};

        // Create data for the table
        Object[][] data = new Object[100][4];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            data[i][0] = i + 1; // Employee ID
            data[i][1] = "Employee " + (i + 1); // Employee Name
            data[i][2] = "Feedback " + (i + 1); // Feedback
            data[i][3] = 30000 + random.nextInt(20000); // Salary
        }

        // Create a table model and set it to the table
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}

