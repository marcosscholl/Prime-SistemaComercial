package converter;


import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import org.jdesktop.beansbinding.Converter;

/**
 * Binding converter between String and regex RowFilter (encapsulated by RowSorterToStringConverter).
 *  */
public class RowSorterToStringConverter extends Converter {

    private JTable table;

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    @Override
    public Object convertForward(Object value) {
        return value.toString();
    }

    @Override
    public Object convertReverse(Object mask) {
        TableRowSorter sorter = new TableRowSorter(table.getModel());

        // o seguinte comando torna o filtro case-sensitive. se você
        //quisre o fitro case-insensitive, descomente a linha abaixo e 
        //comente as 7 linhas abaixo dela
        //sorter.setRowFilter(RowFilter.regexFilter(".*" + mask + ".*"));

        //as seguintes 7 linhas criam um filtro case-sensitie. se você deseja
        //um filtro case-insensitive, comente essas linhas e descomente a linha
        //acima
        String m = mask.toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.length(); i++) {
            char c = m.charAt(i);
            sb.append('[').append(Character.toLowerCase(c)).append(Character.toUpperCase(c)).append(']');
        }
        sorter.setRowFilter(RowFilter.regexFilter(".*" + sb + ".*"));
        return sorter;
    }
}