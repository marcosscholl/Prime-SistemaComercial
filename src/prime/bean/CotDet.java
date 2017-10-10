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
@Table(name = "cot_det", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "CotDet.findAll", query = "SELECT c FROM CotDet c"), @NamedQuery(name = "CotDet.findByCodCotCab", query = "SELECT c FROM CotDet c WHERE c.cotDetPK.codCotCab = :codCotCab"), @NamedQuery(name = "CotDet.findByCodProduto", query = "SELECT c FROM CotDet c WHERE c.cotDetPK.codProduto = :codProduto"), @NamedQuery(name = "CotDet.findByCodReqCab", query = "SELECT c FROM CotDet c WHERE c.cotDetPK.codReqCab = :codReqCab"), @NamedQuery(name = "CotDet.findByQtdeCotDet", query = "SELECT c FROM CotDet c WHERE c.qtdeCotDet = :qtdeCotDet"), @NamedQuery(name = "CotDet.findByUnit1", query = "SELECT c FROM CotDet c WHERE c.unit1 = :unit1"), @NamedQuery(name = "CotDet.findByUnit2", query = "SELECT c FROM CotDet c WHERE c.unit2 = :unit2"), @NamedQuery(name = "CotDet.findByUnit3", query = "SELECT c FROM CotDet c WHERE c.unit3 = :unit3"), @NamedQuery(name = "CotDet.findByUnit4", query = "SELECT c FROM CotDet c WHERE c.unit4 = :unit4"), @NamedQuery(name = "CotDet.findByUnit5", query = "SELECT c FROM CotDet c WHERE c.unit5 = :unit5"), @NamedQuery(name = "CotDet.findByTotal1", query = "SELECT c FROM CotDet c WHERE c.total1 = :total1"), @NamedQuery(name = "CotDet.findByTotal2", query = "SELECT c FROM CotDet c WHERE c.total2 = :total2"), @NamedQuery(name = "CotDet.findByTotal3", query = "SELECT c FROM CotDet c WHERE c.total3 = :total3"), @NamedQuery(name = "CotDet.findByTotal4", query = "SELECT c FROM CotDet c WHERE c.total4 = :total4"), @NamedQuery(name = "CotDet.findByTotal5", query = "SELECT c FROM CotDet c WHERE c.total5 = :total5")})
public class CotDet implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CotDetPK cotDetPK;
    @Column(name = "QTDE_COT_DET")
    private Integer qtdeCotDet;
    @Column(name = "UNIT1")
    private Double unit1;
    @Column(name = "UNIT2")
    private Double unit2;
    @Column(name = "UNIT3")
    private Double unit3;
    @Column(name = "UNIT4")
    private Double unit4;
    @Column(name = "UNIT5")
    private Double unit5;
    @Column(name = "TOTAL1")
    private Double total1;
    @Column(name = "TOTAL2")
    private Double total2;
    @Column(name = "TOTAL3")
    private Double total3;
    @Column(name = "TOTAL4")
    private Double total4;
    @Column(name = "TOTAL5")
    private Double total5;
    @JoinColumn(name = "COD_COT_CAB", referencedColumnName = "COD_COT_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CotCab cotCab;

    public CotDet() {
    }

    public CotDet(CotDetPK cotDetPK) {
        this.cotDetPK = cotDetPK;
    }

    public CotDet(int codCotCab, String codProduto, int codReqCab) {
        this.cotDetPK = new CotDetPK(codCotCab, codProduto, codReqCab);
    }

    public CotDetPK getCotDetPK() {
        return cotDetPK;
    }

    public void setCotDetPK(CotDetPK cotDetPK) {
        this.cotDetPK = cotDetPK;
    }

    public Integer getQtdeCotDet() {
        return qtdeCotDet;
    }

    public void setQtdeCotDet(Integer qtdeCotDet) {
        Integer oldQtdeCotDet = this.qtdeCotDet;
        this.qtdeCotDet = qtdeCotDet;
        changeSupport.firePropertyChange("qtdeCotDet", oldQtdeCotDet, qtdeCotDet);
    }

    public Double getUnit1() {
        return unit1;
    }

    public void setUnit1(Double unit1) {
        Double oldUnit1 = this.unit1;
        this.unit1 = unit1;
        changeSupport.firePropertyChange("unit1", oldUnit1, unit1);
    }

    public Double getUnit2() {
        return unit2;
    }

    public void setUnit2(Double unit2) {
        Double oldUnit2 = this.unit2;
        this.unit2 = unit2;
        changeSupport.firePropertyChange("unit2", oldUnit2, unit2);
    }

    public Double getUnit3() {
        return unit3;
    }

    public void setUnit3(Double unit3) {
        Double oldUnit3 = this.unit3;
        this.unit3 = unit3;
        changeSupport.firePropertyChange("unit3", oldUnit3, unit3);
    }

    public Double getUnit4() {
        return unit4;
    }

    public void setUnit4(Double unit4) {
        Double oldUnit4 = this.unit4;
        this.unit4 = unit4;
        changeSupport.firePropertyChange("unit4", oldUnit4, unit4);
    }

    public Double getUnit5() {
        return unit5;
    }

    public void setUnit5(Double unit5) {
        Double oldUnit5 = this.unit5;
        this.unit5 = unit5;
        changeSupport.firePropertyChange("unit5", oldUnit5, unit5);
    }

    public Double getTotal1() {
        return total1;
    }

    public void setTotal1(Double total1) {
        Double oldTotal1 = this.total1;
        this.total1 = total1;
        changeSupport.firePropertyChange("total1", oldTotal1, total1);
    }

    public Double getTotal2() {
        return total2;
    }

    public void setTotal2(Double total2) {
        Double oldTotal2 = this.total2;
        this.total2 = total2;
        changeSupport.firePropertyChange("total2", oldTotal2, total2);
    }

    public Double getTotal3() {
        return total3;
    }

    public void setTotal3(Double total3) {
        Double oldTotal3 = this.total3;
        this.total3 = total3;
        changeSupport.firePropertyChange("total3", oldTotal3, total3);
    }

    public Double getTotal4() {
        return total4;
    }

    public void setTotal4(Double total4) {
        Double oldTotal4 = this.total4;
        this.total4 = total4;
        changeSupport.firePropertyChange("total4", oldTotal4, total4);
    }

    public Double getTotal5() {
        return total5;
    }

    public void setTotal5(Double total5) {
        Double oldTotal5 = this.total5;
        this.total5 = total5;
        changeSupport.firePropertyChange("total5", oldTotal5, total5);
    }

    public CotCab getCotCab() {
        return cotCab;
    }

    public void setCotCab(CotCab cotCab) {
        CotCab oldCotCab = this.cotCab;
        this.cotCab = cotCab;
        changeSupport.firePropertyChange("cotCab", oldCotCab, cotCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotDetPK != null ? cotDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotDet)) {
            return false;
        }
        CotDet other = (CotDet) object;
        if ((this.cotDetPK == null && other.cotDetPK != null) || (this.cotDetPK != null && !this.cotDetPK.equals(other.cotDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.CotDet[cotDetPK=" + cotDetPK + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
