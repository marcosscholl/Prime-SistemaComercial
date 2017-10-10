package prime.renderer;

import prime.bean.Cliente;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Administrador
 */
public class ClienteListCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Cliente) {
            Cliente c = (Cliente) value;
            setText(c.getNomeCliente());
        }
        return this;
    }

}
