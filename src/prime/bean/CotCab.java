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
@Table(name = "cot_cab", catalog = "siscomjava", schema = "")
@NamedQueries({@NamedQuery(name = "CotCab.findAll", query = "SELECT c FROM CotCab c"), @NamedQuery(name = "CotCab.findByCodCotCab", query = "SELECT c FROM CotCab c WHERE c.codCotCab = :codCotCab"), @NamedQuery(name = "CotCab.findByDataCotCat", query = "SELECT c FROM CotCab c WHERE c.dataCotCat = :dataCotCat"), @NamedQuery(name = "CotCab.findByForn1", query = "SELECT c FROM CotCab c WHERE c.forn1 = :forn1"), @NamedQuery(name = "CotCab.findByForn2", query = "SELECT c FROM CotCab c WHERE c.forn2 = :forn2"), @NamedQuery(name = "CotCab.findByForn3", query = "SELECT c FROM CotCab c WHERE c.forn3 = :forn3"), @NamedQuery(name = "CotCab.findByForn4", query = "SELECT c FROM CotCab c WHERE c.forn4 = :forn4"), @NamedQuery(name = "CotCab.findByForn5", query = "SELECT c FROM CotCab c WHERE c.forn5 = :forn5"), @NamedQuery(name = "CotCab.findByCondicoes1", query = "SELECT c FROM CotCab c WHERE c.condicoes1 = :condicoes1"), @NamedQuery(name = "CotCab.findByCondicoes2", query = "SELECT c FROM CotCab c WHERE c.condicoes2 = :condicoes2"), @NamedQuery(name = "CotCab.findByCondicoes3", query = "SELECT c FROM CotCab c WHERE c.condicoes3 = :condicoes3"), @NamedQuery(name = "CotCab.findByCondicoes4", query = "SELECT c FROM CotCab c WHERE c.condicoes4 = :condicoes4"), @NamedQuery(name = "CotCab.findByCondicoes5", query = "SELECT c FROM CotCab c WHERE c.condicoes5 = :condicoes5"), @NamedQuery(name = "CotCab.findByDesconto1", query = "SELECT c FROM CotCab c WHERE c.desconto1 = :desconto1"), @NamedQuery(name = "CotCab.findByDesconto2", query = "SELECT c FROM CotCab c WHERE c.desconto2 = :desconto2"), @NamedQuery(name = "CotCab.findByDesconto3", query = "SELECT c FROM CotCab c WHERE c.desconto3 = :desconto3"), @NamedQuery(name = "CotCab.findByDesconto4", query = "SELECT c FROM CotCab c WHERE c.desconto4 = :desconto4"), @NamedQuery(name = "CotCab.findByDesconto5", query = "SELECT c FROM CotCab c WHERE c.desconto5 = :desconto5"), @NamedQuery(name = "CotCab.findByEntrega1", query = "SELECT c FROM CotCab c WHERE c.entrega1 = :entrega1"), @NamedQuery(name = "CotCab.findByEntrega2", query = "SELECT c FROM CotCab c WHERE c.entrega2 = :entrega2"), @NamedQuery(name = "CotCab.findByEntrega3", query = "SELECT c FROM CotCab c WHERE c.entrega3 = :entrega3"), @NamedQuery(name = "CotCab.findByEntrega4", query = "SELECT c FROM CotCab c WHERE c.entrega4 = :entrega4"), @NamedQuery(name = "CotCab.findByEntrega5", query = "SELECT c FROM CotCab c WHERE c.entrega5 = :entrega5"), @NamedQuery(name = "CotCab.findByTotal1", query = "SELECT c FROM CotCab c WHERE c.total1 = :total1"), @NamedQuery(name = "CotCab.findByTotal2", query = "SELECT c FROM CotCab c WHERE c.total2 = :total2"), @NamedQuery(name = "CotCab.findByTotal3", query = "SELECT c FROM CotCab c WHERE c.total3 = :total3"), @NamedQuery(name = "CotCab.findByTotal4", query = "SELECT c FROM CotCab c WHERE c.total4 = :total4"), @NamedQuery(name = "CotCab.findByTotal5", query = "SELECT c FROM CotCab c WHERE c.total5 = :total5")})
public class CotCab implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_COT_CAB")
    private Integer codCotCab;
    @Column(name = "DATA_COT_CAT")
    @Temporal(TemporalType.DATE)
    private Date dataCotCat;
    @Column(name = "FORN1")
    private Integer forn1;
    @Column(name = "FORN2")
    private Integer forn2;
    @Column(name = "FORN3")
    private Integer forn3;
    @Column(name = "FORN4")
    private Integer forn4;
    @Column(name = "FORN5")
    private Integer forn5;
    @Column(name = "CONDICOES1")
    private String condicoes1;
    @Column(name = "CONDICOES2")
    private String condicoes2;
    @Column(name = "CONDICOES3")
    private String condicoes3;
    @Column(name = "CONDICOES4")
    private String condicoes4;
    @Column(name = "CONDICOES5")
    private String condicoes5;
    @Column(name = "DESCONTO1")
    private Double desconto1;
    @Column(name = "DESCONTO2")
    private Double desconto2;
    @Column(name = "DESCONTO3")
    private Double desconto3;
    @Column(name = "DESCONTO4")
    private Double desconto4;
    @Column(name = "DESCONTO5")
    private Double desconto5;
    @Column(name = "ENTREGA1")
    private String entrega1;
    @Column(name = "ENTREGA2")
    private String entrega2;
    @Column(name = "ENTREGA3")
    private String entrega3;
    @Column(name = "ENTREGA4")
    private String entrega4;
    @Column(name = "ENTREGA5")
    private String entrega5;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotCab")
    private List<CotDet> cotDetCollection;

    public CotCab() {
    }

    public CotCab(Integer codCotCab) {
        this.codCotCab = codCotCab;
    }

    public Integer getCodCotCab() {
        return codCotCab;
    }

    public void setCodCotCab(Integer codCotCab) {
        Integer oldCodCotCab = this.codCotCab;
        this.codCotCab = codCotCab;
        changeSupport.firePropertyChange("codCotCab", oldCodCotCab, codCotCab);
    }

    public Date getDataCotCat() {
        return dataCotCat;
    }

    public void setDataCotCat(Date dataCotCat) {
        Date oldDataCotCat = this.dataCotCat;
        this.dataCotCat = dataCotCat;
        changeSupport.firePropertyChange("dataCotCat", oldDataCotCat, dataCotCat);
    }

    public Integer getForn1() {
        return forn1;
    }

    public void setForn1(Integer forn1) {
        Integer oldForn1 = this.forn1;
        this.forn1 = forn1;
        changeSupport.firePropertyChange("forn1", oldForn1, forn1);
    }

    public Integer getForn2() {
        return forn2;
    }

    public void setForn2(Integer forn2) {
        Integer oldForn2 = this.forn2;
        this.forn2 = forn2;
        changeSupport.firePropertyChange("forn2", oldForn2, forn2);
    }

    public Integer getForn3() {
        return forn3;
    }

    public void setForn3(Integer forn3) {
        Integer oldForn3 = this.forn3;
        this.forn3 = forn3;
        changeSupport.firePropertyChange("forn3", oldForn3, forn3);
    }

    public Integer getForn4() {
        return forn4;
    }

    public void setForn4(Integer forn4) {
        Integer oldForn4 = this.forn4;
        this.forn4 = forn4;
        changeSupport.firePropertyChange("forn4", oldForn4, forn4);
    }

    public Integer getForn5() {
        return forn5;
    }

    public void setForn5(Integer forn5) {
        Integer oldForn5 = this.forn5;
        this.forn5 = forn5;
        changeSupport.firePropertyChange("forn5", oldForn5, forn5);
    }

    public String getCondicoes1() {
        return condicoes1;
    }

    public void setCondicoes1(String condicoes1) {
        String oldCondicoes1 = this.condicoes1;
        this.condicoes1 = condicoes1;
        changeSupport.firePropertyChange("condicoes1", oldCondicoes1, condicoes1);
    }

    public String getCondicoes2() {
        return condicoes2;
    }

    public void setCondicoes2(String condicoes2) {
        String oldCondicoes2 = this.condicoes2;
        this.condicoes2 = condicoes2;
        changeSupport.firePropertyChange("condicoes2", oldCondicoes2, condicoes2);
    }

    public String getCondicoes3() {
        return condicoes3;
    }

    public void setCondicoes3(String condicoes3) {
        String oldCondicoes3 = this.condicoes3;
        this.condicoes3 = condicoes3;
        changeSupport.firePropertyChange("condicoes3", oldCondicoes3, condicoes3);
    }

    public String getCondicoes4() {
        return condicoes4;
    }

    public void setCondicoes4(String condicoes4) {
        String oldCondicoes4 = this.condicoes4;
        this.condicoes4 = condicoes4;
        changeSupport.firePropertyChange("condicoes4", oldCondicoes4, condicoes4);
    }

    public String getCondicoes5() {
        return condicoes5;
    }

    public void setCondicoes5(String condicoes5) {
        String oldCondicoes5 = this.condicoes5;
        this.condicoes5 = condicoes5;
        changeSupport.firePropertyChange("condicoes5", oldCondicoes5, condicoes5);
    }

    public Double getDesconto1() {
        return desconto1;
    }

    public void setDesconto1(Double desconto1) {
        Double oldDesconto1 = this.desconto1;
        this.desconto1 = desconto1;
        changeSupport.firePropertyChange("desconto1", oldDesconto1, desconto1);
    }

    public Double getDesconto2() {
        return desconto2;
    }

    public void setDesconto2(Double desconto2) {
        Double oldDesconto2 = this.desconto2;
        this.desconto2 = desconto2;
        changeSupport.firePropertyChange("desconto2", oldDesconto2, desconto2);
    }

    public Double getDesconto3() {
        return desconto3;
    }

    public void setDesconto3(Double desconto3) {
        Double oldDesconto3 = this.desconto3;
        this.desconto3 = desconto3;
        changeSupport.firePropertyChange("desconto3", oldDesconto3, desconto3);
    }

    public Double getDesconto4() {
        return desconto4;
    }

    public void setDesconto4(Double desconto4) {
        Double oldDesconto4 = this.desconto4;
        this.desconto4 = desconto4;
        changeSupport.firePropertyChange("desconto4", oldDesconto4, desconto4);
    }

    public Double getDesconto5() {
        return desconto5;
    }

    public void setDesconto5(Double desconto5) {
        Double oldDesconto5 = this.desconto5;
        this.desconto5 = desconto5;
        changeSupport.firePropertyChange("desconto5", oldDesconto5, desconto5);
    }

    public String getEntrega1() {
        return entrega1;
    }

    public void setEntrega1(String entrega1) {
        String oldEntrega1 = this.entrega1;
        this.entrega1 = entrega1;
        changeSupport.firePropertyChange("entrega1", oldEntrega1, entrega1);
    }

    public String getEntrega2() {
        return entrega2;
    }

    public void setEntrega2(String entrega2) {
        String oldEntrega2 = this.entrega2;
        this.entrega2 = entrega2;
        changeSupport.firePropertyChange("entrega2", oldEntrega2, entrega2);
    }

    public String getEntrega3() {
        return entrega3;
    }

    public void setEntrega3(String entrega3) {
        String oldEntrega3 = this.entrega3;
        this.entrega3 = entrega3;
        changeSupport.firePropertyChange("entrega3", oldEntrega3, entrega3);
    }

    public String getEntrega4() {
        return entrega4;
    }

    public void setEntrega4(String entrega4) {
        String oldEntrega4 = this.entrega4;
        this.entrega4 = entrega4;
        changeSupport.firePropertyChange("entrega4", oldEntrega4, entrega4);
    }

    public String getEntrega5() {
        return entrega5;
    }

    public void setEntrega5(String entrega5) {
        String oldEntrega5 = this.entrega5;
        this.entrega5 = entrega5;
        changeSupport.firePropertyChange("entrega5", oldEntrega5, entrega5);
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

    public List<CotDet> getCotDetCollection() {
        return cotDetCollection;
    }

    public void setCotDetCollection(List<CotDet> cotDetCollection) {
        this.cotDetCollection = cotDetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCotCab != null ? codCotCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotCab)) {
            return false;
        }
        CotCab other = (CotCab) object;
        if ((this.codCotCab == null && other.codCotCab != null) || (this.codCotCab != null && !this.codCotCab.equals(other.codCotCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "siscom.bean.compras.CotCab[codCotCab=" + codCotCab + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
