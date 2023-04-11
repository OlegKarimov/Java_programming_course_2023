import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MyModelComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
    private List<String> list;
    private String selected;

    public MyModelComboBox() {
        list = new ArrayList<>();
    }

    public void remove(int item) {
        list.remove(item);
        fireContentsChanged(this, 0, list.size());
    }

    public void add(String item) {
        list.add(item);
        fireContentsChanged(this, 0, list.size());
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public String getElementAt(int index) {
        return list.get(index);
    }

    @Override
    public void setSelectedItem(Object item) {
        selected = (String) item;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }
}