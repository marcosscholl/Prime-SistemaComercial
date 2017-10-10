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
@Table(name = "req_det", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "ReqDet.findAll", query = "SELECT r FROM ReqDet r"),
@NamedQuery(name = "ReqDet.findByCodProduto", query = "SELECT r FROM ReqDet r WHERE r.reqDetPK.codProduto = :codProduto"),
@NamedQuery(name = "ReqDet.findByCodReqCab", query = "SELECT r FROM ReqDet r WHERE r.reqDetPK.codReqCab = :codReqCab"),
@NamedQuery(name = "ReqDet.findByQtdeReqDet", query = "SELECT r FROM ReqDet r WHERE r.qtdeReqDet = :qtdeReqDet"),
@NamedQuery(name = "ReqDet.findByVlrUnitReqDet", query = "SELECT r FROM ReqDet r WHERE r.vlrUnitReqDet = :vlrUnitReqDet"),
@NamedQuery(name = "ReqDet.findByVlrTotalReqDet", query = "SELECT r FROM ReqDet r WHERE r.vlrTotalReqDet = :vlrTotalReqDet"),
@NamedQuery(name = "ReqDet.findByFlag", query = "SELECT r FROM ReqDet r WHERE r.flag = :flag")})
public class ReqDet implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReqDetPK reqDetPK;
    @Column(name = "QTDE_REQ_DET")
    private Integer qtdeReqDet;
    @Column(name = "VLR_UNIT_REQ_DET")
    private Double vlrUnitReqDet;
    @Column(name = "VLR_TOTAL_REQ_DET")
    private Double vlrTotalReqDet;
    @Column(name = "FLAG")
    private Character flag;
    @JoinColumn(name = "COD_REQ_CAB", referencedColumnName = "COD_REQ_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReqCab reqCab;

    public ReqDet() {
    }

    public ReqDet(ReqDetPK reqDetPK) {
        this.reqDetPK = reqDetPK;
    }

    public ReqDet(String codProduto, int codReqCab) {
        this.reqDetPK = new ReqDetPK(codProduto, codReqCab);
    }

    public ReqDetPK getReqDetPK() {
        return reqDetPK;
    }

    public void setReqDetPK(ReqDetPK reqDetPK) {
        this.reqDetPK = reqDetPK;
    }

    public Integer getQtdeReqDet() {
        return qtdeReqDet;
    }

    public void setQtdeReqDet(Integer qtdeReqDet) {
        Integer oldQtdeReqDet = this.qtdeReqDet;
        this.qtdeReqDet = qtdeReqDet;
        changeSupport.firePropertyChange("qtdeReqDet", oldQtdeReqDet, qtdeReqDet);
    }

    public Double getVlrUnitReqDet() {
        return vlrUnitReqDet;
    }

    public void setVlrUnitReqDet(Double vlrUnitReqDet) {
        Double oldVlrUnitReqDet = this.vlrUnitReqDet;
        this.vlrUnitReqDet = vlrUnitReqDet;
        changeSupport.firePropertyChange("vlrUnitReqDet", oldVlrUnitReqDet, vlrUnitReqDet);
    }

    public Double getVlrTotalReqDet() {
        return vlrTotalReqDet;
    }

    public void setVlrTotalReqDet(Double vlrTotalReqDet) {
        Double oldVlrTotalReqDet = this.vlrTotalReqDet;
        this.vlrTotalReqDet = vlrTotalReqDet;
        changeSupport.firePropertyChange("vlrTotalReqDet", oldVlrTotalReqDet, vlrTotalReqDet);
    }

    public Character getFlag() {
        return flag;
    }

    public void setFlag(Character flag) {
        Character oldFlag = this.flag;
        this.flag = flag;
        changeSupport.firePropertyChange("flag", oldFlag, flag);
    }

    public ReqCab getReqCab() {
        return reqCab;
    }

    public void setReqCab(ReqCab reqCab) {
        ReqCab oldReqCab = this.reqCab;
        this.reqCab = reqCab;
        changeSupport.firePropertyChange("reqCab", oldReqCab, reqCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reqDetPK != null ? reqDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReqDet)) {
            return false;
        }
        ReqDet other = (ReqDet) object;
        if ((this.reqDetPK == null && other.reqDetPK != null) || (this.reqDetPK != null && !this.reqDetPK.equals(other.reqDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.ReqDet[reqDetPK=" + reqDetPK + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
