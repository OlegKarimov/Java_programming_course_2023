import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.event.*;
import java.util.ArrayList;

public class AddCategoryForm extends JFrame {
    //private static JTextField userText;
    //private static JPasswordField passwordText;

    //    private String productName;
//    public boolean flagLoginRegistration;
//    private Product productAdd = new Product();
//    ArrayList<Product> products;
//    private TableModelProducts tableModel;
//    private ArrayList<String[]> list;
//    private JTable table1;
    private String[] listComboBox;
    private ArrayList<Category> arrayListCategory;
    private JComboBox comboBox;
    private MyModelComboBox modelComboBox;


    public AddCategoryForm(String[] listComboBox, ArrayList<Category> arrayListCategory, JComboBox comboBox, MyModelComboBox modelComboBox) {
//        JPanel panel = new JPanel();
//        JFrame frame = new JFrame();

//        this.flagLoginRegistration = flagLoginRegistration;
//        this.list = list;
//        this.products = products;
//        this.tableModel = tableModel;
//        this.table1 = table1;
        this.modelComboBox = modelComboBox;
        this.listComboBox = listComboBox;
        this.arrayListCategory = arrayListCategory;
        this.comboBox = comboBox;

        this.setSize(350, 300);
        this.setLocation(350, 300);
//        if (flagLoginRegistration) {
//            this.setTitle("Sign in");
//        } else this.setTitle("Registration");

        this.setTitle("Add name Category");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
//        frame.setTitle("Sign in");
        JPanel panel = new JPanel();
        panel.setLayout(null);
//----------------------------------------------------------------
        JLabel categoryLabel = new JLabel("Category name:");
        categoryLabel.setBounds(10, 20, 150, 25);
        panel.add(categoryLabel);

        JTextField categoryText = new JTextField(20);
        categoryText.setBounds(100, 20, 165, 25);
        panel.add(categoryText);
//        productLabel.setLabelFor(productText);
//----------------------------------------------------------------
        JButton buttonOk = new JButton("Ok");
        buttonOk.setBounds(10, 120, 80, 25);
        buttonOk.isDefaultButton();
        panel.add(buttonOk);

        ActionAddDate actiondate = new ActionAddDate(categoryText, arrayListCategory, comboBox, modelComboBox);
//        listComboBox
        buttonOk.addActionListener(actiondate);


//----------------------------------------------------------------
        JButton buttonExit = new JButton("Clear");
        buttonExit.setBounds(185, 120, 80, 25);
        panel.add(buttonExit);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                categoryText.setText(null);
            }
        });
//----------------------------------------------------------------

        this.add(panel);
//         frame.setVisible(true);

    }

    //Обработчик для buttonOk, добавляющий запись категории
    public class ActionAddDate implements ActionListener {

        public ActionAddDate(JTextField categoryText, ArrayList<Category> arrayListCategory, JComboBox comboBox, MyModelComboBox modelComboBox) {
            this.categoryText = categoryText;
            this.modelComboBox = modelComboBox;
            this.arrayListCategory = arrayListCategory;
//            String[] listComboBox
//            this.listComboBox = listComboBox;
            this.comboBox = comboBox;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            String categoryName = categoryText.getText();
//            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//                boolean categoryExist = Metods.user_exist(userName, userPassword);
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            if (categoryText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the category name field", "Error", JOptionPane.PLAIN_MESSAGE);
            } else {
                String comboBoxItem = categoryText.getText();
//                comboBox.addItem(comboBoxItem);
//                listComboBox

                modelComboBox.add(comboBoxItem);
                Product product = new Product();
                ArrayList<Product> productArrayList = new ArrayList<>();
                product.setName("-1");
                product.setPrise(0);
                product.setRating(0);
                productArrayList.add(product);
                Category bufCategory = new Category();
                bufCategory.setName(comboBoxItem);
                bufCategory.setProducts(productArrayList);
                arrayListCategory.add(bufCategory);
                Metods.add_category_to_file(bufCategory);

//                productAdd.setName(categoryName);
//                productAdd.setPrise(prise);
//                productAdd.setRating(rating);
//                Metods.add_product_to_file(productAdd);
//                products.add(productAdd);
//
//                list = Metods.from_products_to_arrayList(products);
//
//                TableModelProducts tableModel = new TableModelProducts(list);
//                table1.setModel(tableModel);
//
//                tableModel.fireTableDataChanged();

                AddCategoryForm.this.setVisible(false);
            }

        }

        private JTextField categoryText;
        private ArrayList<Category> arrayListCategory;
        //        private String[] listComboBox;
        private JComboBox comboBox;
        private MyModelComboBox modelComboBox;
    }

}