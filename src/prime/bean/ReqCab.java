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
@Table(name = "req_cab", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "ReqCab.findAll", query = "SELECT r FROM ReqCab r"), @NamedQuery(name = "ReqCab.findByCodReqCab", query = "SELECT r FROM ReqCab r WHERE r.codReqCab = :codReqCab"), @NamedQuery(name = "ReqCab.findByCodFuncionario", query = "SELECT r FROM ReqCab r WHERE r.codFuncionario = :codFuncionario"), @NamedQuery(name = "ReqCab.findByDataReqCab", query = "SELECT r FROM ReqCab r WHERE r.dataReqCab = :dataReqCab")})
public class ReqCab implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_REQ_CAB")
    private Integer codReqCab;
    @Column(name = "COD_FUNCIONARIO")
    private Integer codFuncionario;
    @Column(name = "DATA_REQ_CAB")
    @Temporal(TemporalType.DATE)
    private Date dataReqCab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reqCab")
    private List<ReqDet> reqDetCollection;

    public ReqCab() {
    }

    public ReqCab(Integer codReqCab) {
        this.codReqCab = codReqCab;
    }

    public Integer getCodReqCab() {
        return codReqCab;
    }

    public void setCodReqCab(Integer codReqCab) {
        Integer oldCodReqCab = this.codReqCab;
        this.codReqCab = codReqCab;
        changeSupport.firePropertyChange("codReqCab", oldCodReqCab, codReqCab);
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        Integer oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    public Date getDataReqCab() {
        return dataReqCab;
    }

    public void setDataReqCab(Date dataReqCab) {
        Date oldDataReqCab = this.dataReqCab;
        this.dataReqCab = dataReqCab;
        changeSupport.firePropertyChange("dataReqCab", oldDataReqCab, dataReqCab);
    }

    public List<ReqDet> getReqDetCollection() {
        return reqDetCollection;
    }

    public void setReqDetCollection(List<ReqDet> reqDetCollection) {
        this.reqDetCollection = reqDetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codReqCab != null ? codReqCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReqCab)) {
            return false;
        }
        ReqCab other = (ReqCab) object;
        if ((this.codReqCab == null && other.codReqCab != null) || (this.codReqCab != null && !this.codReqCab.equals(other.codReqCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.ReqCab[codReqCab=" + codReqCab + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
