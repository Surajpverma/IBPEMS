package EmployeePage;

import LeavePage.Leave;
import PersonalInfoPage.PersonalInfo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employee extends JFrame {
    public Employee() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        // MAIN PANEL
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(40, 20, 160, 20));

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

        //CONTENT PANEL
        JPanel contentPanel = new JPanel(new GridLayout(1, 2));

        // LEFT SIDE: Buttons
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(4, 1, 0, 10)); // 4 rows, 1 column, vertical gap of 10
        leftPanel.setBorder(new EmptyBorder(0, 0, 0, 20)); // Right margin for leftPanel

        JButton button1 = new JButton("Personal Information");
        button1.setForeground(Color.WHITE); // Set text color
        button1.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button1.setBackground(new Color(47, 45, 82)); // Set background color
        button1.setBorder(new EmptyBorder(10, 20, 10, 20)); // Apply margin to buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new PersonalInfo().setVisible(true);
            }
        });
        leftPanel.add(button1);

        JButton button2 = new JButton("Salary Report");
        button2.setForeground(Color.WHITE); // Set text color
        button2.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button2.setBackground(new Color(47, 45, 82)); // Set background color
        button2.setBorder(new EmptyBorder(10, 20, 10, 20)); // Apply margin to buttons
        leftPanel.add(button2);

        JButton button3 = new JButton("Mark Attendance");
        button3.setForeground(Color.WHITE); // Set text color
        button3.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button3.setBackground(new Color(47, 45, 82)); // Set background color
        button3.setBorder(new EmptyBorder(10, 20, 10, 20)); // Apply margin to buttons
        leftPanel.add(button3);

        JButton button4 = new JButton("Apply Leave");
        button4.setForeground(Color.WHITE); // Set text color
        button4.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button4.setBackground(new Color(47, 45, 82)); // Set background color
        button4.setBorder(new EmptyBorder(10, 20, 10, 20)); // Apply margin to buttons
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new Leave().setVisible(true);
            }
        });
        leftPanel.add(button4);

        leftPanel.setBorder(new EmptyBorder(0, 120, 0, 120));

        // RIGHT SIDE: Multiline Text Area
        JTextArea textArea = new JTextArea();
        textArea.setOpaque(false);
        textArea.setText("Ongoing Tasks:\n1. Help son in Math homework\n2. Bring milk from market\n3. Satisfy my wife\n4. Regret my life");
        textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        textArea.setForeground(new Color(47, 45, 82));
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        contentPanel.add(leftPanel);
        contentPanel.add(scrollPane);

        // Set fixed height for subtitleRow
        subtitleRow.setPreferredSize(new Dimension(720, 60)); // Set preferred size

        mainPanel.add(subtitleRow);
        mainPanel.add(Box.createVerticalGlue()); // Add vertical glue to push components upwards
        mainPanel.add(contentPanel);
        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Employee().setVisible(true);
        });
    }
}
