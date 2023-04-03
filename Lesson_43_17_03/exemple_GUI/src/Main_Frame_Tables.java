import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class Main_Frame_Tables extends JFrame {
    private List<String[]> list;

    public Main_Frame_Tables(List<String[]> list) {
        this.list = list;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Окно с полем для ввода");
        setLayout(new GridBagLayout());

        model_table = new Table_pogoda_Model(list); //передаём ссылку листа и в модель таблицы
        table_pogoda = new JTable(model_table);
        JScrollPane table_pogodaScrollPage = new JScrollPane(table_pogoda);
        table_pogodaScrollPage.setPreferredSize(new Dimension(500, 500)); //установка размеров таблицы

        add(table_pogodaScrollPage, new GridBagConstraints(0, 1, 5, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));

        JButton dellButton = new JButton("Удалить строку");
        //удаляем выделенный элемент
        dellButton.addActionListener((actionEvent) -> {
            int select = table_pogoda.getSelectedRow();
            if (select != -1) {
                list.remove(table_pogoda.getSelectedRow());
                table_pogoda.repaint();
                table_pogoda.revalidate();
            }
        });
        AddButtonAction open_forms_for_add = new AddButtonAction(list);
        JButton open_forms_for_input = new JButton("Открыть форму для ввода");
        open_forms_for_input.addActionListener(open_forms_for_add);
        JButton clearButton = new JButton("Очиститьтаблицу");
        //очищаем таблицу
        clearButton.addActionListener((actionEvent) -> {
            list.clear();
            table_pogoda.clearSelection();
            table_pogoda.repaint();
            table_pogoda.revalidate();
        });


        add(dellButton, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
        add(open_forms_for_input, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
        add(clearButton, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

        //Объект JList. Можно подтянуть из СУБД
        String[] str_goroda = {"Оренбург", "Москва", "Екатеринбург", "Сочи"};
        JList gorodList = new JList(str_goroda);
        JScrollPane gorodScrollPane = new JScrollPane(gorodList);
        gorodScrollPane.setPreferredSize(new Dimension(100, 150));
        add(gorodScrollPane, new GridBagConstraints(0, 3, 1, 7, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));
    }

    public JTable table_pogoda;
    public Table_pogoda_Model model_table;
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 400;

    //Обработчик кнопки open_forms_for_input добавления записи, открывающий форму для заполнения
    public class AddButtonAction extends Table_pogoda_Model implements ActionListener {
        public AddButtonAction(List<String[]> list) {
            super(list);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            FrameInPut frameADD = new FrameInPut(model_table, list);
            frameADD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frameADD.setVisible(true);
        }
    }


}