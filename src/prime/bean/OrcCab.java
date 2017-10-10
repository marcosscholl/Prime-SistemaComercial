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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "orc_cab", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "OrcCab.findAll", query = "SELECT o FROM OrcCab o"), @NamedQuery(name = "OrcCab.findByCodOrcCab", query = "SELECT o FROM OrcCab o WHERE o.codOrcCab = :codOrcCab"), @NamedQuery(name = "OrcCab.findByCodCliente", query = "SELECT o FROM OrcCab o WHERE o.codCliente = :codCliente"), @NamedQuery(name = "OrcCab.findByCodFuncionario", query = "SELECT o FROM OrcCab o WHERE o.codFuncionario = :codFuncionario"), @NamedQuery(name = "OrcCab.findByDataOrcCab", query = "SELECT o FROM OrcCab o WHERE o.dataOrcCab = :dataOrcCab"), @NamedQuery(name = "OrcCab.findByVlrOrcCab", query = "SELECT o FROM OrcCab o WHERE o.vlrOrcCab = :vlrOrcCab")})
public class OrcCab implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_ORC_CAB")
    private Integer codOrcCab;
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Column(name = "COD_FUNCIONARIO")
    private Integer codFuncionario;
    @Column(name = "DATA_ORC_CAB")
    //@Temporal(TemporalType.DATE)
    private /*Date*/String dataOrcCab;
    @Column(name = "VLR_ORC_CAB")
    private Double vlrOrcCab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orcCab")
    private List<OrcDet> orcDetCollection;

    public OrcCab() {
    }

    public OrcCab(Integer codOrcCab) {
        this.codOrcCab = codOrcCab;
    }

    public Integer getCodOrcCab() {
        return codOrcCab;
    }

    public void setCodOrcCab(Integer codOrcCab) {
        Integer oldCodOrcCab = this.codOrcCab;
        this.codOrcCab = codOrcCab;
        changeSupport.firePropertyChange("codOrcCab", oldCodOrcCab, codOrcCab);
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        Integer oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    public /*Date*/String getDataOrcCab() {
        return dataOrcCab;
    }

    public void setDataOrcCab(/*Date*/String dataOrcCab) {
        /*Date*/String oldDataOrcCab = this.dataOrcCab;
        this.dataOrcCab = dataOrcCab;
        changeSupport.firePropertyChange("dataOrcCab", oldDataOrcCab, dataOrcCab);
    }

    public Double getVlrOrcCab() {
        return vlrOrcCab;
    }

    public void setVlrOrcCab(Double vlrOrcCab) {
        Double oldVlrOrcCab = this.vlrOrcCab;
        this.vlrOrcCab = vlrOrcCab;
        changeSupport.firePropertyChange("vlrOrcCab", oldVlrOrcCab, vlrOrcCab);
    }

    public List<OrcDet> getOrcDetCollection() {
        return orcDetCollection;
    }

    public void setOrcDetCollection(List<OrcDet> orcDetCollection) {
        this.orcDetCollection = orcDetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codOrcCab != null ? codOrcCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrcCab)) {
            return false;
        }
        OrcCab other = (OrcCab) object;
        if ((this.codOrcCab == null && other.codOrcCab != null) || (this.codOrcCab != null && !this.codOrcCab.equals(other.codOrcCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.OrcCab[codOrcCab=" + codOrcCab + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
