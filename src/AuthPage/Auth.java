package AuthPage;

import CustomWidgets.GradientJPanel;
import CustomWidgets.RoundBorder;
import CustomWidgets.TransparentJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Auth extends JFrame implements ActionListener {
    private JTextField usernameField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private button.RoundButton loginButton = new button.RoundButton();

    public Auth() {
        setTitle("Employee Portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 720);
        setLayout(new GridLayout(1, 2));

        GradientJPanel leftPanel = new GradientJPanel();
        leftPanel.setLayout(new GridLayout(3, 1));

        //TITLE
        TransparentJPanel titlePanel = new TransparentJPanel();
        ImageIcon ct1 = new ImageIcon("C:\\Users\\baner\\IdeaProjects\\DBSProject\\src\\AuthPage\\face.png");
        Image ct2 = ct1.getImage().getScaledInstance(240, 240, Image.SCALE_DEFAULT);
        ImageIcon ct3 = new ImageIcon(ct2);
        titlePanel.setLayout(new BorderLayout());
        JLabel title = new JLabel("LOGIN PORTAL");
        title.setFont(new Font(Font.SERIF, Font.BOLD, 42));
        title.setForeground(Color.WHITE);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.BOTTOM);
        title.setIcon(ct3);
        titlePanel.add(title);
        titlePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.setAlignmentY(Component.CENTER_ALIGNMENT);

        //TEXT FIELDS
        TransparentJPanel usernameRow = new TransparentJPanel();
        TransparentJPanel usernameFieldPanel = new TransparentJPanel();
        usernameFieldPanel.setLayout(new BorderLayout());
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
        usernameLabel.setForeground(Color.WHITE);
        usernameField.setPreferredSize(new Dimension(500, 36));
        usernameField.setOpaque(true);
        usernameRow.add(usernameLabel);
        usernameRow.add(usernameField);
        usernameFieldPanel.add(usernameRow, BorderLayout.SOUTH);
        usernameFieldPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        usernameFieldPanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        TransparentJPanel passwordFieldPanel = new TransparentJPanel();
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
        passwordLabel.setForeground(Color.WHITE);
        passwordField.setPreferredSize(new Dimension(500, 36));
        passwordFieldPanel.setPreferredSize(new Dimension(550, 36));
        passwordFieldPanel.add(passwordLabel);
        passwordFieldPanel.add(passwordField);

        TransparentJPanel textFieldPanel = new TransparentJPanel();
        textFieldPanel.setLayout(new GridLayout(2, 1));
        textFieldPanel.add(usernameFieldPanel);
        textFieldPanel.add(passwordFieldPanel);

        //LOGIN BUTTON
        TransparentJPanel buttonPanel = new TransparentJPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.BOTH;
        loginButton.setRadius(12);
        loginButton.addActionListener(this);
        loginButton.setPreferredSize(new Dimension(250, 40));
        loginButton.setColor(new Color(133, 189, 118));
        loginButton.setBorder(new RoundBorder(12, new Color(133, 189, 118)));
        loginButton.setText("LOGIN");
        loginButton.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
        loginButton.setBackground(new Color(188, 255, 209, 255));
        buttonPanel.add(loginButton, gbc);

        leftPanel.add(titlePanel);
        leftPanel.add(textFieldPanel);
        leftPanel.add(buttonPanel);

        add(leftPanel);
        add(new JPanel());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }
}
