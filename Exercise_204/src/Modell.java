
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modell extends AbstractTableModel {

    private ArrayList<Entry> entries = new ArrayList<>();
    private ArrayList<Entry> filtered = new ArrayList<>();
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
        fireTableRowsInserted(entries.size()-1,entries.size()-1);
    }
    
    public void filter(LocalDate year)
    {
        filtered.clear();
        for (Entry e: entries) {
            if(year.getYear() == e.getIn().getYear())
        {
            filtered.add(e);
            fireTableRowsInserted(filtered.size()-1, filtered.size()-1);
        }
        }

    }

}
