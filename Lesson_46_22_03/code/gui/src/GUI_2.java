import javax.swing.*;
import java.awt.event.*;

public class GUI_2 {
    //private static JTextField userText;
    //private static JPasswordField passwordText;

    public GUI_2() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Sign in");
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
                System.out.println("Попытка залогиниться. Логин: " + userText.getText() + " ; пароль: " + passwordText.getText());
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

        frame.add(panel);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        GUI_2 mygui = new GUI_2();
    }
}