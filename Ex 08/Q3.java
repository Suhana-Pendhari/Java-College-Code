import javax.swing.*;
import java.awt.event.*;

class MenuDemo {
    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, subMenu;
    JMenuItem newProjectItem, newFileItem;
    JCheckBoxMenuItem checkBox1, checkBox2;
    JRadioButtonMenuItem radio1, radio2;
    ButtonGroup radioGroup;

    MenuDemo() {
        frame = new JFrame("Menu Demo");

        // Menu bar
        menuBar = new JMenuBar();

        // Menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");

        // Menu items
        newProjectItem = new JMenuItem("New Project...");
        newProjectItem.setMnemonic('1');  // Alt+1
        newFileItem = new JMenuItem("New File...");

        // Checkboxes
        checkBox1 = new JCheckBoxMenuItem("A check box menu item");
        checkBox2 = new JCheckBoxMenuItem("Another one");

        // Radio buttons
        radio1 = new JRadioButtonMenuItem("Radio button menu item", true);
        radio2 = new JRadioButtonMenuItem("Another radio button");

        radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);

        // Submenu
        subMenu = new JMenu("A submenu");
        subMenu.add(new JMenuItem("Submenu item 1"));
        subMenu.add(new JMenuItem("Submenu item 2"));

        // Add items to "File" menu
        fileMenu.add(newProjectItem);
        fileMenu.add(newFileItem);
        fileMenu.addSeparator();
        fileMenu.add(checkBox1);
        fileMenu.add(checkBox2);
        fileMenu.addSeparator();
        fileMenu.add(radio1);
        fileMenu.add(radio2);
        fileMenu.addSeparator();
        fileMenu.add(subMenu);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Add to frame
        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo();  // Using Association
    }
}
