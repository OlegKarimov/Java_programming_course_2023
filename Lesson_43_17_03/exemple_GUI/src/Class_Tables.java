import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Class_Tables {
    private static List<String[]> list = new ArrayList<>();

    public static void main(String[] args) {
        Main_Frame_Tables frame = new Main_Frame_Tables(list);
        addElementsToList(list);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * Добавляем города в лист
     *
     * @param list - лист типа String[]
     */
    public static void addElementsToList(List<String[]> list) {
        list.add(new String[]{"0", "Orenburg", "13", "45", "C"});
        list.add(new String[]{"1", "Moscow", "13", "0", "C"});
        list.add(new String[]{"2", "S-Petersburg", "-3", "45", "C"});
        list.add(new String[]{"3", "Volgograd", "2", "65", "C"});
    }
}


