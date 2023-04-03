import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    //public class Form1 {
    private JButton registrationButton;
    private JButton exitButton;
    private JButton logInButton;
    private JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JSeparator separator;


    public Form1() {
        this.setSize(500, 400);
        this.setLocation(250, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setContentPane(panel);
        this.pack();
        this.setTitle("Shop");
        this.setVisible(true);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LoginForm loginForm = new LoginForm(true); // при нажатии кнопки Log in передаём true
                loginForm.setVisible(true);
                Form1.this.dispose();
            }
        });
        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm(false); // при нажатии кнопки registration передаём false
                loginForm.setVisible(true);
                Form1.this.dispose();
            }
        });
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(
//                new Runnable() {
//                    public void run() {
//                        new Form1().setVisible(true);
//                    }
//                });
//    }
}
