package SearchEmployeePage;

import AdminPage.Admin;
import CustomWidgets.TransparentJPanel;
import LeavePage.Leave;
import PersonalInfoPage.PersonalInfo;
import PersonalInfoPage.infoSQLQueries;
import UserGlobalData.UserGlobalData;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SearchEmployee extends JFrame {
    public SearchEmployee() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        // MAIN PANEL
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(40, 20, 60, 20));

        // WELCOME TEXT
        JLabel welcomeText = new JLabel("SEARCH/EDIT EMPLOYEE");
        welcomeText.setBorder(new EmptyBorder(0, 0, 40, 0));
        welcomeText.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align
        welcomeText.setFont(new Font(Font.SERIF, Font.BOLD, 42));
        welcomeText.setForeground(new Color(47, 45, 82));
        mainPanel.add(Box.createVerticalStrut(20)); // Add some vertical space
        mainPanel.add(welcomeText);

        //CONTENT PANEL
        JPanel contentPanel = new JPanel(new GridLayout(1, 2));

        // LEFT SIDE: Buttons and Search Bar
        JPanel leftPanel = new JPanel();

        //Search Bar
        JTextField searchBar = new JTextField();
        searchBar.setPreferredSize(new Dimension(500, 50));
        searchBar.setAlignmentX(Component.CENTER_ALIGNMENT); // Center align

        // Label for the search bar
        JLabel searchLabel = new JLabel("Employee ID: ");
        searchLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        searchLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Panel to hold the label and search bar
        JPanel searchFieldPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchFieldPanel.add(searchLabel);
        searchFieldPanel.add(searchBar);
        leftPanel.add(searchFieldPanel);
        leftPanel.add(Box.createVerticalStrut(240));

        // BUTTON SIDE: Buttons
        TransparentJPanel buttonPanel = new TransparentJPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.BOTH;

        JButton button1 = new JButton("Search");
        button1.setForeground(Color.WHITE); // Set text color
        button1.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button1.setBackground(new Color(47, 45, 82)); // Set background color
        button1.setPreferredSize(new Dimension(600, 60));

        buttonPanel.add(button1, gbc);
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button2 = new JButton("Assign Task");
        button2.setForeground(Color.WHITE); // Set text color
        button2.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button2.setBackground(new Color(47, 45, 82)); // Set background color
        button2.setPreferredSize(new Dimension(600, 60));
        buttonPanel.add(button2, gbc);
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        JButton button3 = new JButton("Back");
        button3.setForeground(Color.WHITE); // Set text color
        button3.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        button3.setBackground(new Color(47, 45, 82)); // Set background color
        button3.setPreferredSize(new Dimension(600, 60));
        button3.setPreferredSize(new Dimension(600, 60));
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open new page logic here
                dispose();
                new Admin().setVisible(true);
            }
        });

        buttonPanel.add(button3, gbc);
        buttonPanel.add(Box.createVerticalStrut(16), gbc);

        buttonPanel.setBorder(new EmptyBorder(0, 120, 0, 120));
        leftPanel.add(buttonPanel);


        leftPanel.setBorder(new EmptyBorder(0, 120, 0, 120));


        // RIGHT SIDE: Multiline Text Area
        JTextArea textArea = new JTextArea();
        textArea.setOpaque(false);
        textArea.setText("-");
        textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 24));
        textArea.setForeground(new Color(47, 45, 82));
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);


        // Calling seach method
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchEmpSQLQueries search = new SearchEmpSQLQueries();
                String information;
                String empId = searchBar.getText();
                try {
                    information = search.searchEmployee(empId);
                    textArea.setText(information);
                } catch (SQLException exp) {
                    throw new RuntimeException(exp);
                } catch (ClassNotFoundException exp) {
                    throw new RuntimeException(exp);
                }
            }
        });

        contentPanel.add(leftPanel);
        contentPanel.add(scrollPane);

        mainPanel.add(Box.createVerticalGlue()); // Add vertical glue to push components upwards
        mainPanel.add(contentPanel);
        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SearchEmployee().setVisible(true));
    }
}
