/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "pedido_det", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "PedidoDet.findAll", query = "SELECT p FROM PedidoDet p"), @NamedQuery(name = "PedidoDet.findByCodPedidoCab", query = "SELECT p FROM PedidoDet p WHERE p.pedidoDetPK.codPedidoCab = :codPedidoCab"), @NamedQuery(name = "PedidoDet.findByCodCotCab", query = "SELECT p FROM PedidoDet p WHERE p.pedidoDetPK.codCotCab = :codCotCab"), @NamedQuery(name = "PedidoDet.findByCodProduto", query = "SELECT p FROM PedidoDet p WHERE p.pedidoDetPK.codProduto = :codProduto"), @NamedQuery(name = "PedidoDet.findByCodReqCab", query = "SELECT p FROM PedidoDet p WHERE p.pedidoDetPK.codReqCab = :codReqCab"), @NamedQuery(name = "PedidoDet.findByQtdePedidoDet", query = "SELECT p FROM PedidoDet p WHERE p.qtdePedidoDet = :qtdePedidoDet"), @NamedQuery(name = "PedidoDet.findByVlrUnitPedidoDet", query = "SELECT p FROM PedidoDet p WHERE p.vlrUnitPedidoDet = :vlrUnitPedidoDet"), @NamedQuery(name = "PedidoDet.findByVlrTotalPedidoDet", query = "SELECT p FROM PedidoDet p WHERE p.vlrTotalPedidoDet = :vlrTotalPedidoDet")})
public class PedidoDet implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoDetPK pedidoDetPK;
    @Column(name = "QTDE_PEDIDO_DET")
    private Integer qtdePedidoDet;
    @Column(name = "VLR_UNIT_PEDIDO_DET")
    private Double vlrUnitPedidoDet;
    @Column(name = "VLR_TOTAL_PEDIDO_DET")
    private Double vlrTotalPedidoDet;
    @JoinColumn(name = "COD_PEDIDO_CAB", referencedColumnName = "COD_PEDIDO_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PedidoCab pedidoCab;

    public PedidoDet() {
    }

    public PedidoDet(PedidoDetPK pedidoDetPK) {
        this.pedidoDetPK = pedidoDetPK;
    }

    public PedidoDet(int codPedidoCab, int codCotCab, String codProduto, int codReqCab) {
        this.pedidoDetPK = new PedidoDetPK(codPedidoCab, codCotCab, codProduto, codReqCab);
    }

    public PedidoDetPK getPedidoDetPK() {
        return pedidoDetPK;
    }

    public void setPedidoDetPK(PedidoDetPK pedidoDetPK) {
        this.pedidoDetPK = pedidoDetPK;
    }

    public Integer getQtdePedidoDet() {
        return qtdePedidoDet;
    }

    public void setQtdePedidoDet(Integer qtdePedidoDet) {
        Integer oldQtdePedidoDet = this.qtdePedidoDet;
        this.qtdePedidoDet = qtdePedidoDet;
        changeSupport.firePropertyChange("qtdePedidoDet", oldQtdePedidoDet, qtdePedidoDet);
    }

    public Double getVlrUnitPedidoDet() {
        return vlrUnitPedidoDet;
    }

    public void setVlrUnitPedidoDet(Double vlrUnitPedidoDet) {
        Double oldVlrUnitPedidoDet = this.vlrUnitPedidoDet;
        this.vlrUnitPedidoDet = vlrUnitPedidoDet;
        changeSupport.firePropertyChange("vlrUnitPedidoDet", oldVlrUnitPedidoDet, vlrUnitPedidoDet);
    }

    public Double getVlrTotalPedidoDet() {
        return vlrTotalPedidoDet;
    }

    public void setVlrTotalPedidoDet(Double vlrTotalPedidoDet) {
        Double oldVlrTotalPedidoDet = this.vlrTotalPedidoDet;
        this.vlrTotalPedidoDet = vlrTotalPedidoDet;
        changeSupport.firePropertyChange("vlrTotalPedidoDet", oldVlrTotalPedidoDet, vlrTotalPedidoDet);
    }

    public PedidoCab getPedidoCab() {
        return pedidoCab;
    }

    public void setPedidoCab(PedidoCab pedidoCab) {
        PedidoCab oldPedidoCab = this.pedidoCab;
        this.pedidoCab = pedidoCab;
        changeSupport.firePropertyChange("pedidoCab", oldPedidoCab, pedidoCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoDetPK != null ? pedidoDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoDet)) {
            return false;
        }
        PedidoDet other = (PedidoDet) object;
        if ((this.pedidoDetPK == null && other.pedidoDetPK != null) || (this.pedidoDetPK != null && !this.pedidoDetPK.equals(other.pedidoDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.PedidoDet[pedidoDetPK=" + pedidoDetPK + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
