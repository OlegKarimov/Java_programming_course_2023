import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class LoginForm extends JFrame {
    //private static JTextField userText;
    //private static JPasswordField passwordText;

    private String userName;
    public boolean flagLoginRegistration;

    public LoginForm(boolean flagLoginRegistration) { // передаём на какую кнопку нажали Login или Registration


//        JPanel panel = new JPanel();
//        JFrame frame = new JFrame();

        this.flagLoginRegistration = flagLoginRegistration;
        this.setSize(350, 200);
        this.setLocation(250, 250);
        if (flagLoginRegistration) {
            this.setTitle("Sign in");
        } else this.setTitle("Registration");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
//        frame.setTitle("Sign in");
        JPanel panel = new JPanel();
        panel.setLayout(null);
//----------------------------------------------------------------
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
//----------------------------------------------------------------
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
//----------------------------------------------------------------
        JButton buttonOk = new JButton("Ok");
        buttonOk.setBounds(10, 90, 80, 25);
        buttonOk.isDefaultButton();
        panel.add(buttonOk);
        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userName = userText.getText();
                String userPassword = passwordText.getText();
                boolean userExist = Metods.user_exist(userName, userPassword);

                if ((userText.getText().isEmpty()) || (userPassword.isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Please enter all fields", "Error", JOptionPane.PLAIN_MESSAGE);
                } else if ((!flagLoginRegistration) && (userName.equals("Admin"))) { // если кнопку нажали Registration
                    JOptionPane.showMessageDialog(null, "The name \"Admin\" is reserved", "Error", JOptionPane.PLAIN_MESSAGE);
                } else if (!(((userName.equals("Admin")) && (userPassword.equals("qaywsx"))) || userExist)) { // если пользователь не существует
                    JOptionPane.showMessageDialog(null, "User does not exist", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    MainForm mainForm = new MainForm(userName); //
                    mainForm.setVisible(true);
                    LoginForm.this.dispose();
                }
            }
        });
//----------------------------------------------------------------
        JButton buttonExit = new JButton("Clear");
        buttonExit.setBounds(185, 90, 80, 25);
        panel.add(buttonExit);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText(null);
                passwordText.setText(null);
            }
        });
//----------------------------------------------------------------

        this.add(panel);
//         frame.setVisible(true);

    }

    public String getUserName() {
        return userName;
    }
//    public static void main(String[] args) {
//
//        Login mygui = new Login();
//    }
}