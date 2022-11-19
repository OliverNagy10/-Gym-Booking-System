package GUI;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DATABASE.Writer;
import USER.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegUI extends JPanel implements ActionListener {

    private static JLabel fNameLabel;
    private static JLabel sNameLabel;
    private static JLabel DOBLabel;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JLabel collegeIDLabel;
    private static JLabel registerText;
    private static JTextField fNameText;
    private static JTextField sNameText;
    private static JTextField collegeIDText;
    private static JTextField DOBText;
    private static JLabel success;
    private static JButton registerButton;

    static String firstName;
    static String DOB;
    static String surName;
    static String ID;
    static String password;

    public static void Create() {

        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Creating the first name text box
        panel.setLayout(null);
        fNameLabel = new JLabel("First Name");
        fNameLabel.setBounds(10, 20, 80, 25);
        panel.add(fNameLabel);

        fNameText = new JTextField(20);
        fNameText.setBounds(100, 20, 165, 25);
        panel.add(fNameText);

        //

        // Creating the surname text box
        panel.setLayout(null);
        sNameLabel = new JLabel("Surname");
        sNameLabel.setBounds(10, 60, 80, 25);
        panel.add(sNameLabel);

        sNameText = new JTextField(20);
        sNameText.setBounds(100, 60, 165, 25);
        panel.add(sNameText);
        ;

        //

        // Creating the collegeID text box
        collegeIDLabel = new JLabel("College ID");
        collegeIDLabel.setBounds(10, 100, 80, 25);
        panel.add(collegeIDLabel);

        collegeIDText = new JTextField(20);
        collegeIDText.setBounds(100, 100, 165, 25);
        panel.add(collegeIDText);

        //

        // Creating the DOB text box
        DOBLabel = new JLabel("DOB");
        DOBLabel.setBounds(10, 140, 115, 25);
        panel.add(DOBLabel);

        DOBText = new JTextField(20);
        DOBText.setBounds(100, 140, 165, 25);
        panel.add(DOBText);

        // Creating the DOB text box
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 180, 115, 25);
        panel.add(passwordLabel);

        passwordText = new JTextField(20);
        passwordText.setBounds(100, 180, 115, 25);
        panel.add(passwordText);

        //
        // Creating the DOB text box
        registerText = new JLabel("Already have an account? ");
        registerText.setBounds(10, 250, 200, 25);
        panel.add(registerText);

        //

        //
        // Adding the Register button
        registerButton = new JButton("Register");
        registerButton.setBounds(200, 210, 120, 25);
        registerButton.addActionListener(new RegUI());
        panel.add(registerButton);

        //

        // Adding the LogIn button
        ///////////////////////////////////////////////////////////////////////////////
        JButton logInButton = new JButton(new AbstractAction("Log In") {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserUI.Create();
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }
        });

        logInButton.setBounds(200, 250, 120, 25);

        panel.add(logInButton);

        // Making a success notification
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        firstName = fNameText.getText();
        surName = sNameText.getText();
        DOB = DOBText.getText();
        ID = collegeIDText.getText();
        password = passwordText.getText();
        LocalDate dob = LocalDate.parse(DOB, formatter);
        LocalDate Today = LocalDate.now();

        User u = new User(ID, firstName + " " + surName, Today, Today, dob, "User");
        LocalDate dateOfB = u.getDOB();
        LocalDate start = u.getstartDate();
        LocalDate end = u.getendDate();

        String[][] User = {
                { u.getUserName(), u.getUserID(), dateOfB.toString(), start.toString(), end.toString(),
                        u.getUserType() },
                {},

        };

        String[][] userAndPassword = {
                { u.getUserID(), password },
                {},

        };

        Writer wr2 = new Writer();

        try {
            wr2.Write(userAndPassword, "LOGIN_DETAILS");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        Writer wr = new Writer();

        try {

            wr.Write(User, "USERS");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }

}
