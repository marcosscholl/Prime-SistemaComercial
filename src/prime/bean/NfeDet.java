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
@Table(name = "nfe_det", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "NfeDet.findAll", query = "SELECT n FROM NfeDet n"), @NamedQuery(name = "NfeDet.findByCodProduto", query = "SELECT n FROM NfeDet n WHERE n.nfeDetPK.codProduto = :codProduto"), @NamedQuery(name = "NfeDet.findByNumeroNfeCab", query = "SELECT n FROM NfeDet n WHERE n.nfeDetPK.numeroNfeCab = :numeroNfeCab"), @NamedQuery(name = "NfeDet.findByQtdeNfeDet", query = "SELECT n FROM NfeDet n WHERE n.qtdeNfeDet = :qtdeNfeDet"), @NamedQuery(name = "NfeDet.findByVlrUnitNfeDet", query = "SELECT n FROM NfeDet n WHERE n.vlrUnitNfeDet = :vlrUnitNfeDet"), @NamedQuery(name = "NfeDet.findByVlrTotalNfeDet", query = "SELECT n FROM NfeDet n WHERE n.vlrTotalNfeDet = :vlrTotalNfeDet")})
public class NfeDet implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NfeDetPK nfeDetPK;
    @Column(name = "QTDE_NFE_DET")
    private Integer qtdeNfeDet;
    @Column(name = "VLR_UNIT_NFE_DET")
    private Double vlrUnitNfeDet;
    @Column(name = "VLR_TOTAL_NFE_DET")
    private Double vlrTotalNfeDet;
    @JoinColumn(name = "NUMERO_NFE_CAB", referencedColumnName = "NUMERO_NFE_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NfeCab nfeCab;

    public NfeDet() {
    }

    public NfeDet(NfeDetPK nfeDetPK) {
        this.nfeDetPK = nfeDetPK;
    }

    public NfeDet(String codProduto, int numeroNfeCab) {
        this.nfeDetPK = new NfeDetPK(codProduto, numeroNfeCab);
    }

    public NfeDetPK getNfeDetPK() {
        return nfeDetPK;
    }

    public void setNfeDetPK(NfeDetPK nfeDetPK) {
        this.nfeDetPK = nfeDetPK;
    }

    public Integer getQtdeNfeDet() {
        return qtdeNfeDet;
    }

    public void setQtdeNfeDet(Integer qtdeNfeDet) {
        Integer oldQtdeNfeDet = this.qtdeNfeDet;
        this.qtdeNfeDet = qtdeNfeDet;
        changeSupport.firePropertyChange("qtdeNfeDet", oldQtdeNfeDet, qtdeNfeDet);
    }

    public Double getVlrUnitNfeDet() {
        return vlrUnitNfeDet;
    }

    public void setVlrUnitNfeDet(Double vlrUnitNfeDet) {
        Double oldVlrUnitNfeDet = this.vlrUnitNfeDet;
        this.vlrUnitNfeDet = vlrUnitNfeDet;
        changeSupport.firePropertyChange("vlrUnitNfeDet", oldVlrUnitNfeDet, vlrUnitNfeDet);
    }

    public Double getVlrTotalNfeDet() {
        return vlrTotalNfeDet;
    }

    public void setVlrTotalNfeDet(Double vlrTotalNfeDet) {
        Double oldVlrTotalNfeDet = this.vlrTotalNfeDet;
        this.vlrTotalNfeDet = vlrTotalNfeDet;
        changeSupport.firePropertyChange("vlrTotalNfeDet", oldVlrTotalNfeDet, vlrTotalNfeDet);
    }

    public NfeCab getNfeCab() {
        return nfeCab;
    }

    public void setNfeCab(NfeCab nfeCab) {
        NfeCab oldNfeCab = this.nfeCab;
        this.nfeCab = nfeCab;
        changeSupport.firePropertyChange("nfeCab", oldNfeCab, nfeCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nfeDetPK != null ? nfeDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NfeDet)) {
            return false;
        }
        NfeDet other = (NfeDet) object;
        if ((this.nfeDetPK == null && other.nfeDetPK != null) || (this.nfeDetPK != null && !this.nfeDetPK.equals(other.nfeDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.estoque.NfeDet[nfeDetPK=" + nfeDetPK + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
