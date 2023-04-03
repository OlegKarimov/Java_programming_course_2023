import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.event.*;
import java.util.ArrayList;

public class AddProductForm extends JFrame {
    //private static JTextField userText;
    //private static JPasswordField passwordText;

    //    private String productName;
//    public boolean flagLoginRegistration;
    private Product productAdd = new Product();
    ArrayList<Product> products;
    private TableModelProducts tableModel;
    private ArrayList<String[]> list;
    private JTable table1;

    public AddProductForm(JTable table1, TableModelProducts tableModel, ArrayList<String[]> list, ArrayList<Product> products) {


//        JPanel panel = new JPanel();
//        JFrame frame = new JFrame();

//        this.flagLoginRegistration = flagLoginRegistration;
        this.list = list;
        this.products = products;
        this.tableModel = tableModel;
        this.table1 = table1;

        this.setSize(350, 300);
        this.setLocation(350, 300);
//        if (flagLoginRegistration) {
//            this.setTitle("Sign in");
//        } else this.setTitle("Registration");

        this.setTitle("Add Product");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
//        frame.setTitle("Sign in");
        JPanel panel = new JPanel();
        panel.setLayout(null);
//----------------------------------------------------------------
        JLabel productLabel = new JLabel("Product name:");
        productLabel.setBounds(10, 20, 150, 25);
        panel.add(productLabel);

        JTextField productText = new JTextField(20);
        productText.setBounds(100, 20, 165, 25);
        panel.add(productText);
//        productLabel.setLabelFor(productText);
//----------------------------------------------------------------
        JLabel priseLabel = new JLabel("Prise:");
        priseLabel.setBounds(10, 50, 100, 25);
        panel.add(priseLabel);

        JTextField priseText = new JTextField(5);
        priseText.setBounds(100, 50, 165, 25);
        panel.add(priseText);
        //Вставляем фильтр вводимых символов
        ((PlainDocument) priseText.getDocument()).setDocumentFilter(new NumberFilter()); //!!!!!!!!!!!!!!!!!!
//----------------------------------------------------------------
        JLabel ratingLabel = new JLabel("Rating:");
        ratingLabel.setBounds(10, 80, 100, 25);
        panel.add(ratingLabel);

        JTextField ratingText = new JTextField(1);
        ratingText.setBounds(100, 80, 165, 25);
        panel.add(ratingText);
//----------------------------------------------------------------
        JButton buttonOk = new JButton("Ok");
        buttonOk.setBounds(10, 120, 80, 25);
        buttonOk.isDefaultButton();
        panel.add(buttonOk);

        ActionAddDate actiondate = new ActionAddDate(productText, priseText, ratingText, tableModel, list);

        buttonOk.addActionListener(actiondate);


//----------------------------------------------------------------
        JButton buttonExit = new JButton("Clear");
        buttonExit.setBounds(185, 120, 80, 25);
        panel.add(buttonExit);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productText.setText(null);
                priseText.setText(null);
                ratingText.setText(null);
            }
        });
//----------------------------------------------------------------

        this.add(panel);
//         frame.setVisible(true);

    }

    //Обработчик для buttonOk, добавляющий запись в таблицу
    public class ActionAddDate extends TableModelProducts implements ActionListener {

        public ActionAddDate(JTextField productText, JTextField priseText, JTextField ratingText, TableModelProducts model_table, ArrayList<String[]> list) {
            super(list);
            this.productText = productText;
            this.priseText = priseText;
            this.ratingText = ratingText;

        }

        @Override
        public void actionPerformed(ActionEvent e) {


            String productName = productText.getText();
            double prise = Double.parseDouble(priseText.getText());
            int rating = Integer.parseInt(ratingText.getText());

//                boolean userExist = Metods.user_exist(userName, userPassword);

            if ((productText.getText().isEmpty()) || (priseText.getText().isEmpty()) || (ratingText.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Please enter all fields", "Error", JOptionPane.PLAIN_MESSAGE);
            } else {


//                    if ((!flagLoginRegistration) && (userName.equals("Admin"))) { // если кнопку нажали Registration
//                    JOptionPane.showMessageDialog(null, "The name \"Admin\" is reserved", "Error", JOptionPane.PLAIN_MESSAGE);
//                } else if (!(((userName.equals("Admin")) && (userPassword.equals("qaywsx"))) || userExist)) { // если пользователь не существует
//                    JOptionPane.showMessageDialog(null, "User does not exist", "Error", JOptionPane.PLAIN_MESSAGE);
//                } else {
//                    MainForm mainForm = new MainForm(userName);
                productAdd.setName(productName);
                productAdd.setPrise(prise);
                productAdd.setRating(rating);
                Metods.add_product_to_file(productAdd);
                products.add(productAdd);

                list = Metods.from_products_to_arrayList(products);

                TableModelProducts tableModel = new TableModelProducts(list);
                table1.setModel(tableModel);

                tableModel.fireTableDataChanged();

                AddProductForm.this.setVisible(false);
            }

        }

        private JTextField productText;
        private JTextField priseText;
        private JTextField ratingText;
    }


    // Фильтр вводимых данных

    class NumberFilter extends DocumentFilter {

        public void insertString(FilterBypass fb, int pos, String text, AttributeSet attr)
                throws BadLocationException {
            try {
                Double.parseDouble(text); // Введена цифра?
//                Integer.parseInt(text); // Введена цифра?
            } catch (Exception e) {
// Если не цифра, то символ не вводим
                super.insertString(fb, 0, "", attr);
                return;
            }
// Если введена цифра, то заносим ее в поле
            super.insertString(fb, pos, text, attr);
        }
    }
//
//    public String getUserName() {
//        return userName;
//    }
//    public static void main(String[] args) {
//
//        Login mygui = new Login();
//    }
}