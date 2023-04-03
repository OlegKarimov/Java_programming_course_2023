import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TableModelProducts extends AbstractTableModel {
    //public class TableModelProducts extends DefaultTableModel {
    private int columnCount = 4;

    private ArrayList<String[]> list;

    public TableModelProducts(ArrayList<String[]> list) {
        this.list = list;
        list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(new String[getColumnCount()]);

        }
    }


    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "№";
            case 1:
                return "Name";
            case 2:
                return "Prise";
            case 3:
                return "Rating";
        }
        return "";
    }

    public void addDate(String[] row) { // добавление строки в таблицу

        String[] rowTable = new String[getColumnCount()];
        rowTable = row;
        list.add(rowTable);

    }

    public void removeRow(int row) {
        list.remove(row);

    }


    @Override
    public int getRowCount() { // возвращает кол-во строк в таблице
        return list.size();
    }

    @Override
    public int getColumnCount() { // возвращает кол-во колонок в таблице
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // возвращает значение определенной ячейки в таблице
        String[] rows = list.get(rowIndex);
        return rows[columnIndex];
    }
}
