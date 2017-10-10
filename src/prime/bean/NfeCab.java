/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prime.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "nfe_cab", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "NfeCab.findAll", query = "SELECT n FROM NfeCab n"), @NamedQuery(name = "NfeCab.findByNumeroNfeCab", query = "SELECT n FROM NfeCab n WHERE n.numeroNfeCab = :numeroNfeCab"), @NamedQuery(name = "NfeCab.findByCodCfop", query = "SELECT n FROM NfeCab n WHERE n.codCfop = :codCfop"), @NamedQuery(name = "NfeCab.findByCodFornecedor", query = "SELECT n FROM NfeCab n WHERE n.codFornecedor = :codFornecedor"), @NamedQuery(name = "NfeCab.findByEmissaoNfeCab", query = "SELECT n FROM NfeCab n WHERE n.emissaoNfeCab = :emissaoNfeCab"), @NamedQuery(name = "NfeCab.findByEntradaNfeCab", query = "SELECT n FROM NfeCab n WHERE n.entradaNfeCab = :entradaNfeCab"), @NamedQuery(name = "NfeCab.findByTotalNfeCab", query = "SELECT n FROM NfeCab n WHERE n.totalNfeCab = :totalNfeCab")})
public class NfeCab implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_NFE_CAB")
    private Integer numeroNfeCab;
    @Column(name = "COD_CFOP")
    private Integer codCfop;
    @Column(name = "COD_FORNECEDOR")
    private Integer codFornecedor;
    @Column(name = "EMISSAO_NFE_CAB")
    @Temporal(TemporalType.DATE)
    private Date emissaoNfeCab;
    @Column(name = "ENTRADA_NFE_CAB")
    @Temporal(TemporalType.DATE)
    private Date entradaNfeCab;
    @Column(name = "TOTAL_NFE_CAB")
    private Double totalNfeCab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nfeCab")
    private List<NfeDet> nfeDetCollection;

    public NfeCab() {
    }

    public NfeCab(Integer numeroNfeCab) {
        this.numeroNfeCab = numeroNfeCab;
    }

    public Integer getNumeroNfeCab() {
        return numeroNfeCab;
    }

    public void setNumeroNfeCab(Integer numeroNfeCab) {
        Integer oldNumeroNfeCab = this.numeroNfeCab;
        this.numeroNfeCab = numeroNfeCab;
        changeSupport.firePropertyChange("numeroNfeCab", oldNumeroNfeCab, numeroNfeCab);
    }

    public Integer getCodCfop() {
        return codCfop;
    }

    public void setCodCfop(Integer codCfop) {
        Integer oldCodCfop = this.codCfop;
        this.codCfop = codCfop;
        changeSupport.firePropertyChange("codCfop", oldCodCfop, codCfop);
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public Date getEmissaoNfeCab() {
        return emissaoNfeCab;
    }

    public void setEmissaoNfeCab(Date emissaoNfeCab) {
        Date oldEmissaoNfeCab = this.emissaoNfeCab;
        this.emissaoNfeCab = emissaoNfeCab;
        changeSupport.firePropertyChange("emissaoNfeCab", oldEmissaoNfeCab, emissaoNfeCab);
    }

    public Date getEntradaNfeCab() {
        return entradaNfeCab;
    }

    public void setEntradaNfeCab(Date entradaNfeCab) {
        Date oldEntradaNfeCab = this.entradaNfeCab;
        this.entradaNfeCab = entradaNfeCab;
        changeSupport.firePropertyChange("entradaNfeCab", oldEntradaNfeCab, entradaNfeCab);
    }

    public Double getTotalNfeCab() {
        return totalNfeCab;
    }

    public void setTotalNfeCab(Double totalNfeCab) {
        Double oldTotalNfeCab = this.totalNfeCab;
        this.totalNfeCab = totalNfeCab;
        changeSupport.firePropertyChange("totalNfeCab", oldTotalNfeCab, totalNfeCab);
    }

    public List<NfeDet> getNfeDetCollection() {
        return nfeDetCollection;
    }

    public void setNfeDetCollection(List<NfeDet> nfeDetCollection) {
        this.nfeDetCollection = nfeDetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroNfeCab != null ? numeroNfeCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NfeCab)) {
            return false;
        }
        NfeCab other = (NfeCab) object;
        if ((this.numeroNfeCab == null && other.numeroNfeCab != null) || (this.numeroNfeCab != null && !this.numeroNfeCab.equals(other.numeroNfeCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.estoque.NfeCab[numeroNfeCab=" + numeroNfeCab + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
