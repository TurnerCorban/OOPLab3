package src.Data;

import javax.swing.table.DefaultTableModel;

public class TableModel extends DefaultTableModel {
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }
    @Override
    public int getColumnCount() {
        return 22;
    }
}
