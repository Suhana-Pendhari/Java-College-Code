import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class CoffeeTableGUI {
    JFrame frame;
    JTable table;
    DefaultTableModel model;
    JTextField nameField, supIDField, priceField, salesField, totalSalesField;
    JButton addRowBtn, updateBtn, discardBtn;

    CoffeeTableGUI() {
        frame = new JFrame("The Coffee Break: COFFEES Table");

        // Column headers
        String[] columns = {"COF_NAME", "SUP_ID", "PRICE", "SALES", "TOTAL"};

        // Sample data
        String[][] data = {
            {"Colombian", "101", "7.99", "0", "0"},
            {"Colombian_Decaf", "101", "8.99", "0", "0"},
            {"Espresso", "160", "9.99", "0", "0"},
            {"French_Roast", "49", "8.99", "0", "0"},
            {"French_Roast_Decaf", "49", "9.99", "0", "0"}
        };

        model = new DefaultTableModel(data, columns);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 550, 120);

        JLabel nameLabel = new JLabel("Coffee Name:");
        nameLabel.setBounds(20, 150, 100, 30);
        nameField = new JTextField("Enter new coffee name");
        nameField.setBounds(130, 150, 200, 30);

        JLabel supIDLabel = new JLabel("Supplier ID:");
        supIDLabel.setBounds(20, 190, 100, 30);
        supIDField = new JTextField("101");
        supIDField.setBounds(130, 190, 100, 30);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(20, 230, 100, 30);
        priceField = new JTextField("0");
        priceField.setBounds(130, 230, 100, 30);

        JLabel salesLabel = new JLabel("Sales:");
        salesLabel.setBounds(250, 190, 100, 30);
        salesField = new JTextField("0");
        salesField.setBounds(310, 190, 100, 30);

        JLabel totalLabel = new JLabel("Total Sales:");
        totalLabel.setBounds(250, 230, 100, 30);
        totalSalesField = new JTextField("0");
        totalSalesField.setBounds(310, 230, 100, 30);

        addRowBtn = new JButton("Add row to table");
        addRowBtn.setBounds(20, 280, 150, 30);

        updateBtn = new JButton("Update database");
        updateBtn.setBounds(180, 280, 150, 30);

        discardBtn = new JButton("Discard changes");
        discardBtn.setBounds(340, 280, 150, 30);

        // Add row to table action
        addRowBtn.addActionListener(e -> {
            String name = nameField.getText();
            String supID = supIDField.getText();
            String price = priceField.getText();
            String sales = salesField.getText();
            String total = totalSalesField.getText();
            model.addRow(new String[]{name, supID, price, sales, total});
        });

        // Clear fields
        discardBtn.addActionListener(e -> {
            nameField.setText("");
            supIDField.setText("");
            priceField.setText("");
            salesField.setText("");
            totalSalesField.setText("");
        });

        frame.setLayout(null);
        frame.add(scrollPane);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(supIDLabel);
        frame.add(supIDField);
        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(salesLabel);
        frame.add(salesField);
        frame.add(totalLabel);
        frame.add(totalSalesField);
        frame.add(addRowBtn);
        frame.add(updateBtn);
        frame.add(discardBtn);

        frame.setSize(600, 370);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CoffeeTableGUI(); // Association used
    }
}
