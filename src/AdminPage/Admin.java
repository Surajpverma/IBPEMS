package AdminPage;

import AddEmployeePage.AddEmployee;
import AuthPage.Auth;
import CustomWidgets.TransparentJPanel;
import EmployeePage.Employee;
import LeavePage.Leave;
import PersonalInfoPage.PersonalInfo;
import SearchEmployeePage.SearchEmployee;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame {
    public Admin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        // MAIN PANEL
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(40, 20, 40, 20));

        // WELCOME TEXT
        JLabel welcomeText = new JLabel("WELCOME $NAME");
        welcomeText.setBorder(new EmptyBorder(0, 0, 40, 0));
        welcomeText.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
        welcomeText.setFont(new Font(Font.SERIF, Font.BOLD, 42));
        welcomeText.setForeground(new Color(47, 45, 82));
        mainPanel.add(Box.createVerticalStrut(20)); // Add some vertical space
        mainPanel.add(welcomeText);

        // SUBTITLE PANEL
        JPanel subtitleRow = new JPanel(new GridLayout());
        JLabel branch = new JLabel("Branch: $NAME");
        branch.setHorizontalAlignment(SwingConstants.CENTER);
        branch.setFont(new Font(Font.SERIF, Font.BOLD, 24));
        branch.setForeground(new Color(47, 45, 82));
        JLabel projects = new JLabel("Upcoming Deadline: $NAME");
        projects.setHorizontalAlignment(SwingConstants.CENTER);
        projects.setFont(new Font(Font.SERIF, Font.BOLD, 24));
        projects.setForeground(new Color(47, 45, 82));
        JLabel employees = new JLabel("Task: $NAME");
        employees.setHorizontalAlignment(SwingConstants.CENTER);
        employees.setFont(new Font(Font.SERIF, Font.BOLD, 24));
        employees.setForeground(new Color(47, 45, 82));
        subtitleRow.add(branch);
        subtitleRow.add(projects);
        subtitleRow.add(employees);

        // BUTTON SIDE: Buttons
        TransparentJPanel buttonPanel = new TransparentJPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.BOTH;

        JButton button1 = new JButton("Personal Information");
        button1.setForeground(Color.WHITE); // Set text color
        button1.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button1.setBackground(new Color(47, 45, 82)); // Set background color
        button1.setPreferredSize(new Dimension(600, 60));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new PersonalInfo().setVisible(true);
            }
        });
        buttonPanel.add(button1, gbc);
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button2 = new JButton("Add New Employee");
        button2.setForeground(Color.WHITE); // Set text color
        button2.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button2.setBackground(new Color(47, 45, 82)); // Set background color
        button2.setPreferredSize(new Dimension(600, 60));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new AddEmployee().setVisible(true);
            }
        });
        buttonPanel.add(button2, gbc);
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button5 = new JButton("Search Employee");
        button5.setForeground(Color.WHITE); // Set text color
        button5.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button5.setBackground(new Color(47, 45, 82)); // Set background color
        button5.setPreferredSize(new Dimension(600, 60));
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new SearchEmployee().setVisible(true);
            }
        });
        buttonPanel.add(button5, gbc);
        buttonPanel.setBorder(new EmptyBorder(0, 120, 0, 120));
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button6 = new JButton("Manage Projects");
        button6.setForeground(Color.WHITE); // Set text color
        button6.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button6.setBackground(new Color(47, 45, 82)); // Set background color
        button6.setPreferredSize(new Dimension(600, 60));
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new Leave().setVisible(true);
            }
        });
        buttonPanel.add(button6, gbc);
        buttonPanel.setBorder(new EmptyBorder(0, 120, 0, 120));
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button3 = new JButton("Mark Attendance");
        button3.setForeground(Color.WHITE); // Set text color
        button3.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button3.setBackground(new Color(47, 45, 82)); // Set background color
        button3.setPreferredSize(new Dimension(600, 60));
        buttonPanel.add(button3, gbc);
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button4 = new JButton("Apply Leave");
        button4.setForeground(Color.WHITE); // Set text color
        button4.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button4.setBackground(new Color(47, 45, 82)); // Set background color
        button4.setPreferredSize(new Dimension(600, 60));
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new Leave().setVisible(true);
            }
        });
        buttonPanel.add(button4, gbc);
        buttonPanel.setBorder(new EmptyBorder(0, 120, 0, 120));
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button7 = new JButton("Logout");
        button7.setForeground(Color.WHITE); // Set text color
        button7.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button7.setBackground(new Color(47, 45, 82)); // Set background color
        button7.setPreferredSize(new Dimension(600, 60));
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new Auth().setVisible(true);
            }
        });
        buttonPanel.add(button7, gbc);
        buttonPanel.setBorder(new EmptyBorder(0, 120, 0, 120));

        // Set fixed height for subtitleRow
        subtitleRow.setPreferredSize(new Dimension(720, 60)); // Set preferred size

        mainPanel.add(subtitleRow);
        mainPanel.add(Box.createVerticalGlue()); // Add vertical glue to push components upwards
        mainPanel.add(buttonPanel);
        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }
}
