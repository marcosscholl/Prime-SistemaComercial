package prime.renderer;

import prime.bean.Unidade;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class UnidadeListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Unidade) {
            Unidade u = (Unidade) value;
            setText(u.getDescricaoUnidade());
        }
        return this;
    }
}