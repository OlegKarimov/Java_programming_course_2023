import javax.swing.table.AbstractTableModel;
import java.util.List;

class Table_pogoda_Model extends AbstractTableModel {
    private int columnCount = 5;
    private List<String[]> dataArrayList;

    public Table_pogoda_Model(List<String[]> list) {
        this.dataArrayList = list;
    }

    //Возвращает количество строк в таблице
    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    //Возвращает количество колонок в таблице
    @Override
    public int getColumnCount() {
        return columnCount;
    }

    //Возвращает значение определнной ячейки таблицы, по номеру стр и номеру колонки
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    //Установка наименований столбцов
    @Override
    public String getColumnName(int indexColumn) {
        switch (indexColumn) {
            case 0:
                return "#id";
            case 1:
                return "Город";
            case 2:
                return "Температура";
            case 3:
                return "Влажность";
            case 4:
                return "Ветер";
        }
        return "";
    }

}