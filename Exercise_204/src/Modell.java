
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modell extends AbstractTableModel {

    private ArrayList<Entry> entries = new ArrayList<>();
    private static String[] colNames
            = {"Bezeichnung", "AK", "inbetr.nahme", "ND", "bish.ND", "Afa bisher", "Wert vor...", "Afa d. J.", "BW 31.12"};

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    @Override
    public int getRowCount() {
        return entries.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Entry e = entries.get(rowIndex);
        return e;
    }

    private void add(Entry e) {
        entries.add(e);
    }

}
