import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class PracticalMST implements ActionListener {
    JFrame frame;
    JLabel nameLabel = new JLabel("NAME");
    JLabel fatherNameLabel = new JLabel("FATHER NAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JLabel confirmPasswordLabel = new JLabel("CONFIRM PASSWORD");
    JLabel cityLabel = new JLabel("CITY");
    JTextField nameTextField = new JTextField();
    JTextField fatherTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();
    JTextField cityTextField = new JTextField();
    JButton registerButton = new JButton("REGISTER");
    JButton resetButton = new JButton("RESET");

    PracticalMST() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }

    public void createWindow() {
        frame = new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(40, 40, 380, 600);
        frame.getContentPane().setBackground(Color.pink);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        nameLabel.setBounds(20, 20, 40, 70);
        fatherNameLabel.setBounds(20, 100, 100, 70);
        passwordLabel.setBounds(20, 170, 100, 70);
        confirmPasswordLabel.setBounds(20, 220, 140, 70);
        cityLabel.setBounds(20, 270, 100, 70);
        nameTextField.setBounds(180, 43, 165, 23);
        fatherTextField.setBounds(180, 123, 165, 23);
        passwordField.setBounds(180, 193, 165, 23);
        confirmPasswordField.setBounds(180, 243, 165, 23);
        cityTextField.setBounds(180, 293, 165, 23);
        registerButton.setBounds(70, 400, 100, 35);
        resetButton.setBounds(220, 400, 100, 35);
    }

    public void addComponentsToFrame() {
        frame.add(nameLabel);
        frame.add(fatherNameLabel);
        frame.add(passwordLabel);
        frame.add(confirmPasswordLabel);
        frame.add(cityLabel);
        frame.add(nameTextField);
        frame.add(fatherTextField);
        frame.add(passwordField);
        frame.add(confirmPasswordField);
        frame.add(cityTextField);
        frame.add(registerButton);
        frame.add(resetButton);
    }

    public void actionEvent() {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            try {
                // Creating Connection Object
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase", "root",
                        "");
                // Preapared Statement
                PreparedStatement Pstatement = connection.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
                // Specifying the values of it's parameter
                Pstatement.setString(1, nameTextField.getText());
                Pstatement.setString(3, fatherTextField.getText());
                Pstatement.setString(4, passwordField.getText());
                Pstatement.setString(5, confirmPasswordField.getText());
                Pstatement.setString(6, cityTextField.getText());
                // Checking for the Password match
                if (passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText())) {
                    // Executing query
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Registered Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "password did not match");
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == resetButton) {
            // Clearing Fields
            nameTextField.setText("");
            // genderComboBox.setSelectedItem("Male");
            fatherTextField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            cityTextField.setText("");
        }
    }

    public static void main(String[] args) {
        new PracticalMST();
    }
}