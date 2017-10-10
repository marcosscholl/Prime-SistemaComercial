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
@Table(name = "orc_det", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "OrcDet.findAll", query = "SELECT o FROM OrcDet o"), @NamedQuery(name = "OrcDet.findByCodOrcCab", query = "SELECT o FROM OrcDet o WHERE o.orcDetPK.codOrcCab = :codOrcCab"), @NamedQuery(name = "OrcDet.findByCodProduto", query = "SELECT o FROM OrcDet o WHERE o.orcDetPK.codProduto = :codProduto"), @NamedQuery(name = "OrcDet.findByQtdeOrcDet", query = "SELECT o FROM OrcDet o WHERE o.qtdeOrcDet = :qtdeOrcDet"), @NamedQuery(name = "OrcDet.findByVlrUnitOrcDet", query = "SELECT o FROM OrcDet o WHERE o.vlrUnitOrcDet = :vlrUnitOrcDet"), @NamedQuery(name = "OrcDet.findByVlrTotalOrcDet", query = "SELECT o FROM OrcDet o WHERE o.vlrTotalOrcDet = :vlrTotalOrcDet")})
public class OrcDet implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrcDetPK orcDetPK;
    @Column(name = "QTDE_ORC_DET")
    private Integer qtdeOrcDet;
    @Column(name = "VLR_UNIT_ORC_DET")
    private Double vlrUnitOrcDet;
    @Column(name = "VLR_TOTAL_ORC_DET")
    private Double vlrTotalOrcDet;
    @JoinColumn(name = "COD_ORC_CAB", referencedColumnName = "COD_ORC_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrcCab orcCab;

    public OrcDet() {
    }

    public OrcDet(OrcDetPK orcDetPK) {
        this.orcDetPK = orcDetPK;
    }

    public OrcDet(int codOrcCab, String codProduto) {
        this.orcDetPK = new OrcDetPK(codOrcCab, codProduto);
    }

    public OrcDetPK getOrcDetPK() {
        return orcDetPK;
    }

    public void setOrcDetPK(OrcDetPK orcDetPK) {
        this.orcDetPK = orcDetPK;
    }

    public Integer getQtdeOrcDet() {
        return qtdeOrcDet;
    }

    public void setQtdeOrcDet(Integer qtdeOrcDet) {
        Integer oldQtdeOrcDet = this.qtdeOrcDet;
        this.qtdeOrcDet = qtdeOrcDet;
        changeSupport.firePropertyChange("qtdeOrcDet", oldQtdeOrcDet, qtdeOrcDet);
    }

    public Double getVlrUnitOrcDet() {
        return vlrUnitOrcDet;
    }

    public void setVlrUnitOrcDet(Double vlrUnitOrcDet) {
        Double oldVlrUnitOrcDet = this.vlrUnitOrcDet;
        this.vlrUnitOrcDet = vlrUnitOrcDet;
        changeSupport.firePropertyChange("vlrUnitOrcDet", oldVlrUnitOrcDet, vlrUnitOrcDet);
    }

    public Double getVlrTotalOrcDet() {
        return vlrTotalOrcDet;
    }

    public void setVlrTotalOrcDet(Double vlrTotalOrcDet) {
        Double oldVlrTotalOrcDet = this.vlrTotalOrcDet;
        this.vlrTotalOrcDet = vlrTotalOrcDet;
        changeSupport.firePropertyChange("vlrTotalOrcDet", oldVlrTotalOrcDet, vlrTotalOrcDet);
    }

    public OrcCab getOrcCab() {
        return orcCab;
    }

    public void setOrcCab(OrcCab orcCab) {
        OrcCab oldOrcCab = this.orcCab;
        this.orcCab = orcCab;
        changeSupport.firePropertyChange("orcCab", oldOrcCab, orcCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orcDetPK != null ? orcDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrcDet)) {
            return false;
        }
        OrcDet other = (OrcDet) object;
        if ((this.orcDetPK == null && other.orcDetPK != null) || (this.orcDetPK != null && !this.orcDetPK.equals(other.orcDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.OrcDet[orcDetPK=" + orcDetPK + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
