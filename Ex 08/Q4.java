import javax.swing.*;
import java.awt.event.*;

class UserStateGUI {
    JFrame frame;
    JCheckBox driverCheck, passengerCheck;
    JRadioButton marriedRadio, singleRadio, divorcedRadio;
    JComboBox<String> comboBox;
    JTextField checkBoxState, radioState, comboState;
    JButton getStatesButton;
    ButtonGroup maritalGroup;

    UserStateGUI() {
        frame = new JFrame("User State");

        // Checkboxes
        driverCheck = new JCheckBox("Driver");
        passengerCheck = new JCheckBox("Passenger");

        // Radio buttons
        marriedRadio = new JRadioButton("Married");
        singleRadio = new JRadioButton("Single", true);
        divorcedRadio = new JRadioButton("Divorced");

        maritalGroup = new ButtonGroup();
        maritalGroup.add(marriedRadio);
        maritalGroup.add(singleRadio);
        maritalGroup.add(divorcedRadio);

        // ComboBox
        String[] hobbies = { "Swimming", "Cycling", "Reading" };
        comboBox = new JComboBox<>(hobbies);

        // Text fields to show selected states
        checkBoxState = new JTextField();
        radioState = new JTextField();
        comboState = new JTextField();

        // Button
        getStatesButton = new JButton("Get states");

        // Layout setup
        frame.setLayout(null);

        // Set bounds (x, y, width, height)
        frame.add(new JLabel("Checkbox state")).setBounds(30, 20, 120, 25);
        checkBoxState.setBounds(150, 20, 200, 25);
        frame.add(checkBoxState);

        frame.add(new JLabel("Radio button state")).setBounds(30, 50, 120, 25);
        radioState.setBounds(150, 50, 200, 25);
        frame.add(radioState);

        frame.add(new JLabel("Combo box state")).setBounds(30, 80, 120, 25);
        comboState.setBounds(150, 80, 200, 25);
        frame.add(comboState);

        driverCheck.setBounds(30, 110, 100, 25);
        passengerCheck.setBounds(130, 110, 100, 25);
        frame.add(driverCheck);
        frame.add(passengerCheck);

        marriedRadio.setBounds(250, 110, 100, 25);
        singleRadio.setBounds(250, 140, 100, 25);
        divorcedRadio.setBounds(250, 170, 100, 25);
        frame.add(marriedRadio);
        frame.add(singleRadio);
        frame.add(divorcedRadio);

        comboBox.setBounds(30, 140, 150, 25);
        frame.add(comboBox);

        getStatesButton.setBounds(150, 200, 120, 30);
        frame.add(getStatesButton);

        // Button event
        getStatesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cbState = "";
                if (driverCheck.isSelected()) cbState += "Driver";
                if (passengerCheck.isSelected()) cbState += "Passenger";
                checkBoxState.setText(cbState);

                if (marriedRadio.isSelected())
                    radioState.setText("Married");
                else if (singleRadio.isSelected())
                    radioState.setText("Single");
                else
                    radioState.setText("Divorced");

                comboState.setText((String) comboBox.getSelectedItem());
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UserStateGUI();  // Using Association
    }
}