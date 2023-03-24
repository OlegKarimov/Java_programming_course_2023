import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton OKButton;
    private JButton canselButton;
    private JPanel panel;
    private JLabel welcom;

    public gui() {
        setContentPane(panel);
        setTitle("Welcome");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fn = textField1.getText();
                String fm = textField2.getText();
                welcom.setText("Welcom " + fn + " " + fm);

            }
        });
        canselButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    public static void main(String[] args) {
        gui myframe = new gui();

    }
}
