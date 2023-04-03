import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

//Форма для добавления записи
class FrameInPut extends JFrame {
    private List<String[]> list;

    public FrameInPut(Table_pogoda_Model model_table, List<String[]> list) {
        this.list = list;
        this.model_table = model_table;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Окно с полем для ввода");
        setLayout(new BorderLayout());
        JTextField idTextField = new JTextField(5);
        JTextField gorodTextField = new JTextField(10);
        JTextField t_TextField = new JTextField(10);
        JTextField vlajnosteTextField = new JTextField(10);
        JTextField veterTextField = new JTextField(5);
        JPanel panelTextField = new JPanel();
        panelTextField.add(idTextField);
        panelTextField.add(gorodTextField);
        panelTextField.add(t_TextField);
        panelTextField.add(vlajnosteTextField);
        panelTextField.add(veterTextField);
        add(panelTextField, BorderLayout.NORTH);

        JButton ADDbutton = new JButton("Добавить");
        ActionAddDate actiondate = new ActionAddDate(idTextField, gorodTextField, t_TextField, vlajnosteTextField, veterTextField, model_table, list);
        add(ADDbutton, BorderLayout.SOUTH);
        ADDbutton.addActionListener(actiondate);

    }

    //Обработчик для ADDbutton, добавляющий запись в таблицу
    public class ActionAddDate extends Table_pogoda_Model implements ActionListener {

        public ActionAddDate(JTextField idTextField, JTextField gorodTextField, JTextField t_TextField, JTextField vlajnosteTextField, JTextField veterTextField, Table_pogoda_Model model_table, List<String[]> list) {
            super(list);
            this.idTextField = idTextField;
            this.gorodTextField = gorodTextField;
            this.t_TextField = t_TextField;
            this.vlajnosteTextField = vlajnosteTextField;
            this.veterTextField = veterTextField;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String str[] = new String[getColumnCount()];
            str[0] = idTextField.getText();
            str[1] = gorodTextField.getText();
            str[2] = t_TextField.getText();
            str[3] = vlajnosteTextField.getText();
            str[4] = veterTextField.getText();
            list.add(str);
            model_table.fireTableDataChanged(); // Обновит таблицу
        }

        private JTextField idTextField;
        private JTextField gorodTextField;
        private JTextField t_TextField;
        private JTextField vlajnosteTextField;
        private JTextField veterTextField;
    }

    private Table_pogoda_Model model_table;
    public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 150;
}