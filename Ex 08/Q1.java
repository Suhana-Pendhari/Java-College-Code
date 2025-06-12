import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationForm {
    JFrame frame;
    JLabel title, nameLabel, mobileLabel, genderLabel, dobLabel, hobbiesLabel, addressLabel;
    JTextField nameField, mobileField;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JComboBox<String> day, month, year;
    JCheckBox reading, writing, badminton, terms;
    JTextArea addressArea;
    JButton submit, reset;

    RegistrationForm() {
        frame = new JFrame("Registration Form");

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(130, 10, 250, 30);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 60, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(150, 60, 150, 30);

        mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(50, 100, 100, 30);
        mobileField = new JTextField();
        mobileField.setBounds(150, 100, 150, 30);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 140, 100, 30);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(150, 140, 70, 30);
        female.setBounds(230, 140, 80, 30);
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        dobLabel = new JLabel("DOB");
        dobLabel.setBounds(50, 180, 100, 30);
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) days[i] = String.valueOf(i + 1);
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        String[] years = {"2021", "2020", "2019", "2018", "2017"};

        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);
        day.setBounds(150, 180, 50, 30);
        month.setBounds(210, 180, 60, 30);
        year.setBounds(280, 180, 60, 30);

        hobbiesLabel = new JLabel("Hobbies");
        hobbiesLabel.setBounds(50, 220, 100, 30);
        reading = new JCheckBox("Reading");
        writing = new JCheckBox("Writing");
        badminton = new JCheckBox("Badminton");
        reading.setBounds(150, 220, 80, 30);
        writing.setBounds(230, 220, 80, 30);
        badminton.setBounds(310, 220, 100, 30);

        addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 260, 100, 30);
        addressArea = new JTextArea();
        addressArea.setBounds(150, 260, 200, 50);

        terms = new JCheckBox("Accept terms and conditions");
        terms.setBounds(150, 320, 250, 30);

        submit = new JButton("Submit");
        submit.setBounds(150, 360, 80, 30);

        reset = new JButton("Reset");
        reset.setBounds(240, 360, 80, 30);

        frame.add(title);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(mobileLabel);
        frame.add(mobileField);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);
        frame.add(dobLabel);
        frame.add(day);
        frame.add(month);
        frame.add(year);
        frame.add(hobbiesLabel);
        frame.add(reading);
        frame.add(writing);
        frame.add(badminton);
        frame.add(addressLabel);
        frame.add(addressArea);
        frame.add(terms);
        frame.add(submit);
        frame.add(reset);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button actions (optional)
        submit.addActionListener(e -> {
            if (terms.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Registration Successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Please accept terms and conditions.");
            }
        });

        reset.addActionListener(e -> {
            nameField.setText("");
            mobileField.setText("");
            genderGroup.clearSelection();
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            reading.setSelected(false);
            writing.setSelected(false);
            badminton.setSelected(false);
            addressArea.setText("");
            terms.setSelected(false);
        });
    }

    public static void main(String[] args) {
        new RegistrationForm(); // Association method used here
    }
}
