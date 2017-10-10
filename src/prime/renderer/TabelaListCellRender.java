/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.renderer;

import java.awt.Color;
import java.awt.Component;
import javax.swing.CellEditor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Administrador
 */
public class TabelaListCellRender extends DefaultTableCellRenderer implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, 1);
        //Aqui você escreve o código que faz o setBackground para a cor desejada. Note que vc tem o valor da célula e a linha e coluna dela.

                if (column == 1) {
                    setBackground(Color.RED);
                } else {
                    setBackground(null);
                }

        return this;
    }
}