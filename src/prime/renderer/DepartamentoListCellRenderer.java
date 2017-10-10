package prime.renderer;

import prime.bean.Departamento;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class DepartamentoListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Departamento) {
            Departamento d = (Departamento) value;
            setText(d.getNomeDepartamento());
        }
        return this;
    }
}