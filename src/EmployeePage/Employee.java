package EmployeePage;

import CustomWidgets.GradientJPanel;
import CustomWidgets.TransparentJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employee extends JFrame implements ActionListener {
    public Employee() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 720);
        setLayout(new BorderLayout());

        //PANEL
        JPanel mainPanel = new JPanel();

        //APPBAR
        JLabel welcomeText =  new JLabel("WELCOME $NAME");
        welcomeText.setPreferredSize(new Dimension(2600, 60));
        welcomeText.setFont(new Font(Font.SERIF, Font.BOLD, 42));
        welcomeText.setForeground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
