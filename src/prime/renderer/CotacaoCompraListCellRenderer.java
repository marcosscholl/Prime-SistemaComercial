package prime.renderer;


import prime.bean.Fornecedor;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class CotacaoCompraListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Fornecedor) {
            Fornecedor f = (Fornecedor) value;
            setText(f.getNomeFornecedor());
        }
        return this;
    }
}