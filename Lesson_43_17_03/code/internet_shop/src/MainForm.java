import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainForm extends JFrame {

    private String userName;
    TableModelProducts tableModel;
    JTable table1;
    JScrollPane scrollPane;

    ArrayList<Product> arrayListProducts = new ArrayList<>(); // список товаров
    ArrayList<Category> arrayListCategory = new ArrayList<Category>(); // список категорий

    Product product = new Product();
    ArrayList<String[]> list;
    String[] listComboBox = {"All category"};

    public MainForm(String userName) {

//        JPanel panel = new JPanel();
// -----------------------------------------------------------

        arrayListProducts = Metods.read_products_from_file(); // Сделать проверку на существование файла и продуктов!!!!!!!
        if (!arrayListProducts.isEmpty()) {
            list = Metods.from_products_to_arrayList(arrayListProducts);
        }
// -----------------------------------------------------------

        arrayListCategory = Metods.read_category_from_file(); // Сделать проверку на существование файла и каталогов!!!!!!!
        if (!arrayListCategory.isEmpty()) {
            listComboBox = Metods.from_namesCategory_to_arrayList(arrayListCategory);
        }

        this.userName = userName;
        this.setSize(850, 650);
        this.setLocation(150, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Shop");

        JPanel panel = new JPanel();
        panel.setLayout(null);
//----------------------------------------------------------------
        JLabel label1 = new JLabel(userName + ", welcome to the Shop");
        label1.setBounds(10, 20, 400, 25);
        panel.add(label1);
//----------------------------------------------------------------
        JLabel label2 = new JLabel("Make your choice:");
        label2.setBounds(10, 60, 170, 25);
        panel.add(label2);
//----------------------------------------------------------------
        JButton showProduct = new JButton("Show all Products");
        showProduct.setBounds(10, 100, 170, 25);
        panel.add(showProduct);
        showProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arrayListProducts = Metods.read_products_from_file(); // Сделать проверку на существование файла и продуктов!!!!!!!
                list = Metods.from_products_to_arrayList(arrayListProducts);

                TableModelProducts tableModel = new TableModelProducts(list);
                table1.setModel(tableModel);

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//                ArrayList<Product> arrayProducts = new ArrayList<>();

                tableModel.fireTableDataChanged();

                table1.revalidate();
                table1.repaint();

//                int j = 1;
//                for (Product i : arrayProducts) {
//
//                    tableModel.addDate( //добавляем строку таблицы в виде массива строк
//                            new String[]{Integer.toString(j), i.getName(), Double.toString(i.getPrise()), Integer.toString(i.getRating())});
//                    j++;
//                }
//                table1.revalidate();
            }
        });
//----------------------------------------------------------------
//        JButton showCategory = new JButton("Show Category");
//        showCategory.setBounds(10, 140, 150, 25);
//        panel.add(showCategory);

// ----------------------------------------------------------------
        JLabel label3 = new JLabel("Choice Products:");
        label3.setBounds(10, 140, 180, 25);
        panel.add(label3);
// ----------------------------------------------------------------


        JComboBox comboBox = new JComboBox(listComboBox);
        comboBox.setEditable(false);
        comboBox.setBounds(10, 160, 180, 25);
        panel.add(comboBox);


//----------------------------------------------------------------
        JButton addProduct = new JButton("Add Product");
        addProduct.setBounds(10, 200, 170, 25);
        panel.add(addProduct);
        addProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddProductForm addProductForm = new AddProductForm(table1, tableModel, list, arrayListProducts);
                addProductForm.setVisible(true);
                //       MainForm.this.setVisible(false);
            }
        });
//----------------------------------------------------------------
        JButton addCategory = new JButton("Add Category");
        addCategory.setBounds(10, 240, 170, 25);
        panel.add(addCategory);
        addCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddCategoryForm addCategoryForm = new AddCategoryForm(listComboBox, arrayListCategory, comboBox);
                addCategoryForm.setVisible(true);
                //       MainForm.this.setVisible(false);
            }
        });
//----------------------------------------------------------------
        JButton dellProduct = new JButton("Dell Product");
        dellProduct.setBounds(10, 280, 170, 25);
        panel.add(dellProduct);
        dellProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int select = table1.getSelectedRow();
                if ((select >= 0) && (select < list.size())) {
//                    TableModelProducts tableModel = new TableModelProducts();
//                    table1.setModel(tableModel);
//                    arrayProducts = Metods.read_products_from_file(); // Сделать проверку на существование файла и продуктов!!!!!!!
                    arrayListProducts.remove(select);
                    Metods.save_arrayProducts_to_file(arrayListProducts);
                    list.remove(select);
                    tableModel.fireTableDataChanged();
                    table1.repaint();
                    table1.revalidate();

                }
            }
        });


//----------------------------------------------------------------
        JButton dellCategory = new JButton("Dell Category");
        dellCategory.setBounds(10, 320, 170, 25);
        panel.add(dellCategory);
//----------------------------------------------------------------

//        TableModelProducts tableModel = new TableModelProducts();
//        JTable table1 = new JTable(tableModel);
//        JScrollPane scrollPane = new JScrollPane(table1);

        tableModel = new TableModelProducts(list);
        table1 = new JTable(tableModel);
        scrollPane = new JScrollPane(table1);
        scrollPane.setPreferredSize(new Dimension(600, 540));
        scrollPane.setBounds(200, 60, 600, 540);

//        ArrayList<Product> arrayProductsBuf = Metods.read_products_from_file(); // Сделать проверку на существование файла и продуктов!!!!!!!
//        int j = 1;
//        for (Product i : arrayProductsBuf) {
//
//            tableModel.addDate( //добавляем строку таблицы в виде массива строк
//                    new String[]{Integer.toString(j), i.getName(), Double.toString(i.getPrise()), Integer.toString(i.getRating())});
//            j++;
//        }


        panel.add(scrollPane);


        //   this.add(panel);
//        this.setContentPane(panel);
//        panel.add(scrollPane);
//        this.setContentPane(scrollPane);
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