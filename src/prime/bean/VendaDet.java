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
@Table(name = "venda_det", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "VendaDet.findAll", query = "SELECT v FROM VendaDet v"), @NamedQuery(name = "VendaDet.findByCodVendaCab", query = "SELECT v FROM VendaDet v WHERE v.vendaDetPK.codVendaCab = :codVendaCab"), @NamedQuery(name = "VendaDet.findByCodProduto", query = "SELECT v FROM VendaDet v WHERE v.vendaDetPK.codProduto = :codProduto"), @NamedQuery(name = "VendaDet.findByQtdeVendaDet", query = "SELECT v FROM VendaDet v WHERE v.qtdeVendaDet = :qtdeVendaDet"), @NamedQuery(name = "VendaDet.findByVlrUnitVendaDet", query = "SELECT v FROM VendaDet v WHERE v.vlrUnitVendaDet = :vlrUnitVendaDet"), @NamedQuery(name = "VendaDet.findByVlrTotalVendaDet", query = "SELECT v FROM VendaDet v WHERE v.vlrTotalVendaDet = :vlrTotalVendaDet")})
public class VendaDet implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId 
    protected VendaDetPK vendaDetPK;
    @Column(name = "QTDE_VENDA_DET")
    private Integer qtdeVendaDet;
    @Column(name = "VLR_UNIT_VENDA_DET")
    private Double vlrUnitVendaDet;
    @Column(name = "VLR_TOTAL_VENDA_DET")
    private Double vlrTotalVendaDet;
    @JoinColumn(name = "COD_VENDA_CAB", referencedColumnName = "COD_VENDA_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private VendaCab vendaCab;

    @Transient
    private String descricaoProduto;

    public void setDescricaoProduto(String d) {
        this.descricaoProduto = d;
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public VendaDet() {
    }

    public VendaDet(VendaDetPK vendaDetPK) {
        this.vendaDetPK = vendaDetPK;
    }

    public VendaDet(int codVendaCab, String codProduto) {
        this.vendaDetPK = new VendaDetPK(codVendaCab, codProduto);
    }

    public VendaDetPK getVendaDetPK() {
        return vendaDetPK;
    }

    public void setVendaDetPK(VendaDetPK vendaDetPK) {
        this.vendaDetPK = vendaDetPK;
    }

    public Integer getQtdeVendaDet() {
        return qtdeVendaDet;
    }

    public void setQtdeVendaDet(Integer qtdeVendaDet) {
        Integer oldQtdeVendaDet = this.qtdeVendaDet;
        this.qtdeVendaDet = qtdeVendaDet;
        changeSupport.firePropertyChange("qtdeVendaDet", oldQtdeVendaDet, qtdeVendaDet);
    }

    public Double getVlrUnitVendaDet() {
        return vlrUnitVendaDet;
    }

    public void setVlrUnitVendaDet(Double vlrUnitVendaDet) {
        Double oldVlrUnitVendaDet = this.vlrUnitVendaDet;
        this.vlrUnitVendaDet = vlrUnitVendaDet;
        changeSupport.firePropertyChange("vlrUnitVendaDet", oldVlrUnitVendaDet, vlrUnitVendaDet);
    }

    public Double getVlrTotalVendaDet() {
        return vlrTotalVendaDet;
    }

    public void setVlrTotalVendaDet(Double vlrTotalVendaDet) {
        Double oldVlrTotalVendaDet = this.vlrTotalVendaDet;
        this.vlrTotalVendaDet = vlrTotalVendaDet;
        changeSupport.firePropertyChange("vlrTotalVendaDet", oldVlrTotalVendaDet, vlrTotalVendaDet);
    }

    public VendaCab getVendaCab() {
        return vendaCab;
    }

    public void setVendaCab(VendaCab vendaCab) {
        VendaCab oldVendaCab = this.vendaCab;
        this.vendaCab = vendaCab;
        changeSupport.firePropertyChange("vendaCab", oldVendaCab, vendaCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendaDetPK != null ? vendaDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendaDet)) {
            return false;
        }
        VendaDet other = (VendaDet) object;
        if ((this.vendaDetPK == null && other.vendaDetPK != null) || (this.vendaDetPK != null && !this.vendaDetPK.equals(other.vendaDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.VendaDet[vendaDetPK=" + vendaDetPK + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
